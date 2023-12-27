import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max=0;
        long min=0;
        long sum=0;
        for (int i = 0; i < arr.size(); i++) {
            sum+=arr.get(i);
        }
        min=sum-arr.get(arr.size()-1);
        max=sum-arr.get(0);
//        System.out.println(min+" "+max);
        for (int i = 0; i < arr.size(); i++) {
            if(max<(sum-arr.get(i))){
                max=sum-arr.get(i);
            }
            if(min>(sum-arr.get(i))){
                min=sum-arr.get(i);
            }
        }

        System.out.println(min+" "+max);
    }

}

public class Maxmin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}
