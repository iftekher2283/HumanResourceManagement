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
public class Address {
    private String presHouseNo;
    private String presRoadNo;
    private String presVillage;
    private String presPO;
    private String presPS;
    private String presDist;
    private String presPhn;
    private String permHouseNo;
    private String permRoadNo;
    private String permVillage;
    private String permPO;
    private String permPS;
    private String permDist;
    private String permPhn;

    public Address() {
    }

    public Address(String presHouseNo, String presRoadNo, String presVillage, String presPO, String presPS, String presDist, String presPhn, String permHouseNo, String permRoadNo, String permVillage, String permPO, String permPS, String permDist, String permPhn) {
        this.presHouseNo = presHouseNo;
        this.presRoadNo = presRoadNo;
        this.presVillage = presVillage;
        this.presPO = presPO;
        this.presPS = presPS;
        this.presDist = presDist;
        this.presPhn = presPhn;
        this.permHouseNo = permHouseNo;
        this.permRoadNo = permRoadNo;
        this.permVillage = permVillage;
        this.permPO = permPO;
        this.permPS = permPS;
        this.permDist = permDist;
        this.permPhn = permPhn;
    }

    public String getPresHouseNo() {
        return presHouseNo;
    }

    public String getPresRoadNo() {
        return presRoadNo;
    }

    public String getPresVillage() {
        return presVillage;
    }

    public String getPresPO() {
        return presPO;
    }

    public String getPresPS() {
        return presPS;
    }

    public String getPresDist() {
        return presDist;
    }

    public String getPresPhn() {
        return presPhn;
    }

    public String getPermHouseNo() {
        return permHouseNo;
    }

    public String getPermRoadNo() {
        return permRoadNo;
    }

    public String getPermVillage() {
        return permVillage;
    }

    public String getPermPO() {
        return permPO;
    }

    public String getPermPS() {
        return permPS;
    }

    public String getPermDist() {
        return permDist;
    }

    public String getPermPhn() {
        return permPhn;
    }

    public void setPresHouseNo(String presHouseNo) {
        this.presHouseNo = presHouseNo;
    }

    public void setPresRoadNo(String presRoadNo) {
        this.presRoadNo = presRoadNo;
    }

    public void setPresVillage(String presVillage) {
        this.presVillage = presVillage;
    }

    public void setPresPO(String presPO) {
        this.presPO = presPO;
    }

    public void setPresPS(String presPS) {
        this.presPS = presPS;
    }

    public void setPresDist(String presDist) {
        this.presDist = presDist;
    }

    public void setPresPhn(String presPhn) {
        this.presPhn = presPhn;
    }

    public void setPermHouseNo(String permHouseNo) {
        this.permHouseNo = permHouseNo;
    }

    public void setPermRoadNo(String permRoadNo) {
        this.permRoadNo = permRoadNo;
    }

    public void setPermVillage(String permVillage) {
        this.permVillage = permVillage;
    }

    public void setPermPO(String permPO) {
        this.permPO = permPO;
    }

    public void setPermPS(String permPS) {
        this.permPS = permPS;
    }

    public void setPermDist(String permDist) {
        this.permDist = permDist;
    }

    public void setPermPhn(String permPhn) {
        this.permPhn = permPhn;
    }

    @Override
    public String toString() {
        return "Address{" + "presHouseNo=" + presHouseNo + ", presRoadNo=" + presRoadNo + ", presVillage=" + presVillage + ", presPO=" + presPO + ", presPS=" + presPS + ", presDist=" + presDist + ", presPhn=" + presPhn + ", permHouseNo=" + permHouseNo + ", permRoadNo=" + permRoadNo + ", permVillage=" + permVillage + ", permPO=" + permPO + ", permPS=" + permPS + ", permDist=" + permDist + ", permPhn=" + permPhn + '}';
    }
    
}
