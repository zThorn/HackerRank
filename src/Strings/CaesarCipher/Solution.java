package Strings.CaesarCipher;

/**
 * Created by thornz on 3/8/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        System.out.println(encode(s.toCharArray(),k));
    }

    public static String encode(char[] s, int n){
        int cipherLength = n;
        //We want to reduce the cipher length if it's greater than a complete loop around the alphabet
        while(cipherLength > 26){
            cipherLength -= 26;
        }
        for(int i=0; i<s.length; i++){
            if(Character.isAlphabetic(s[i])) {
                s[i] = encodeCharacter(s[i], cipherLength);
            }
        }
        return new String(s);
    }

    public static char encodeCharacter(char c, int n){
        //If adding to the ascii char will result in it exiting
        //the acceptable range for an alphabetic character,subtract
        //from the cipher length and add it to the starting alphabetical character 'A' || 'a'
        if(Character.isLowerCase(c) && c+n > 122){
            int newIndex = n - (122-c);
            return (char) (96 + newIndex);
        } else if(Character.isUpperCase(c) && c+n > 90){
            int newIndex = n - (90-c);
            return (char) (64 + newIndex);
        } else{
            return (char) ((int) c + n);
        }
    }
}