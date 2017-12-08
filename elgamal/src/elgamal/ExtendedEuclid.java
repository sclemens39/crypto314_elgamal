package elgamal;

public class ExtendedEuclid {
	
	//initialize variables
	private int r = 1;
	
	public int extAlgorithm(int a, int b) {
		int temp = 0, y = 1;
	
		if( r == 0){
			return b;
		}
		else {
			r = 0;
			while (b != 0 && temp != a) {
	
				//Section of code is responsible for finding the remainder value.
				if (temp != a) {
					y++;
				if (b * y <= a && (a - (b * y)) < b) {
					temp = (b * y) + r;
						r = a - temp;
				}
				temp = (b * y) + r;
			}
		}
		a = b;
	
		if(r == 0) {
			return b;
		}
		b = r;
		}
		return extAlgorithm(a,b);
	}
	
	// return array [d, a, b] such that d = gcd(p, q), ap + bq = d
	static int[] gcd(int p, int q) {
	    if (q == 0)
	    	return new int[] { p, 1, 0 };

	    int[] vals = gcd(q, p % q);
		int d = vals[0];
	    int a = vals[2];
	    int b = vals[1] - (p / q) * vals[2];
	    return new int[] { d, a, b };
	}
	
	public static int modinv(int u, int v){
		   int inv, u1, u3, v1, v3, t1, t3, q;
		   int iter;
		   /* Step X1. Initialise */
		   u1 = 1;
		   u3 = u;
		   v1 = 0;
		   v3 = v;
		   /* Remember odd/even iterations */
		   iter = 1;
		   /* Step X2. Loop while v3 != 0 */
		   while (v3 != 0)
		   {
		       /* Step X3. Divide and "Subtract" */
		       q = u3 / v3;
		       t3 = u3 % v3;
		       t1 = u1 + q * v1;
		       /* Swap */
		       u1 = v1; v1 = t1; u3 = v3; v3 = t3;
		       iter = -iter;
		   }
		   /* Make sure u3 = gcd(u,v) == 1 */
		   if (u3 != 1)
		       return 0;   /* Error: No inverse exists */
		   /* Ensure a positive result */
		   if (iter < 0)
		       inv = v - u1;
		   else
		       inv = u1;
		   return inv;
		}
}
