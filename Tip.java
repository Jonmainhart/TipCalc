/*
 * Tip.java
 * 10 September 2020
 * Jonathan Mainhart - CMIS 242
 * Creates a Tip object. Accepts double mealCost and tipPercent args. Contains
 * method to return double tipAmount.
 */
package tipCalc;

/**
 *
 * @author jonmainhart
 */
public class Tip {
    
    private double mealCost;
    private double tipPercent;
    
    public Tip(double mealCost, double tipPercent) {
        this.mealCost = mealCost;
        this.tipPercent = tipPercent;
    
    } // end constructor
    
    public double getTipAmount() {
        double tipAmount = this.mealCost * this.tipPercent;
        return tipAmount;
    } // end getTipAmount
   
} // end Class
