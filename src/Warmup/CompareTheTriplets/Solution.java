package Warmup.CompareTheTriplets;

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
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        System.out.println(compareTriplets(a0,b0,a1,b1,a2,b2));
    }

    public static String compareTriplets(int a0, int b0, int a1, int b1, int a2, int b2){
        int alicePoints = (a0>b0 ? 1 : 0) + (a1 > b1 ? 1 : 0 ) +(a2 > b2 ? 1 : 0);
        int bobPoints = (b0 > a0 ? 1 : 0) + (b1 > a1 ? 1 : 0 ) + (b2 > a2 ? 1 : 0);

        return alicePoints +" "+bobPoints;
    }
}