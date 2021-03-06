package elgamal;
import java.lang.Math;
import elgamal.ExtendedEuclid;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Decrypt {
	
    public String decrypt(int p, int alpha, int beta, File fileName) throws IOException{
        String message = "";
        Scanner cipher = new Scanner(fileName);
        int a;
        DLP dlp = new DLP();
        
        a = dlp.dlp(alpha,p);
        
        while(cipher.hasNext()){
             int r = cipher.nextInt();
            int t = cipher.nextInt();
            int s = ExtendedEuclid.modinv(r, p);
          RepeatedSquaring sToTheA = new RepeatedSquaring(); 
            int m = t * sToTheA.modexp(s, a, p); //as long as the .gcd function returns just the modular inverse this will work.
            int[] letters = new int[3];//BRUTE FORCE STARTS HERE
            for(int f = 0; f < 26; f++){
                for(int g = 0; g < 26; g++){
                    for(int h = 0; h < 26; h++){
                        if(m == (f*Math.pow(26,2)+g*26+h)){
                            letters[0] = f;
                            letters[1] = g;
                            letters[2] = h;
                        }
                    }
                }
            }
            switch(letters[0]){
                case 0: message.concat("a");break;
                case 1: message.concat("b");break;
                case 2: message.concat("c");break;
                case 3: message.concat("d");break;
                case 4: message.concat("e");break;
                case 5: message.concat("f");break;
                case 6: message.concat("g");break;
                case 7: message.concat("h");break;
                case 8: message.concat("i");break;
                case 9: message.concat("j");break;
                case 10: message.concat("k");break;
                case 11: message.concat("l");break;
                case 12: message.concat("m");break;
                case 13: message.concat("n");break;
                case 14: message.concat("o");break;
                case 15: message.concat("p");break;
                case 16: message.concat("q");break;
                case 17: message.concat("r");break;
                case 18: message.concat("s");break;
                case 19: message.concat("t");break;
                case 20: message.concat("u");break;
                case 21: message.concat("v");break;
                case 22: message.concat("w");break;
                case 23: message.concat("x");break;
                case 24: message.concat("y");break;
                case 25: message.concat("z");break;
            }
            switch(letters[1]){
                case 0: message.concat("a");break;
                case 1: message.concat("b");break;
                case 2: message.concat("c");break;
                case 3: message.concat("d");break;
                case 4: message.concat("e");break;
                case 5: message.concat("f");break;
                case 6: message.concat("g");break;
                case 7: message.concat("h");break;
                case 8: message.concat("i");break;
                case 9: message.concat("j");break;
                case 10: message.concat("k");break;
                case 11: message.concat("l");break;
                case 12: message.concat("m");break;
                case 13: message.concat("n");break;
                case 14: message.concat("o");break;
                case 15: message.concat("p");break;
                case 16: message.concat("q");break;
                case 17: message.concat("r");break;
                case 18: message.concat("s");break;
                case 19: message.concat("t");break;
                case 20: message.concat("u");break;
                case 21: message.concat("v");break;
                case 22: message.concat("w");break;
                case 23: message.concat("x");break;
                case 24: message.concat("y");break;
                case 25: message.concat("z");break;
            }
            switch(letters[2]){
                case 0: message.concat("a");break;
                case 1: message.concat("b");break;
                case 2: message.concat("c");break;
                case 3: message.concat("d");break;
                case 4: message.concat("e");break;
                case 5: message.concat("f");break;
                case 6: message.concat("g");break;
                case 7: message.concat("h");break;
                case 8: message.concat("i");break;
                case 9: message.concat("j");break;
                case 10: message.concat("k");break;
                case 11: message.concat("l");break;
                case 12: message.concat("m");break;
                case 13: message.concat("n");break;
                case 14: message.concat("o");break;
                case 15: message.concat("p");break;
                case 16: message.concat("q");break;
                case 17: message.concat("r");break;
                case 18: message.concat("s");break;
                case 19: message.concat("t");break;
                case 20: message.concat("u");break;
                case 21: message.concat("v");break;
                case 22: message.concat("w");break;
                case 23: message.concat("x");break;
                case 24: message.concat("y");break;
                case 25: message.concat("z");break;
            }//BRUTE FORCE FINISHED
        }
        return message;
    }
}
