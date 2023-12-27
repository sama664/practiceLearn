import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class MaxVowel {
    public static void main(String[] args) {
        String s="abciiidef";
        MaxVowel maxVowel=new MaxVowel();
        int k=3;
        System.out.println(maxVowel.maxVowels(s,k));

    }
    public int maxVowels(String s, int k) {
        int result=0;
        char[] chars=s.toCharArray();
        int start=0;
        List<Character> list=new ArrayList<Character>();
        Map<String, Integer> map= new HashMap<>();
        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < k && i+j< chars.length; j++) {

                list.add(chars[i+j]);
                System.out.println("this is value of list: "+list.get(j));
                if(list.get(j).equals('a')||list.get(j).equals('e')||list.get(j).equals('i')||list.get(j).equals('a')||list.get(j).equals('o')||list.get(j).equals('u')){
                    start++;
                }

            }
            result=Math.max(start,result);
            start=0;
            list.clear();
        }
        return result;
    }
}
