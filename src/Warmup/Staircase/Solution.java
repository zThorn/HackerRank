package Warmup.Staircase;

/**
 * Created by thornz on 3/8/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printStaircase(1, n);
    }

    public static void printStaircase(int s, int n){
        String res = "";
        if(n == 0)
            return;
        for( int i=0; i<n-1; i++){
            res += " ";
        }
        for (int i=0 ; i<s; i++){
            res += "#";
        }
        System.out.println(res);
        printStaircase(s+1, n-1);

    }
}