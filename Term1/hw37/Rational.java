 // Soojin Choi
 // Contributors: Brandon Chong (pd2)
 // APCS1 pd02
 // HW37 -- Be More Rational
 // 2017-11-20 M
    
public class Rational{
    int numerator;
    int denominator;
    public Rational(){
	numerator = 0;
	denominator = 1;
    }
    public Rational(int num, int dem){
	this();// references default constructor
	if (dem != 0){ // Only changes the num and dem if the new denominator isnt 0
	    numerator = num;
	    denominator = dem;
	}
    }
    public String toString(){
	return " " + floatValue()  + "\t also known as " +numerator+" / "+denominator;  // returns the double value of the fraction created.
    }
    
    public double floatValue(){
	return (((double)numerator) / denominator);
    }

    public void multiply(Rational s){
	numerator = numerator * s.numerator; //multiply numerator with numerator
	denominator = denominator * s.denominator; //denominator and denominator
    }

    public void divide (Rational s){
	// System.out.println (floatValue()); For testing
	// System.out.println (s.floatValue()); For testing
	if ((floatValue() == 0) || (s.floatValue() == 0)){
	    numerator = 0;
	    denominator = 1;
	}
	else {
	numerator = numerator * s.denominator; //multiplying the numerator by denominator of the second number
	denominator = denominator * s.numerator;//multiply the numerator of the second number with the denominator of the first number
	}
    }

    public void add(Rational s){
	Rational multiplier = new Rational (s.denominator, s.denominator);
	int holder = denominator;
	multiply(multiplier);
	numerator = numerator + (holder * s.numerator);
    }

    public void subtract (Rational t){
		Rational holder = new Rational ((-1 * t.numerator), t.denominator); 
		this.add( holder ); // adds a negative version or the given Rational
    }

    public static int gcd(int a, int b){
 	int divisor = 1;
 	int MaxDivisor = 1;
 	if ((a == 0) || (b == 0)){
 	    return 0;}
 	else{
 	    while ((divisor <= a) || (divisor <= b)){
 		if (((a % divisor) == 0) && ((b % divisor) == 0)){
 		    MaxDivisor = divisor;
 		    divisor += 1;}
 		else{
 		    divisor += 1;
 		}}
 	    return MaxDivisor;}
     }
	
    public int gcd (){
	return gcd(numerator,denominator);
    }
	
	public void reduce(){
		numerator = numerator / gcd();
		denominator = denominator / gcd();
	}
	
	public int compareTo(Rational l){
		double num1 = floatValue();
		double num2 = l.floatValue();
		if (num1 != num2){
			if (num1 > num2){
				return 1;
			}
			else{
				return -1;
			}
		}
		else{
			return 0;
		}
	}
    
	public static void main(String [] args){
	Rational r = new Rational(2, 3);
	Rational s = new Rational(1, 2);
	System.out.println("The original rational number:"); 
	System.out.println("R = "+ r);
	System.out.println("S = "+ s);

	System.out.println("======== Multiply ========");
	//r.multiply(s);
	System.out.println("New result after multiplying R with S");
	System.out.println("R = "+ r);
	System.out.println("S = "+ s);

	System.out.println("======== Divide ========");
	//r.divide(s);
	System.out.println("New result after dividing R with S");
	System.out.println("R = "+ r);
	System.out.println("S = "+ s);

	System.out.println("======== Add ========");
	r.add(s);
	System.out.println("New result after adding R with S");
	System.out.println("R = "+ r);
	System.out.println("S = "+ s);

	System.out.println("======== Subtract ========");
	//r.subtract(s);
	System.out.println("New result after subtracting R with S");
	System.out.println("R = "+ r);
	System.out.println("S = "+ s);

	System.out.println("======== GCD ========");
	System.out.println(gcd(5,10) + " ... should return 5");
	System.out.println(r.gcd() + " ... should return 1");
	
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	t.reduce(); //Changes t to 2/9
	System.out.println("Reduced T: " + t);
	System.out.println(r.compareTo(r));// expecting 0
	System.out.println(r.compareTo(s));// expecting 1
	System.out.println(s.compareTo(r));// expecting -1
}
}
