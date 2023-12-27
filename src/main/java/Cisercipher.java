import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Results1 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String result="";
        char arr[]=s.toCharArray();
        String specialchar="'/#$-%*<>. !@$^&()_+=,?;:{}[]|~`"+ "\'"+"\\"+ "\"";

        for (int i = 0; i < arr.length ; i++) {
            char c= arr[i];
//            System.out.println("This is input char:"+c);
            if(specialchar.contains(Character.toString(c))){
                System.out.println("Specialchar found");

            }else{
                if(c>(122-k)){
                    c= (char) (c-26+k);
                }else if(c>(90-k) && c<90){
                    c= (char) (c-78+k);
                }
                else{
                    c= (char) (c+k);
                }

//                System.out.println("This is output char:"+c);
            }

            result=result+ c;
        }

        return result;

    }

}

public class Cisercipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/soumitrabanerjee/Desktop/javadocker/hackerRankTest/src/main/resources/sample"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Results1.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
