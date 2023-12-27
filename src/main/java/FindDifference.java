import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public static void main(String[] args) {
        FindDifference fd= new FindDifference();
        int[] nums1={1,2,3};
        int[] num2={2,4,6};
        System.out.println(fd.findDifference(nums1,num2));
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result= new ArrayList<>();
        int firstLen=nums1.length;
        int secLen=nums2.length;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        Set<Integer> firstSet= new HashSet<>();
        Set<Integer> secSet= new HashSet<>();
        for (int i = 0; i < firstLen; i++) {
            firstSet.add(nums1[i]);
        }
        System.out.println(firstSet);
        for (int i = 0; i < secLen; i++) {
            secSet.add(nums2[i]);
        }
        for (int num: firstSet
             ) {
            if(!secSet.contains(num)){
                list1.add(num);
            }
        }
        System.out.println(list1);
        for (int number: secSet
             ) {
            if(firstSet.contains(number)){
                list2.add(number);
            }
        }
        System.out.println(list2);
        result.add(list1);
        result.add(list2);
        return result;
    }
}
