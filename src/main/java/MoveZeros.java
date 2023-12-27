import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Leetcode problem soving of Leetcode75
public class MoveZeros {
    public static void main(String[] args) {
        Solutions solution= new Solutions();
        int num[]= {0,1,0,3,12};
        solution.moveZeroes(num);

    }
}

class Solutions {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        List<Integer> nonZeros = new ArrayList<>(Collections.emptyList());
        List<Integer> zeros = new ArrayList<>(Collections.emptyList());


        if(len==1){
            System.out.println(nums[0]);
        }else{
            for (int i = 0; i < len; i++) {
                if (nums[i] == 0) {
//                i++;
                    zeros.add(0);
                    System.out.println(i+"this is  zero size"+zeros.size());

                }
                else {
                    nonZeros.add(nums[i]);
                    System.out.println(i+"this is non zero size"+nonZeros.size());


                }
            }
            for (int j = 0; j < zeros.size(); j++) {
                nonZeros.add(zeros.get(j).intValue());
                System.out.println("i am adding zeros to non zeros"+j);
            }


            for (int i = 0; i < len; i++) {

                nums[i]=nonZeros.get(i).intValue();
                System.out.println(nums[i]);
            }
        }



    }
}
