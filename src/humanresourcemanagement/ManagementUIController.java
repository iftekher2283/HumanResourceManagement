/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresourcemanagement;

import Hibernate.HibernateSingleton;
import ModelClasses.Employee;
import ModelClasses.SalaryDetails;
import enums.BankCode;
import enums.BloodGroup;
import enums.BranchID;
import enums.DepartmentCode;
import enums.Designation;
import enums.Gender;
import enums.MaritalStatus;
import enums.Religion;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author iftekher
 */
public class ManagementUIController implements Initializable {
    @FXML
    private ComboBox<Integer> companyNoBox;
    @FXML
    private ComboBox<Designation> designationBox;
    @FXML
    private ComboBox<DepartmentCode> deptCodeBox;
    @FXML
    private ComboBox<Gender> genderBox;
    @FXML
    private ComboBox<BranchID> branchIDBox;
    @FXML
    private DatePicker confirmationDatePicker;
    @FXML
    private DatePicker joiningDatePicker;
    @FXML
    private TextField employeeNameField;
    @FXML
    private TextField idNoField;
    @FXML
    private TextField grossSalaryField;
    @FXML
    private TextField basicSalaryField;
    @FXML
    private TextField houseRentField;
    @FXML
    private TextField runningBasicField;
    @FXML
    private TextField medicalAllowField;
    @FXML
    private TextField othersAllowField;
    @FXML
    private TextField conveyanceField;
    @FXML
    private TextField carAllowField;
    @FXML
    private TextField accountNoField;
    @FXML
    private ComboBox<BankCode> bankCodeBox;
    @FXML
    private TextField fathersNameField;
    @FXML
    private TextField mothersNameField;
    @FXML
    private TextField presHouseNoField;
    @FXML
    private TextField presRoadNoField;
    @FXML
    private TextField presVillageField;
    @FXML
    private TextField presPOField;
    @FXML
    private TextField presPSField;
    @FXML
    private TextField presDistField;
    @FXML
    private TextField presPhnField;
    @FXML
    private TextField educationalQualificationField;
    @FXML
    private TextField technicalQualificationField;
    @FXML
    private TextField nationalIdNoField;
    @FXML
    private TextField mobileNoField;
    @FXML
    private TextField birthPlaceField;
    @FXML
    private TextField tinNoField;
    @FXML
    private TextField emailAddressField;
    @FXML
    private TextField passportNoField;
    @FXML
    private TextField emergencyContNo;
    @FXML
    private TextField permHouseNoField;
    @FXML
    private TextField permRoadNoField;
    @FXML
    private TextField permVillageField;
    @FXML
    private TextField permPOField;
    @FXML
    private TextField permPSField;
    @FXML
    private TextField permDistField;
    @FXML
    private TextField permPhnField;
    @FXML
    private ComboBox<Religion> religionBox;
    @FXML
    private ComboBox<MaritalStatus> maritalStatusBox;
    @FXML
    private ComboBox<BloodGroup> bloodGroupBox;
    @FXML
    private TextField ageField;
    @FXML
    private TextField spouseField;
    @FXML
    private TextField nationalityField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    @FXML
    private TextField childrenField;
    @FXML
    private TextField birthDateField;
    @FXML
    private TextField birthMonthField;
    @FXML
    private TextField birthYearField;
    @FXML
    private TableView<Employee> employeeViewTable;
    @FXML
    private TableColumn<Employee, Number> employeeIdColumn;
    @FXML
    private TableColumn<Employee, String> employeeNameColumn;
    @FXML
    private TableColumn<Employee, String> employeeSexColumn;
    @FXML
    private TableColumn<Employee, Number> employeeCompanyNoColumn;
    @FXML
    private TableColumn<Employee, String> deptCodeColumn;
    @FXML
    private TableColumn<Employee, String> branchIdColumn;
    @FXML
    private TableColumn<Employee, String> joiningDateColumn;
    @FXML
    private TableColumn<Employee, String> employeeDesignationColumn;
    @FXML
    private Text hrmIdText;
    @FXML
    private TableView<SalaryDetails> salaryDetailsTable;
    @FXML
    private TableColumn<SalaryDetails, Number> employeeIdSalaryDetailsColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> basicSalaryColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> runningBasicColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> houseRentColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> medicalColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> otherColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> conveyanceColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> carAllowColumn;
    @FXML
    private TableColumn<SalaryDetails, Number> grossSalaryColumn;
    @FXML
    private TableColumn<SalaryDetails, String> bankCodeColumn;
    @FXML
    private TableColumn<SalaryDetails, String> acNoColumn;
    @FXML
    private Text hrmIdText1;
    
