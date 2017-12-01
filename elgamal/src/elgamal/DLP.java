package elgamal;
/*
 * Goal: Find k such that a^k = y(mod q). (In other words, find the position of y
 * in the huge list {a, a^2, a^3, ... ,a^(q-1)}.
 * In short, DLP is: given a^x (mod q), find x.
 */
public class DLP {
	//Input: q = prime number; a = primitive root of q;
	//		 y = a residue mod q
	static int q=0, a=0, y=0;
	int k=0, x=0;
	
	//Use ExtendedEuclid class 
	
}