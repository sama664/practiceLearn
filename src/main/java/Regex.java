import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
//            String dots[]=IP.split("");
//            int countDots=0;
//            for (int i = 0; i <dots.length ; i++) {
//                if(dots[i].equals(".")){
//                    countDots++;
//                }
//            }
//            if(countDots==3){
                System.out.println(IP.matches(new MyRegex().pattern));
//            }
//            else{
//                System.out.println("false");
//            }
        }

    }


}
class MyRegex {
    public String pattern="((\\d)(.*)(\\d)(.*)(\\d)(.*)(\\d))$";
//String pattern = "^((0|0\\d?\\d?||1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";


}

//Write your code here