package elgamal;
import java.util.*;
import java.math.*;

public class elgamal_encryption {
	
	// utilize Singleton Design Pattern so other classes
	// cannot have access to encryption methods/ code
	private static elgamal_encryption elgamalEncryption = new elgamal_encryption();
	
	public static elgamal_encryption getInstance(){
		return elgamalEncryption;
	}
	elgamal_encryption(){
		//default constructor
	}
	
	private	elgamal_encryption(int p, int a, int b, int k){
		// private para constructor, required for singleton
		// (initializes variables when we call class in main)
		this.p = p;
		this.a = a;
		this.b = b;
		this.k = k;
	}
	
	/*	p = large prime (in our case: with any p <= 100000)
		a = primitive root of p
		x = random int
		b = a^x (mod p) 
		k = key
	*/	
	
	int p,a,b,k;
	Random rand = new Random();
	
	void findPrimitiveRoot(int p){
		/*
		 * If p is a prime number, a primitive root mod p is a 
		 * number whose powers yield every nonzero residue mod p.
		 */
		
		
	}
	
	boolean isPrime(int x){
		if(x % 2 == 0){
			return false;
		}
		return true;
	}
	
	public int generateLargePrime(){
		int largePrime = 3;
		//random value <= 100000
		int  n = rand.nextInt(100000);
		
		//while int range is not exceeded multiply largePrime with random number
		//until prime returned
		while(largePrime <= 100000 && !isPrime(largePrime)){
			largePrime = largePrime * n;
			if(isPrime(largePrime)){
				return largePrime;
			}
		}
		return largePrime;
	}

	public int discreteLog() {
		return 0;
	}

	private int primitiveRoot(int largePrime) {
		int n = 0;
		int p = largePrime;

		double result1 = Math.pow(2,1 ) % p;
		double result2 = Math.pow(2,(p-1)) % p;

		//Checks if p is a valid primitive root
		if(result1 > 1 && result1 <= (p-1)) {
			if(result2 > 1 && result2 <= (p-1)) {
				result1 = result2;
			}
		}
		return (int) result1;
	}
	
}
