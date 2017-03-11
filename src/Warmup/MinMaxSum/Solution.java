package Warmup.MinMaxSum;

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
        long arr[] = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        printMinMax(arr);
    }

    public static void printMinMax(long[] arr){
        Arrays.sort(arr);
        long min=0, max=0;
        for(int i=0; i<4; i++)
            min += arr[i];
        for(int i=4; i>0; i--)
            max += arr[i];

        System.out.println(min+" "+max);
    }
}
