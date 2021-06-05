/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author iftekher
 */
@Embeddable
public class PersonalInformation {
    private String fathersName;
    private String mothersName;
    private String dateOfBirth;
    private String nationality;
    private String birthPlace;
    private String bloodGroup;
    private String religion;
    private String maritalStatus;
    private String spouse;
    private int children;
    private double height;
    private double weight;
    private String eduQuali;
    private String techQuali;
    private String nidNo;
    private String passportNo;
    private String tinNo;
    private String email;
    private String mobileNo;
    private String emerContNo;

    public PersonalInformation() {
    }

    public PersonalInformation(String fathersName, String mothersName, String dateOfBirth, String nationality, String birthPlace, String bloodGroup, String religion, String maritalStatus, String spouse, int children, double height, double weight, String eduQuali, String techQuali, String nidNo, String passportNo, String tinNo, String email, String mobileNo, String emerContNo) {
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.birthPlace = birthPlace;
        this.bloodGroup = bloodGroup;
        this.religion = religion;
        this.maritalStatus = maritalStatus;
        this.spouse = spouse;
        this.children = children;
        this.height = height;
        this.weight = weight;
        this.eduQuali = eduQuali;
        this.techQuali = techQuali;
        this.nidNo = nidNo;
        this.passportNo = passportNo;
        this.tinNo = tinNo;
        this.email = email;
        this.mobileNo = mobileNo;
        this.emerContNo = emerContNo;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getReligion() {
        return religion;
    }
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getSpouse() {
        return spouse;
    }

    public int getChildren() {
        return children;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEduQuali() {
        return eduQuali;
    }

    public String getTechQuali() {
        return techQuali;
    }

    public String getNidNo() {
        return nidNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getTinNo() {
        return tinNo;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmerContNo() {
        return emerContNo;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.birthPlace = bloodGroup;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEduQuali(String eduQuali) {
        this.eduQuali = eduQuali;
    }

    public void setTechQuali(String techQuali) {
        this.techQuali = techQuali;
    }

    public void setNidNo(String nidNo) {
        this.nidNo = nidNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmerContNo(String emerContNo) {
        this.emerContNo = emerContNo;
    } 

    @Override
    public String toString() {
        return "PersonalInformation{" + "fathersName=" + fathersName + ", mothersName=" + mothersName + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + ", birthPlace=" + birthPlace + ", bloodGroup=" + bloodGroup + ", religion=" + religion + ", maritalStatus=" + maritalStatus + ", spouse=" + spouse + ", children=" + children + ", height=" + height + ", weight=" + weight + ", eduQuali=" + eduQuali + ", techQuali=" + techQuali + ", nidNo=" + nidNo + ", passportNo=" + passportNo + ", tinNo=" + tinNo + ", email=" + email + ", mobileNo=" + mobileNo + ", emerContNo=" + emerContNo + '}';
    }
    
}
