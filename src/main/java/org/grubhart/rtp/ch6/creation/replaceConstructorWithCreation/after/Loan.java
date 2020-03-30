package org.grubhart.rtp.ch6.creation.replaceConstructorWithCreation.after;

import java.util.Date;

public class Loan {

    private double commitment;
    private int riskRating;
    private Date maturity;
    private Date expiry;
    private CapitalStrategy capitalStrategy;
    private double outstanding;

    public Loan(double commitment, int riskRating, Date maturity) {
        this(commitment, 0.00, riskRating, maturity, null);
    }

    public Loan(double commitment, int riskRating, Date maturity, Date expiry) {
        this(commitment, 0.00, riskRating, maturity, expiry);
    }

    public Loan(double commitment, double outstanding,
                int riskRating, Date maturity, Date expiry) {
        this(null, commitment, outstanding, riskRating, maturity, expiry);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment,
                int riskRating, Date maturity, Date expiry) {
        this(capitalStrategy, commitment, 0.00, riskRating, maturity, expiry);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
        this.commitment = commitment;
        this.riskRating = riskRating;
        this.maturity = maturity;
        this.expiry = expiry;
        this.outstanding = outstanding;
        this.capitalStrategy = capitalStrategy;

        if (capitalStrategy == null) {
            if (expiry == null)
                this.capitalStrategy = new CapitalStrategyTermLoan();
            else if (maturity == null)
                this.capitalStrategy = new CapitalStrategyRevolver();
            else
                this.capitalStrategy = new CapitalStrategyRCTL();
        }
    }
}
