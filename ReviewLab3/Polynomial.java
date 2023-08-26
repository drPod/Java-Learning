/**
 * @author (Darsh) 
 */
public class Polynomial
{
    // instance variables
    private Monomial firstTerm;
    private Monomial secondTerm;
    private Monomial thirdTerm;
    /**
     * Constructor for objects of class Polynomial
     */
    public Polynomial()
    {
        // initialise instance variables
        firstTerm = null;
        secondTerm = null;
        thirdTerm = null;
    }
    // Accessors
    public Monomial getfirstTerm() {
        return firstTerm;
    }
    public Monomial getsecondTerm() {
        return secondTerm;
    }
    public Monomial getthirdTerm() {
        return thirdTerm;
    }
    // Mutators
    public void setTerm(double coeff, int exp) {
        if (exp == 2) {
            
            firstTerm = new Monomial(coeff, exp);
            
        }
        if (exp == 1) {
        
            secondTerm = new Monomial(coeff, exp);
        
        }
        if (exp == 0) {
        
            thirdTerm = new Monomial(coeff, exp);
        
        }
    }
    
    public double evaluate(double x) {
    
        double temp = firstTerm.getCoefficent() * x * x;
        double temp2 = secondTerm.getCoefficent() * x;
        double temp3 = thirdTerm.getCoefficent();
        
        return temp + temp2 + temp3;
    
    }
    public String toString() {
    
        return firstTerm.getCoefficent() + "x^2" + " + " + secondTerm.getCoefficent() + "x" + " + " + thirdTerm.getCoefficent();
    
    }
}