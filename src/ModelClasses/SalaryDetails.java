/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author iftekher
 */
public class SalaryDetails {
    private int id;
    private double basicSalary;
    private double runningBasic;
    private double houseRent;
    private double medical;
    private double others;
    private double conveyance;
    private double carAllow;
    private double grossSalary;
    private String bankCode;
    private String acNo;

    public SalaryDetails() {
    }

    public SalaryDetails(int id, double basicSalary, String joiningDate, String bankCode, String acNo) {
        this.id = id;
        this.basicSalary = basicSalary;
        String join_date = joiningDate;
        String join_date_tokens[] = join_date.split("/");
        int join_year = Integer.parseInt(join_date_tokens[2]);
        int join_month = Integer.parseInt(join_date_tokens[1]);
        Date get_year = new Date();
        SimpleDateFormat years = new SimpleDateFormat("yyyy");
        int pres_year = Integer.parseInt(years.format(get_year));
        Date get_months = new Date();
        SimpleDateFormat months = new SimpleDateFormat("MM");
        int pres_month = Integer.parseInt(months.format(get_months));
        int job_years = 0;
        if(join_month > pres_month){
            job_years = pres_year - (join_year + 1);
        }
        else{
            job_years = pres_year - join_year;
        }

        double running_basic = 0;
        if(job_years > 0){
            running_basic = basicSalary + (basicSalary * job_years  * (5.0 / 100));
        }
        else{
            running_basic = basicSalary;
        }
        double house_rent = (running_basic * 40) / 100;
        double medical_allow = (running_basic * 10) / 100;
        double others_allow = (running_basic * 5) / 100;
        double salary_conveyance = (running_basic * 5) / 100;
        double car_allow = (running_basic * 10) / 100;
        double gross_salary = running_basic + house_rent + medical + others + conveyance + car_allow;
        this.runningBasic = running_basic;
        this.houseRent = house_rent;
        this.medical = medical_allow;
        this.others = others_allow;
        this.conveyance = salary_conveyance;
        this.carAllow = car_allow;
        this.grossSalary = gross_salary;
        this.bankCode = bankCode;
        this.acNo = acNo;
    }

    public int getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getRunningBasic() {
        return runningBasic;
    }

    public double getHouseRent() {
        return houseRent;
    }

    public double getMedical() {
        return medical;
    }

    public double getOthers() {
        return others;
    }

    public double getConveyance() {
        return conveyance;
    }

    public double getCarAllow() {
        return carAllow;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getAcNo() {
        return acNo;
    }
}
