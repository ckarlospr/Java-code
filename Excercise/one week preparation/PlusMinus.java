import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PlusMinus {
    
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int pos = 0;
        int neg = 0;
        int cero = 0;
        
        for(int i: arr){
            
            if(i==0)
                cero++;
            else if(i>0)
                pos++;
            else
                neg++;
                
        }
        
        System.out.format("%.5f", (double)pos/arr.size());
        System.out.println("");
        //System.out.println(" - " +pos+" / "+arr.size());
        System.out.format("%.5f", (double)neg/arr.size());
        System.out.println("");
        //System.out.println(" - " +neg+" / "+arr.size());
        System.out.format("%.5f", (double)cero/arr.size());
        //System.out.println(" - " +cero+" / "+arr.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }

}
