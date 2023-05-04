import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min=0, max=0, sum=0;
        Collections.sort(arr);

        for (int i = 0; i < arr.size()-3; i++) {
            sum = (long)arr.get(i)+(long)arr.get(i+1)+(long)arr.get(i+2)+(long)arr.get(i+3);
            System.out.println(arr.get(i)+"+"+arr.get(i+1)+"+"+arr.get(i+2)+"+"+arr.get(i+3));
            System.out.println(sum);
            if(sum<min || i==0) min=sum;
            if(sum>max) max=sum;
        }
        System.out.println(min + " " + max);
    }
}