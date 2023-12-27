import java.util.Scanner;

public class LetsLearn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int sizeString=s1.length();
            String result=padString(s1,(15-sizeString));
            //Complete this line
            String sizeofInt=String.valueOf(x);
            if(x<10){
                sizeofInt="00"+sizeofInt;

            }else{
                if(x<100){
                    sizeofInt="0"+sizeofInt;
                }
            }
            System.out.println(result+sizeofInt);
        }
        System.out.println("================================");
    }

    private static String padString(String s1, int i) {
        for (int j = 0; j < i; j++) {
            s1=s1+" ";
        }
        return s1;
    }
}
