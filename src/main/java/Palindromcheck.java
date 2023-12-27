import java.io.*;
import java.util.*;

public class Palindromcheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String  arr[]=A.split("");
        int len=arr.length;

        System.out.println("this array length"+len);
        int mid=(arr.length/2);
        String result="";
        System.out.println(mid);
        for (int i=0; i<len;i++) {
            System.out.println(arr[i]);
            int index=len-i-1;
            System.out.println(arr[index]);
            if(!arr[i].equals(arr[index])){
                result="No";
                break;

            }else{
                System.out.println("i am in loop else");
                result="Yes";
                continue;
            }
        }
        System.out.println(result);
    }
}