    private ObservableList<Integer> companyNo;
    
    //List of All Employess
    List<Employee> employees;
    ObservableList<Employee> employeesTable;
    
    ObservableList<SalaryDetails> salaries;
    
   //Session Variables to Access Hibernate
    private static SessionFactory factory;
    private static Session session;
    
    //Global Employee Variables
    //Basic Info Variables
    private int id;
    private String name;
    private int company_no;
    private String designation;
    private String confirmation_date;
    private String dept_code;
    private String joining_date;
    private String sex;
    private String branch_id;
    
    //Salary Info Variables;
    private double basic_salary;
    private String bank_code;
    private String ac_no;
    
    //Personal Info Variables;
    //Basic Info
    private String fathers_name;
    private String mothers_name;
    private String religion;
    private String marital_status;
    private String date_of_birth;
    private String spouse;
    private String blood_group;
    private String nationality;
    private double height;
    private double weight;
    private int children;
    
    //Other Info
    private String edu_quali;
    private String tech_quali;
    private String nid_no;
    private String mobile_no;
    private String birth_place;
    private String tin_no;
    private String email;
    private String passport_no;
    private String emer_cont_no;
    
    //Address Info
    //Present Address
    private String pres_house_no;
    private String pres_road_no;
    private String pres_village;
    private String pres_po;
    private String pres_ps;
    private String pres_dist;
    private String pres_phn;
    
