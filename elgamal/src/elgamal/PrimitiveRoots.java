/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgamal;
import java.lang.Math;
/**
 *
 * @author ltder
 */
public class PrimitiveRoots {
    
    public int primRoot(int p){
        double k;
        int o =1;
        int z = 0;
        double[] roots= new double[100000];
        for (int r = 2; r < p; r++) {
			k = Math.pow(r, o);
			k %= p;
			while (k > 1) {
				o++;
				k *= r;
				k %= p;
			}
			if (o == (p - 1)) {
				roots[z] = r;
				z++;
			}
			o = 1;
        }

        z--;
		for (int y = 0; y < z; y++) {
			System.out.println(roots[y] + ", ");
		}
		
		System.out.println("and " + roots[z] + ".");
	    	return -1;
    	}
    	
}
