package elgamal;
import java.util.*;
/*
 * Goal: Find k such that a^k = y(mod p). (In other words, find the position of y
 * in the huge list {a, a^2, a^3, ... ,a^(q-1)}.
 * In short, DLP is: given a^x (mod p), find x.
 */
public class DLP extends PrimitiveRoots {
	
	static PrimitiveRoots root = new PrimitiveRoots();

	static int dlp(int alpha, int p)  {
        //Input: p = large prime number; a = primitive root of q;
        //y = a residue mod q
        boolean logFound = false;
        int a=0, b=0, x=0;

        while(!logFound)
        {
            //Used primeRoot() from PrimitiveRoots class.
			a = root.primRoot(p);
			
            b = (int)Math.pow(alpha,a) % p; //Finds the remainder for b.
            if(b != (int)Math.pow(a,x) % p) {
                x++;
                if(b == (int)Math.pow(a,x) % p) {
                    logFound = true;
                }
            }
        }
        return x;
    }
}