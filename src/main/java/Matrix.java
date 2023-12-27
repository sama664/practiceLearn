
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



class Result8 {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int size=matrix.size();
        int result=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
//               matrix.stream().sorted();
                if(matrix.get(i).get(j) < matrix.get(i+1).get(j+1)){
                    int temp=0;
                    temp=matrix.get(i+1).get(j+1);
                    matrix.stream().sorted((Comparator<? super List<Integer>>) matrix);

                }
               if(i<2 && j<2){
                   result= result+matrix.get(i).get(j);
               }
                System.out.println(matrix.get(i).get(j));
            }
        }
        System.out.println("this is result"+result);

        return result;

    }

}

public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/soumitrabanerjee/Desktop/" +
                "javadocker/hackerRankTest/src/main/resources/sample.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result8.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
