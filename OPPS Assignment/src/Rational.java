
 class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 2;
    }
    public Rational add(Rational r) {
        int  n = numerator * r.denominator + r.numerator * denominator;
        int d = denominator * r.denominator;
        return new Rational(n, d);
    }
    public Rational subtract(Rational r) {
        int n = numerator * r.denominator - r.numerator * denominator;
        int d = denominator  * r.denominator;
        return new Rational(n, d);
    }
    public Rational multiply(Rational r) {
        int n = numerator * r.numerator;
        int d = denominator * r.denominator;
        return  new Rational(n, d); 
    }
    public Rational divide(Rational r) {
        int n = numerator / r.numerator;
        int d = denominator / r.denominator;
        return new Rational(n, d);
    }
    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
   
    
}