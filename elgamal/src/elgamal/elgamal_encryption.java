package elgamal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.math.*;

public class Elgamal_encryption {
	
	// utilize Singleton Design Pattern so other classes
	// cannot have access to encryption methods/ code
	private static Elgamal_encryption elgamalEncryption;
	
	public static Elgamal_encryption getInstance(){
		
		if (elgamalEncryption == null){
			elgamalEncryption = new Elgamal_encryption();
		}
		return elgamalEncryption;
	}
	Elgamal_encryption(){
		//default constructor
	}
	
	private	Elgamal_encryption(int p, int a, int b, int k){
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
	
	int generateLargePrime(){
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
	
    double expBySquaring(double x, int n)
    {
        if (n < 0)
            return expBySquaring(1 / x, -n);
        else if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        else if (n % 2 == 0)
            return expBySquaring(x * x, n / 2);
        else 
            return x * expBySquaring(x * x, (n - 1)/2);    
    }
    	
    void encrypt(String message){
    	
    }
}
