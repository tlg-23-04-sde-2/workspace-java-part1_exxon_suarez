/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package gov.irs;

/**
 * An argument can be made that the tax rate constants are better defined
 * on the classes that use them, and not all lumped in here.
 * 
 * We've decided that, since these are federally mandated tax rates, they 
 * are better left here.  This bends cohesion a bit, but strengthens open-closed:
 *   If the IRS were to change tax rates, we would only need to change that here.
 */
public interface TaxPayer {
    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;
    
    public void payTaxes();                             // Abstract method - IS-A class defines how they payTaxes

    default public void fileReturn(){     // Default method wrote it like this to avoid breaking other classes -
                                        // if classes don't define how they fileReturn() with override method then this functionality is the default
        System.out.println("Return filed by U.S. MAIL");
    }
}