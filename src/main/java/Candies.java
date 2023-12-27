import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        Candies candies= new Candies();
        int[] canies={2,3,5,1,3};
        System.out.println(candies.kidsWithCandies(canies,3));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int temp=0;
        for (int i = 0; i < candies.length; i++) {
            if(temp<candies[i]){
                temp=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int totalCandies=candies[i]+extraCandies;
            if(temp<=totalCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        System.out.println("this is highest :"+ temp);
        return result;
    }
}