    //Permanent Address
    private String perm_house_no;
    private String perm_road_no;
    private String perm_village;
    private String perm_po;
    private String perm_ps;
    private String perm_dist;
    private String perm_phn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadHibernate();
        setAllComboBoxValues();
        fetchAllEmployeeInfo();
        setAllEmployeeTableViewData();
        setAllEmployeeSalaryDetailsData();
    }    

    @FXML
    private void handleIDAction(ActionEvent event) {
    }

    @FXML
    private void handleSalaryAction(ActionEvent event) {
    }

    @FXML
    private void handleAgeAction(ActionEvent event) {
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
    }

    @FXML
    private void handleUpdateAction(ActionEvent event) {
    }

    @FXML
    private void handleRemoveAction(ActionEvent event) {
        
    }
    
    @FXML
    private void handleRefreshAction(ActionEvent event) {
        resetSceneInputs();
    }

    @FXML
    private void handleSelectEmployeeAction(MouseEvent event) {
    }

    @FXML
    private void handleSignOutAction(ActionEvent event) throws IOException {
        resetSceneInputs();
        returnToLoginPanel();
    }

    @FXML
    private void handleUpdateSalaryAction(MouseEvent event) {
    }
    
    private void loadHibernate(){
        factory = HibernateSingleton.getSessionFactory();
        session = factory.openSession();
    }
    
    private void setAllComboBoxValues(){
        companyNo = FXCollections.observableArrayList();
        companyNo.remove(0, companyNo.size());
        for (int i = 1; i <= 5; i++){
            companyNo.add(i);
        }
        companyNoBox.setItems(companyNo);
        designationBox.getItems().addAll(Designation.values());
        deptCodeBox.getItems().addAll(DepartmentCode.values());
        genderBox.getItems().addAll(Gender.values());
        branchIDBox.getItems().addAll(BranchID.values());
        bankCodeBox.getItems().addAll(BankCode.values());
        religionBox.getItems().addAll(Religion.values());
        maritalStatusBox.getItems().addAll(MaritalStatus.values());
        bloodGroupBox.getItems().addAll(BloodGroup.values());
    }
    
    private void fetchAllEmployeeInfo(){
        employees = new ArrayList<>();
        Transaction transaction = session.beginTransaction();
        try {
            employees = session.createCriteria(Employee.class).list();
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e);
            transaction.rollback();
        }
        session.close();
    }
    
    private void setAllEmployeeTableViewData(){
        employeesTable = FXCollections.observableArrayList();
        employeesTable.remove(0, (employeesTable.size() - 1));
        for (int i = 0; i < employees.size(); i++){
            employeesTable.add(employees.get(i));
        }
        employeeViewTable.setItems(employeesTable);
        employeeIdColumn.setCellValueFactory(d -> new SimpleIntegerProperty(d.getValue().getId()));
        employeeNameColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getName()));
        employeeSexColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getSex()));
        employeeCompanyNoColumn.setCellValueFactory(d -> new SimpleIntegerProperty(d.getValue().getCompanyNo()));
        deptCodeColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getDepartmentCode()));
        branchIdColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getBranchId()));
        joiningDateColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getJoiningDate()));
        employeeDesignationColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getDesignation()));
    }
    
    private void setAllEmployeeSalaryDetailsData(){
        salaries = FXCollections.observableArrayList();
        salaries.remove(0, (salaries.size() - 1));
        for (int i = 0; i < employees.size(); i++){
            SalaryDetails salaryDetails = new SalaryDetails(employees.get(i).getId(), employees.get(i).getSalaryInfo().getBasic_salary(), employees.get(i).getJoiningDate(), employees.get(i).getSalaryInfo().getBank_code(), employees.get(i).getSalaryInfo().getAc_no());
            salaries.add(salaryDetails);
        }
        salaryDetailsTable.setItems(salaries);
        employeeIdSalaryDetailsColumn.setCellValueFactory(d -> new SimpleIntegerProperty(d.getValue().getId()));
        basicSalaryColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getBasicSalary()));
        runningBasicColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getRunningBasic()));
        houseRentColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getHouseRent()));
        medicalColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getMedical()));
        otherColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getOthers()));
        conveyanceColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getConveyance()));
        carAllowColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getCarAllow()));
        grossSalaryColumn.setCellValueFactory(d -> new SimpleDoubleProperty(d.getValue().getGrossSalary()));
        bankCodeColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getBankCode()));
        acNoColumn.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getAcNo()));
    }
    
    private void returnToLoginPanel() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginUI.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
            
        HumanResourceManagement.getMainStage().setScene(scene);
        HumanResourceManagement.getMainStage().show();
    }
    
    private void readSceneInputs(){
        readBasicInfoFields();
        readSalaryInfoFields();
        readPersonalInfoFields();
        readAddressFields();
    }
    
    private void readBasicInfoFields(){
        id = Integer.parseInt(idNoField.getText());
        name = employeeNameField.getText();
        company_no = Integer.parseInt(companyNoBox.getSelectionModel().getSelectedItem() + "");
        designation = designationBox.getSelectionModel().getSelectedItem() + "";
        confirmation_date = confirmationDatePicker.getEditor().getText();
        dept_code = deptCodeBox.getSelectionModel().getSelectedItem() + "";
        joining_date = joiningDatePicker.getEditor().getText();
        sex = genderBox.getSelectionModel().getSelectedItem() + "";
        branch_id = branchIDBox.getSelectionModel().getSelectedItem() + "";       
    }
    
    private void readSalaryInfoFields(){
        basic_salary = Double.parseDouble(basicSalaryField.getText());
        bank_code = bankCodeBox.getSelectionModel().getSelectedItem() + "";
        ac_no = accountNoField.getText();
    }
    
    private void readPersonalInfoFields(){
        readBasicPersonalInfoFields();
        readOtherPersonalInfoFields();
        
    }
    
    private void readBasicPersonalInfoFields(){
        fathers_name = fathersNameField.getText();
        mothers_name = mothersNameField.getText();
        religion = religionBox.getSelectionModel().getSelectedItem() + "";
        marital_status = maritalStatusBox.getSelectionModel().getSelectedItem() + "";
        date_of_birth = birthDateField.getText() + "-" + birthMonthField.getText() + "-" + birthYearField.getText();
        spouse = spouseField.getText();
        blood_group = bloodGroupBox.getSelectionModel().getSelectedItem() + "";
        nationality = nationalityField.getText();
        height = Double.parseDouble(heightField.getText());
        weight = Double.parseDouble(weightField.getText());
        children = Integer.parseInt(childrenField.getText());
    }
    
    private void readOtherPersonalInfoFields(){
        edu_quali = educationalQualificationField.getText();
        tech_quali = technicalQualificationField.getText();
        nid_no = nationalIdNoField.getText();
        mobile_no = mobileNoField.getText();
        birth_place = birthPlaceField.getText();
        tin_no = tinNoField.getText();
        email = emailAddressField.getText();
        passport_no = passportNoField.getText();
        emer_cont_no = emergencyContNo.getText();
    }
    
    private void readAddressFields(){
        readPresentAddressFields();
        readPermanentAddressFields();
    }
    
    private void readPresentAddressFields(){
        pres_house_no = presHouseNoField.getText();
        pres_road_no = presRoadNoField.getText();
        pres_village = presVillageField.getText();
        pres_po = presPOField.getText();
        pres_ps = presPSField.getText();
        pres_dist = presDistField.getText();
        pres_phn = presPhnField.getText();
    }
    
    private void readPermanentAddressFields(){
        perm_house_no = permHouseNoField.getText();
        perm_road_no = permRoadNoField.getText();
        perm_village = permVillageField.getText();
        perm_po = permPOField.getText();
        perm_ps = permPSField.getText();
        perm_dist = permDistField.getText();
        perm_phn = permPhnField.getText();
    }

    private void resetSceneInputs(){
        resetBasicInfoFields();
        resetSalaryInfoFields();
        resetPersonalInfoFields();
        resetAddressFields();
    }
    
    private void resetBasicInfoFields(){
        idNoField.setText("");
        employeeNameField.setText("");
        companyNoBox.getSelectionModel().clearSelection();
        designationBox.getSelectionModel().clearSelection();
        confirmationDatePicker.getEditor().setText("");
        deptCodeBox.getSelectionModel().clearSelection();
        joiningDatePicker.getEditor().setText("");
        genderBox.getSelectionModel().clearSelection();
        branchIDBox.getSelectionModel().clearSelection();
    }
    
    private void resetSalaryInfoFields(){
        basicSalaryField.setText("");
        runningBasicField.setText("");
        houseRentField.setText("");
        medicalAllowField.setText("");
        othersAllowField.setText("");
        conveyanceField.setText("");
        carAllowField.setText("");
        grossSalaryField.setText("");
        bankCodeBox.getSelectionModel().clearSelection();
        accountNoField.setText("");
    }
    
    private void resetPersonalInfoFields(){
        resetBasicPersonalInfoFields();
        resetOtherPersonalInfoFields();
    }
    
    private void resetBasicPersonalInfoFields(){
        fathersNameField.setText("");
        mothersNameField.setText("");
        religionBox.getSelectionModel().clearSelection();
        maritalStatusBox.getSelectionModel().clearSelection();
        birthDateField.setText("");
        birthMonthField.setText("");
        birthYearField.setText("");
        ageField.setText("");
        spouseField.setText("");
        bloodGroupBox.getSelectionModel().clearSelection();
        nationalityField.setText("");
        heightField.setText("");
        weightField.setText("");
        childrenField.setText("");
    }
    
    private void resetOtherPersonalInfoFields(){
        educationalQualificationField.setText("");
        technicalQualificationField.setText("");
        nationalIdNoField.setText("");
        mobileNoField.setText("");
        birthPlaceField.setText("");
        tinNoField.setText("");
        emailAddressField.setText("");
        passportNoField.setText("");
        emergencyContNo.setText("");
    }
    
    private void resetAddressFields(){
        resetPresentAddressFields();
        resetPermanentAddressFields();
    }
    
    private void resetPresentAddressFields(){
        presHouseNoField.setText("");
        presRoadNoField.setText("");
        presVillageField.setText("");
        presPOField.setText("");
        presPSField.setText("");
        presDistField.setText("");
        presPhnField.setText("");
    }
    
    private void resetPermanentAddressFields(){
        permHouseNoField.setText("");
        permRoadNoField.setText("");
        permVillageField.setText("");
        permPOField.setText("");
        permPSField.setText("");
        permDistField.setText("");
        permPhnField.setText("");
    }
    
    public void setUsername(String username){
        hrmIdText.setText("HRM ID: " + username);
        hrmIdText1.setText("HRM ID: " + username);
    }
    
}
