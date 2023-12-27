import java.io.*;
import java.time.ZoneId;
import java.util.*;

class Tesult {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if(year>=2000 || year<3000){
            Calendar c = Calendar.getInstance();
            c.set(month,day,year);
            c.setTimeZone(TimeZone.getTimeZone(ZoneId.of("-05:00")));
//            c.se

            int result= c.get(Calendar.DAY_OF_WEEK);
            String weekDays="";
            System.out.println(result);
            if(result==1){
                weekDays="SUNDAY";
            }else if(result==2){
                weekDays="MONDAY";
            }else if(result==3){
                weekDays="TUESDAY";
            }else if(result==4){
                weekDays="WEDNESDAY";
            }else if(result==5){
                weekDays="THRUSDAY";
            }else if(result==6){
                weekDays="FRIDAY";
            }else{
                weekDays="SATURDAY";
            }
            System.out.println(weekDays);
            return weekDays;
        }else{
            return "Invalid input";
        }

    }

}

public class Calender1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/soumitrabanerjee/Desktop/" +
                "javadocker/hackerRankTest/src/main/resources/sample.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Tesult.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
