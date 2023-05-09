package com.printer.client;

import com.printer.D3Printer;
import com.printer.D3Type;

import java.time.LocalDate;
import java.util.Arrays;


class D3PrinterClientArgs {
    public static void main(String[] args) {

        if (args.length < 3) {
            String usage = "Java D3PrinterClientArgs <printer type> <brand> <production date>";
            String example = "Java D3PrinterClientArgs <FDM> <Mingda> <2014-06-25>";
            String note1 = "Supported printer types are " + Arrays.toString(D3Type.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            return;
        }

        D3Type printerType = D3Type.valueOf(args[0]);
        String brand = args[1];
        LocalDate prodDate = LocalDate.parse(args[2]);

        D3Printer printer1 = new D3Printer(printerType, brand, prodDate);
        System.out.println("Your printer specs are as follows: " );
        System.out.println(printer1);



    }
}