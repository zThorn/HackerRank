package Warmup.PlusMinus;

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
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printFractions(arr, n);
    }

    public static void printFractions(int[] arr, int size){
        double pos=0 , neg=0 , zero= 0;
        for(int i: arr){
            pos += i > 0 ? 1 : 0;
            neg += i < 0 ? 1 : 0;
            zero += i == 0 ? 1 : 0;
        }

        System.out.println(pos/size);
        System.out.println(neg/size);
        System.out.println(zero/size);

    }
}