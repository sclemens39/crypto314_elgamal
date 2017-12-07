package elgamal;

public class ExtendedEuclid {
	
	//initialize variables
	private int r = 1;
	
	public int extAlgorithm(int a, int b) {
		int x = 0, temp = 0, y = 1;
	
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
}
