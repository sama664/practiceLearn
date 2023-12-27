import java.io.*;
import java.util.*;

class Result3 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float leng= arr.size();
        float positive=0;
        float negative=0;
        float zero=0;
        float result=0.0f;
        for (int i = 0; i <leng ; i++) {
            int val=arr.get(i);
            if(val>0){
                positive++;

            }else{
                if(val==0){
                    zero++;
                }
                else{
                    negative++;
                }
            }
        }
        result=positive/leng;
        System.out.println(result);
        result=negative/leng;
        System.out.println(result);
        result=zero/leng;
        System.out.println(result);
    }

}

public class Day1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result3.plusMinus(arr);

        bufferedReader.close();
    }
}
