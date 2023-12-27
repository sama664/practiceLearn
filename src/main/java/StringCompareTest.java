import java.io.*;
import java.util.*;

public class StringCompareTest {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int firstLen=0;
        firstLen=A.length();
        String arr[]=A.split("");
        String brr[]=B.split("");
        int secLen=0;
        secLen=B.length();
        String compare="No";

        String fts=arr[0];
        arr[0]=fts.toUpperCase();
        // System.out.println("This is first"+arr[0]);
        String sts=brr[0];
        brr[0]=sts.toUpperCase();
        String FtsResult="";
        String StsResult="";
        int str_ch=(int)A.charAt(0);
        int end_ch=(int)B.charAt(0);

        if(str_ch>end_ch){
            compare="Yes";
        }
        for (int i = 0; i < arr.length; i++) {
            FtsResult=FtsResult+arr[i];
        }

        for (int i = 0; i < brr.length; i++) {
            StsResult=StsResult+brr[i];
        }
        System.out.println(firstLen+secLen);
        System.out.println(compare);
        System.out.println(FtsResult+" "+StsResult);
    }
}



