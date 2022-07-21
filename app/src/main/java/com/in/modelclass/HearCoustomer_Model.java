package com.in.modelclass;

public class HearCoustomer_Model {

    int image;
    String coustomerName,coustomerStatues,customerdesc;

    public HearCoustomer_Model(int image, String coustomerName, String coustomerStatues, String customerdesc) {
        this.image = image;
        this.coustomerName = coustomerName;
        this.coustomerStatues = coustomerStatues;
        this.customerdesc = customerdesc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCoustomerName() {
        return coustomerName;
    }

    public void setCoustomerName(String coustomerName) {
        this.coustomerName = coustomerName;
    }

    public String getCoustomerStatues() {
        return coustomerStatues;
    }

    public void setCoustomerStatues(String coustomerStatues) {
        this.coustomerStatues = coustomerStatues;
    }

    public String getCustomerdesc() {
        return customerdesc;
    }

    public void setCustomerdesc(String customerdesc) {
        this.customerdesc = customerdesc;
    }
}
