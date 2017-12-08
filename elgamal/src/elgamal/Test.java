package elgamal;
import java.io.*;
import java.util.*;

/*
Solving the discrete log problem (using brute force)
Computing the multiplicative inverse in modular arithmetic using the extended Euclidean algorithm
Modular exponentiation using the repeated squaring method
Converting from numbers back to text (Note: You need to invert the above procedure which converts from text to numbers).

 */
public class Test {

	public static void main (String args[]) throws FileNotFoundException{
		//Scanner scan = new Scanner(System.in);

		PrimitiveRoots prim_Root = new PrimitiveRoots();
		Encrypt encrypt = new Encrypt();
		Decrypt decrypt = new Decrypt();
		ExtendedEuclid ext = new ExtendedEuclid();
		
		int a = 5, b = 18074, p = 31847;
		
		// getting cipherText from file
		File file = new File("C:\\Users\\MasterScribe\\Desktop\\Crypto\\Project\\elgamal\\src\\elgamal\\cipherText.txt");
		Scanner input = new Scanner(file);

		String r = null,t = null;
		
		// breaks up each pair
		input.useDelimiter(" ");
    	
    	// EOF character = .
    	while(input.hasNext()){
    		if(input.next() != "."){
   			 break;
   		 	} else {
	    		String word = input.next();
	    		
	    		// break down to ( block1, block2 )
	    		// each PAIR (block1 & block2) = 3 letters ****PAIR****
	    		String cipherBlock[] = word.split(", ");
	    		// splits block1 and block
	    		
	    		// r & t = String at the moment, need to cast to INT before passing back out
	    		 cipherBlock[0] = r; 
	    		 cipherBlock[1] = t;
	    		 int r2 = Integer.parseInt(r);
	    		 int t2 = Integer.parseInt(t);
	    		 
	    		 //*************ISSUE HERE******************
	    		 // will print every iteration, not correct placement
	    		 System.out.println("B (a^a (mod p): " + ext.extAlgorithm(1180, 482));		 
	    		 System.out.println("A (prim root): " + prim_Root.primRoot(p));
	    		 
	    		 // if the decrypt doesnt open file
	    		 try {
					System.out.print(decrypt.decrypt(p, prim_Root.primRoot(p), ext.extAlgorithm(1180, 482), file));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	    		 
	    		 
   		 	}	 
    	}
    	// end of getting cipherText from file
    		/*while(x.hasNext()) {
				String line = x.nextLine();
				String[] start = line.split("\\(");
			}
		
			System.out.println("File not found.");*/

		System.out.println("B: " + ext.extAlgorithm(1180,482));

		System.out.println("CipherText input: (r,t)");


	}




}
