package com.printer.test;

import com.printer.D3Printer;
import com.printer.D3Type;

import java.time.LocalDate;

class D3PrinterTestValidation {
    public static void main(String[] args) {
        // creating new instance of D3Printer class
        D3Printer printer1 = new D3Printer(D3Type.SLS, "PRUSA", LocalDate.of(2017, 02, 20)); // instantiating the new instance
                                                                                                                            // with the required parameters
                                                                                                                            //defined in the D3Printer class constructor

        D3Printer printer2 = new D3Printer(D3Type.FDM, "Mingda", "red", false, 500.0, LocalDate.of(2020, 07, 15));
        System.out.println("");
        System.out.println(" Your printer details are as follows: " + printer1);
        System.out.println("*****");

        printer2.printerInformation(); // calling the printerInformation method to print all parameters passed to printer2 instance of D3Printer

    }



}