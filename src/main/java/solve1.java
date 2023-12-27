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



class Result7 {

    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER threshold
     */

    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here
        System.out.println("this is logs"+ logs.get(0));
        System.out.println("this is threshold"+ threshold);
        long counter=0;
        List<String>   recipeintIDlist=new ArrayList<>();
        List<String> result= new ArrayList<>(Collections.emptyList());
        // This loop run through logs
        for (long i = 0; i < logs.size(); i++) {
            String logsResult=logs.get((int) i);
            String findRecipient[]=logsResult.split(" ");
            String recipeintID=findRecipient[1];
            String transaction=findRecipient[2];
            System.out.println("this is Recipeintid"+ recipeintID);
            System.out.println("this is transactionId"+ transaction);
            recipeintIDlist.add(findRecipient[1]);

        }
        for (long i = 0; i < logs.size(); i++) {
            String logsResult = logs.get((int) i);
            String findRecipient[] = logsResult.split(" ");
            String recipeintID = findRecipient[1];
            System.out.println("this is recipient id-->"+recipeintID);
            if (recipeintIDlist.contains(recipeintID)){
                counter++;
                if(counter>threshold){
                    result.add(recipeintID);
                }
            }


        }
        System.out.println(result.size());
//        System.out.println(result.get(0));
        return result;
    }

}

public class solve1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result7.processLogs(logs, threshold);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
