import java.util.ArrayList;
import java.util.List;

public class RemoveStar {
    public static void main(String[] args) {
        String s="***leet**cod*e";
        RemoveStar removeStar= new RemoveStar();
        System.out.println(removeStar.removeStars(s));
    }
    public String removeStars(String s) {
        char[] chars= s.toCharArray();
        String res="";
        List<Character> list= new ArrayList<>();
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!='*'){
                list.add(chars[i]);
            }else if(!list.isEmpty()){
                list.remove(list.size()-1);
            }

        }
        for (char c:list
             ) {
            stringBuilder.append(c);
        }
        res=stringBuilder.toString();
        return res;
    }
}
