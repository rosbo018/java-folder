public class Rational{
	private int numer;
	private int denom;
	/**
	*@author Ryan Osborne
	*This program is an implementation of the rational number problem
	*
	**/
	public Rational(int num, int den){
	/**
	*@param int numerator
	*@param int denominator
	**/
	this.numer = num;//setting vars
	this.denom = den;
	reduce();//reducing the fraction
	}

	public Rational(int num){
	this.numer = num;//setting var
	this.denom = 1;//since no denom give, denom is 1
	}
	/**
	*@return the numerator 
	**/
	public int getNum(){
		return this.numer;//returns the number
	}
	/**
	*@return the denominator
	**/
	public int getDen(){
		return this.denom;
	}
	/**
	*@param other instance of rational
	*@return The sum of the current instances' value, and the other value
	**/
	public Rational sum (Rational other){
		Rational result = new Rational(((getNum()*other.getDen()) + (other.getNum()*getDen())), getDen()*other.getDen());
		// a/b + x/y = (a*y + x*b)/(b*y)
		return(result);
	}
	/**
	*@paraminstance of rational
	*@param instance of rational
	*@return The sum of the two instances values
	**/
	public Rational sum2 (Rational other1, Rational other2){
		Rational result = new Rational(((other1.getNum()*other2.getDen()) + (other2.getNum()*other1.getDen())), (other1.getDen()*other2.getDen()));
		return(result);
	}
	/**
	*@param int a 
	*@param int b can not be zero
	*@return returns the greatest common divisor of a and b
	**/
	private int greatestCommonDivisor(int a, int b){
		int remainder;// temp
		while (a % b != 0){//Euclid's algorithm
			remainder = a % b;
			a = b;
			b = remainder;
			//gcd(b, a % b)
		}
		return b;
	}
	/**
	* runs after the constructor, divides the Numerator and denominator by the greatest common divisor
	**/
	private void reduce(){
		int gDivisor = greatestCommonDivisor(this.numer, this.denom);//gets GCD
		this.numer /=gDivisor;//divides number by GCD
		this.denom /= gDivisor;
	}
	/**
	*@param Rational other
	*@return returns true if numerator = numerator, denominator = denominator, this works since fraction is always in simplified form
	**/
	public boolean equals(Rational other){
		return(this.getNum() == other.getNum() && this.getDen() == other.getDen());
	}
	/**
	*@return the custom string instead of pointer when printed
	**/
	public String toString(){
		return(this.getNum()+"/"+this.getDen());
	}
	/*
	public static void main(String[] args){
		Rational r1 = new Rational(13627812, 8);
		Rational r2 = new Rational(2, 7);
		Rational sum = r1.sum(r2);
		System.out.println(r1.getNum()+"/"+r1.getDen()+", "+ sum);
	}*/
}
