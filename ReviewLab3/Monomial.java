/**
 * @author (Darsh) 
 */
public class Monomial
{
    // instance variables
    private double coefficent;
    private int exponent;

    /**
     * Constructor for objects of class Monomial
     */
    public Monomial() // default
    {
        // initialise instance variables
        coefficent = 1;
        exponent = 1;
    }
    public Monomial(double coeff, int exp)
    {
        coefficent = coeff;
        exponent = exp;
    }
    // accessors
    public double getCoefficent() {
        return coefficent;
    }
    public int getExponent() {
        return exponent;
    }
}