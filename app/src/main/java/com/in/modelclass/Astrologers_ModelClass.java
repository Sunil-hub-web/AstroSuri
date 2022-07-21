package com.in.modelclass;

public class Astrologers_ModelClass {

    String name,speeklanguage,typeAstrologers,experience,regularPrice,salesPrice;

    public Astrologers_ModelClass(String name, String speeklanguage, String typeAstrologers,
                                  String experience, String regularPrice, String salesPrice) {
        this.name = name;
        this.speeklanguage = speeklanguage;
        this.typeAstrologers = typeAstrologers;
        this.experience = experience;
        this.regularPrice = regularPrice;
        this.salesPrice = salesPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeeklanguage() {
        return speeklanguage;
    }

    public void setSpeeklanguage(String speeklanguage) {
        this.speeklanguage = speeklanguage;
    }

    public String getTypeAstrologers() {
        return typeAstrologers;
    }

    public void setTypeAstrologers(String typeAstrologers) {
        this.typeAstrologers = typeAstrologers;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
    }
}
