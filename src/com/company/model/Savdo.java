package com.company.model;

public class Savdo{
    private String produktName;
    private String salerName;
    private String clentName;
    private float price;
    private float miqdori;

    public Savdo(String produktName, String salerName, String clentName,float price, float miqdori) {
        this.produktName = produktName;
        this.salerName = salerName;
        this.clentName = clentName;
        this.price= price;
        this.miqdori = miqdori;
    }

    public Savdo() {
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public String getClentName() {
        return clentName;
    }

    public void setClentName(String clentName) {
        this.clentName = clentName;
    }

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}

    public float getMiqdori() {
        return miqdori;
    }

    public void setMiqdori(float miqdori) {
        this.miqdori = miqdori;
    }


    public void  showwww() {
        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println("              CHECK              ");
        System.out.println("---------------------------------");
        System.out.println(" Clent: " + clentName);
        System.out.println(" Saler: " + salerName);
        System.out.println(" Product: " + produktName);
        System.out.println(" Price: " + price);
        System.out.println(" Amount: " + miqdori);
        System.out.println(" Total: " + miqdori*price);
        System.out.println("---------------------------------");
        System.out.println("   Thank you for your purchase   ");
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println();

    }
}
