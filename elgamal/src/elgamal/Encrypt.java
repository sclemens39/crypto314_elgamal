package elgamal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {
	
	Elgamal_encryption encryption = Elgamal_encryption.getInstance();
	
	void encryptMessage() throws FileNotFoundException{
    	// read every 3 letters in from .txt file
    	File message = new File("C:\\Users\\MasterScribe\\Desktop\\Crypto\\Project\\elgamal\\src\\elgamal\\message.txt");
    	Scanner input = new Scanner(message);
    	input.useDelimiter(" ");
    	
    	while(input.hasNext()){
    		String word = input.next();
    		// while there is input, break up into segments of 3 letters
    		if(word.length() <= 3){
    			java.util.Arrays.toString(word.split("(?<=\\G...)")); //splits word into 3 
    			// call encryption method from Elgamal_encryption 
    			
    		} else if (word.length() > 3){
    			// determine size of word, break into segments of 3 letters
    			String part1 = word.substring(0, 4);
    			String part2 = word.substring(4, (word.length()+1));
    			
    			// for those crazy long words that need to be encrypted
    			if(part2.length() > 3){
    				String part3 = part2.substring(8, (part2.length()+1));
    			} 
    			
    			// call encryption method from Elgamal_encryption on all 3 parts
    			
    		}
    		
    	}
    }
    void createCipherText(){
    	// write cipher text to file in "(block1, block2)" form
    	
    	// check if file exists
    	String ct = "cipherText%02d.txt";
        File f = null;
        for (int i = 1; i < 100; i++) {
            f = new File(String.format(ct, i));
            if (!f.exists()) {
                break;
            }
        }
        try {
            System.out.println(f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    /*
     * (1) read in from .txt file
     * (2) every 3 letters = 1 cipher block; example: cat -> 2 * 262 + 0 * 26 + 19 = 1371
     * (3) output to new file new ciphertext (using sequential filenames AKA ct1.txt, ct2.txt,...)
     */
    
    }

}
