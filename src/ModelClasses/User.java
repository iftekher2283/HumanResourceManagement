/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author iftekher
 */
@Entity
@Table(name="tbl_users")
public class User {
    @Id
    private int sl;
    @Column(name="user_id")
    private String username;
    private String password;
    private int employeeId;

    public User() {
    }

    public User(String username, String password, int employeeId) {
       // this.sl = sl;
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
    }

    public int getSl() {
        return sl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "User{" + "sl=" + sl + ", employeeId=" + username + ", password=" + password + '}';
    }
    
}
