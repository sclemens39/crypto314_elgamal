import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
//package elgamal;
/*
Solving the discrete log problem (using brute force)
Computing the multiplicative inverse in modular arithmetic using the extended Euclidean algorithm
Modular exponentiation using the repeated squaring method
Converting from numbers back to text (Note: You need to invert the above procedure which converts from text to numbers).

 */
public class Test {

	public static void main (String args[]) throws FileNotFoundException{
		Scanner scan = new Scanner(System.in);

		PrimitiveRoots test = new PrimitiveRoots();
		Encrypt encrypt = new Encrypt();
		ExtendedEuclid ext = new ExtendedEuclid();

		int a = 5, b = 18074, p = 31847;

		System.out.println("B: " + ext.extAlgorithm(1180,482));

		System.out.println("CipherText input: (r,t)");


	}

	/*void openFile(String fileName) throws FileNotFoundException {
		Scanner x ;
		File file = new File(fileName);
		x = new Scanner(file);

		int r,t;
		try {

			while(x.hasNext()) {
				String line = x.nextLine();
				String[] start = line.split("\\(");
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}*/


}
