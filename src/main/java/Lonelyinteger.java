import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
//        a.sort(null);

        int result=0;
        int counter=0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() ; j++) {
                if(a.get(i).equals(a.get(j))){
                    counter++;
                }

            }
            if(counter==1){
                result=i;
            }else{
                counter=0;
            }



        }
        result=a.get(result);
        System.out.println(result);
        return result;
    }

}

public class Lonelyinteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.lonelyinteger(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
