package Excercise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfProgrammer {
    

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
        //    1700          to          2700
        //1700 1917 Julian      1918 -> gregorian
        // in 1918 14 febrary was 32th day
        String r = "";
        if(year <= 1917){
            //diviseble 4
            if(year%4==0){
                r = "12.09."+year;
            }else{
                r = "13.09."+year;
            }
        }else if (year==1918){
            r = "26.09."+year;
        }else{
            // div 400 or div 4 but not div 100
            if(year%400==0){
                r = "12.09."+year;
            }else if(year%4==0 && year%100!=0){
                r = "12.09."+year;
            }else{
                r = "13.09."+year;
            }
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
