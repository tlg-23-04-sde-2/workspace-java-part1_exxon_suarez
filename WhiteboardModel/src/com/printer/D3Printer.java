package com.printer;/*
 * business class ( system class )
 */

// imports
import java.time.LocalDate;


public class D3Printer {
    // instance variables or fields ( properties )
    private D3Type printerType = D3Type.FDM;
    private LocalDate prodDate;
    private String brand = "Unknown";
    private String color = "Black";
    private boolean hasAutoLevel = false;
    private double price = 300.50;

    // constructors

    // constructor for clients args java file
    public D3Printer(D3Type printerType, String brand, LocalDate prodDate) {
        this.printerType = printerType;
        setBrand(brand);
        setProdDate(prodDate);

    }


    public D3Printer( D3Type printerType,String brand, String color, boolean hasAutoLevel, double price, LocalDate prodDate) {
        this.printerType = printerType;
        setBrand(brand);
        setColor(color);
        setHasAutoLevel(hasAutoLevel);
        setPrice(price);
        setProdDate(prodDate);
    }

    // accessor (get/set) methods - these provide "controlled access" to the objects fields

    public D3Type getPrinterType() {
        return printerType;
    }

    public void setPrinterType(D3Type printerType) {
        this.printerType = printerType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasAutoLevel() {
        return hasAutoLevel;
    }

    public void setHasAutoLevel(boolean hasAutoLevel) {
        this.hasAutoLevel = hasAutoLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getProdDate() {
        return prodDate;
    }

    public void setProdDate(LocalDate prodDate) {
        this.prodDate = prodDate;

    }

    //business methods or operations

    void startPrint() {
        System.out.println(" Your print has started ");
    }

    void pausePrint() {
        System.out.println(" Your print is paused ");
    }

    void replaceNozzle() {
        System.out.println(" Extruder is in position...please replace nozzle now ");
    }

    public void printerInformation() {
        System.out.println(" Type: " + getPrinterType() + " Brand:" + brand + " Printer-Color: " + color + " Printer-Price: " + "$" + price + " Auto-Level: " + hasAutoLevel + " Production date: " + getProdDate());
    }

    //toString method for the 3 argument constructor in D3PrinterClientArgs java file
    public String toString() {

        return  "Printer type: " + getPrinterType() + " Brand: " + brand + " Production date: " + getProdDate();
    }




}