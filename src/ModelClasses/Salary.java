/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 *
 * @author iftekher
 */
@Embeddable
public class Salary {
    private double basic_salary;
    private String bank_code;
    private String ac_no;
    
    public Salary() {
    }
    
    public Salary(double basic_salary, String bank_code, String ac_no) {
        this.basic_salary = basic_salary;
        this.bank_code = bank_code;
        this.ac_no = ac_no;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public String getBank_code() {
        return bank_code;
    }

    public String getAc_no() {
        return ac_no;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public void setAc_no(String ac_no) {
        this.ac_no = ac_no;
    }

    @Override
    public String toString() {
        return "Salary{" + "basic_salary=" + basic_salary + ", bank_code=" + bank_code + ", ac_no=" + ac_no + '}';
    }
}
