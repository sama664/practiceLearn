import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Loop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String result="";
        if((n>=2) || (n<=20)){
            for (int i = 1; i <=10 ; i++) {
                int multiply= n*i;
                 result= result + String.valueOf(n)+" x "+String.valueOf(i)+" = "+multiply+"\n";

            }
            System.out.println(result);
        }else{
            System.out.println("This is out of range");
        }

        bufferedReader.close();
    }
}
