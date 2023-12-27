import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestList {
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide initial list of size?");
       int inputListLength=sc.nextInt();
       String items;

        List<Integer> inputList = new ArrayList<>();

            items=bufferedReader.readLine().trim();
            System.out.println(items);
            String listInput[]=items.split(" ");
        for (int i = 0; i < listInput.length; i++) {
            int item=Integer.parseInt(listInput[i]);
            System.out.println("this is input"+item);
        }


        inputList.add(5);
        System.out.println(inputList.get(0));
    }
}
