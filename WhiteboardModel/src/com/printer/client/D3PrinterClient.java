package com.printer.client;/*
 * Client side main class to create a few instances of D3Printer
 *
 */

import com.printer.D3Printer;
import com.printer.D3Type;

import java.time.LocalDate;

class D3PrinterClient {

    public static void main(String[] args) {

        //creating new instances of D3Printer

        D3Printer printerLion = new D3Printer(D3Type.SLS,"Prusa", "orange", false, 300, LocalDate.of(1990,1,5));


        D3Printer printerDragon = new D3Printer(D3Type.MJF, "Mingda", "Blue", true, 500, LocalDate.of(2014, 6, 25));

        D3Printer printerPanther = new D3Printer(D3Type.FDM, "Tronyx", "Pink", true, 900, LocalDate.of(2021, 2, 10));


        // Calling methods on new instances of D3Printer
        printerDragon.printerInformation();

        System.out.println("*********");

        printerLion.printerInformation();

        System.out.println("*********");

        printerPanther.printerInformation();

    }

}