package Warmup.TimeConversion;

/**
 * Created by thornz on 3/8/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        try {
            System.out.println(convertToMilitaryTime(time));
        } catch(ParseException e){
            System.out.println("A parse exception has occurred");
        }
    }
    //I realize this kind of goes against the spirit of the challenge...
    //But hackerrank does give you full access to the standard libraries...
    public static String convertToMilitaryTime(String time) throws ParseException{
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");

        Date date = inputFormat.parse(time);
        return outputFormat.format(date);
    }
}
