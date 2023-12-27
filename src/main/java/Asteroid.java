import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Asteroid {
    public static void main(String[] args) {
        Asteroid asteroid= new Asteroid();
        int[] as={5,10,-5};
        int[] rs=asteroid.asteroidCollision(as);
        StringBuilder stringBuilder=new StringBuilder();
        for (int n:rs
             ) {
            stringBuilder.append(n);
            stringBuilder.append(',');
        }
        System.out.println(stringBuilder.toString());
    }
    public int[] asteroidCollision(int[] asteroids) {

        List<Integer> list= new ArrayList<>();

        for (int n: asteroids
        ) {
            if(list.isEmpty()){
                list.add(n);
            }else if(n>0 ){
                if(list.get(list.size()-1)+n<0){

                }else {
                    list.add(n);
                }
            }else if ( n<0){
                if(list.get(list.size()-1)<0){
                    list.add(n);
                } else if(list.get(list.size()-1)+n<=0){
                    list.remove(list.size()-1);
                }
            }
        }

        int[] result= new int[list.size()];
        if(list.isEmpty()){
            int[] result1={};
            return result1;
        }
        for (int i = 0; i < list.size(); i++) {
            result[i]= list.get(i);
        }
        return result;

    }
}
