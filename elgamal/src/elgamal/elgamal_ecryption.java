package elgamal;
import java.util.*;
import java.math.*;

public class elgamal_ecryption {
	
	//p = large prime
	//a = primitive root of p
	//x = random int
	//b = a^x (mod p) 
	//k = key
	
	int p,a,b,k;
	Random rand = new Random();

	int findPrim(int p){
		// return prime root of random number (assume p)
		int counter = 2;
		
		while(counter * counter < p){
			if(p % counter == 0){
				return counter;
			} else {
				counter++;
			}
		}
		
		return counter;
	}
	
	boolean isPrime(int x){
		if(x % 2 == 0){
			return false;
		}
		return true;
	}
	
	public int generateLargePrime(){
		int largePrime = 3;
		int  n = rand.nextInt(Integer.MAX_VALUE);
		
		//while int range is not exceeded multiply largePrime with random number
		//until prime returned
		while(largePrime <= Integer.MAX_VALUE && !isPrime(largePrime)){
			largePrime = largePrime * n;
			if(isPrime(largePrime)){
				return largePrime;
			}
		}
		return largePrime;
	}
}
