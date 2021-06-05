/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresourcemanagement;

import Hibernate.HibernateSingleton;
import ModelClasses.User;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import md5.HashMD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author iftekher
 */
public class LoginUIController implements Initializable {
    
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Text loginMessageText;
    
    private SessionFactory factory;
    private Session session;
    
    private List<User> users;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        factory = HibernateSingleton.getSessionFactory();
        session = factory.openSession();
        users = new ArrayList<>();
        
        Transaction transaction = session.beginTransaction();
        try{
            users = session.createCriteria(User.class).list();
            transaction.commit();
        }catch(Exception e){
            System.out.println(e);
            transaction.rollback();
        }
        session.close();
    }    

    @FXML
    private void handleLoginAction(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        HashMD encPass = new HashMD(password);
        
        if (matchUser(username, encPass)){
            resetSceneInputs();
            loadManagementPanel(username);
        } else{
            returnToLoginPanel();
        }
    }
    
    private boolean matchUser(String username, HashMD encPass) throws IOException{
        boolean isMatched = false;
        
        for (User user : users) {
            
            isMatched = username.equals(user.getUsername()) && encPass.getHash().equals(user.getPassword());
        }
        
        return isMatched;
    }
    
    private void loadManagementPanel(String username) throws IOException{
        resetSceneInputs();
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ManagementUI.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
            
        HumanResourceManagement.getMainStage().setScene(scene);
        HumanResourceManagement.getMainStage().show();
        
        setHRManagerId(loader, username);
    }
    
    private void returnToLoginPanel(){
        loginMessageText.setText("Sorry! Username or Password didn't match");
    }
    
    private void resetSceneInputs(){
        usernameField.setText("");
        passwordField.setText("");
        
        loginMessageText.setText("");
    }
    
    private void setHRManagerId(FXMLLoader loader, String username){
        ManagementUIController managementPanel = loader.getController();
        managementPanel.setUsername(username);
    }
    
}
