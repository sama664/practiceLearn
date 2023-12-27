import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result2 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int finalresult= 0;
        if(s.equals(null)){
            s="invalid input";
            return s;
        }
        if(s.contains("PM")){
            String arr[]=s.split(":");
            if(arr.length>10){
                s="Invalid";
                return s;
            }
            System.out.println(arr[0]);
            if(arr[0].contains("12")){
                finalresult=Integer.parseInt(arr[0]);
            }else {
                finalresult=Integer.parseInt(arr[0])+12;
            }

            System.out.println(finalresult);
            arr[0]=String.valueOf(finalresult);
            System.out.println(arr[0]);
            String last[]=arr[2].split("");
            String test=arr[2].replace("PM","");
            System.out.println("this is result of test"+test);
            System.out.println(last[0]);
            System.out.println(last[1]);
            s=arr[0]+":"+arr[1]+":"+test;
            System.out.println(s);
        }else if(s.contains("AM")){
            String arr[]=s.split(":");
            if(arr.length>10){
                s="Invalid";
                return s;
            }
            if(arr[0].contains("12")){
                arr[0]="00";
                s=arr[0]+":"+arr[1]+":"+arr[2];
                System.out.println("This is 12 am values:"+s);
                s=s.replace("AM", "");
                System.out.println("Final result"+ s);
            }else {
                s=s.replace("AM", "");
            }

        }else{
            System.out.println("Invalid input");
        }
        return s;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result2.timeConversion(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
