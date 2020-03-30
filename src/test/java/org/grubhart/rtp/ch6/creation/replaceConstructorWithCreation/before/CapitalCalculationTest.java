package org.grubhart.rtp.ch6.creation.replaceConstructorWithCreation.before;

import org.junit.Test;

import java.util.Date;

public class CapitalCalculationTest {

    @Test
    public void testTermLoanNoPayments(){

        double commitment =0;
        int riskRating = 0;
        Date maturity = new Date();

        Loan termLoan = new Loan(commitment, riskRating, maturity);
    }

    @Test
    public void testTermLoanOnePayments(){

        double commitment =0;
        int riskRating = 0;
        Date maturity = new Date();

        Loan termLoan = new Loan(commitment, riskRating, maturity);
    }

    @Test
    public void testTermLoanWithRiskAdjustedCapitalStrategy() {

        CapitalStrategy riskAdjustedCapitalStrategy = new CapitalStrategy();
        int commitment = 0;
        int outstanding =0;
        int riskRating = 0;
        Date maturity = new Date();
        Loan termLoan = new Loan( riskAdjustedCapitalStrategy, commitment, outstanding, riskRating, maturity, null);
    }
}
