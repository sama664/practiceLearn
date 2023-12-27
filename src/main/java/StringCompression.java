public class StringCompression {

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        char[] chars={'a','a','b','b','c','c','c'};
        s.compress(chars);
    }
}
class Solution2 {
    public int compress(char[] chars) {
        int len=chars.length;
        int freq=1;
        char temp=chars[0];
        StringBuilder stringBuilder= new StringBuilder();

        if(chars.length==1){
            return 1;
        }
        for (int i = 0; i < len-1; i++) {

            if(chars[i]==chars[i+1]){
                freq++;
            }
            else{
                stringBuilder.append(chars[i]);
                stringBuilder.append(freq);
                freq=1;
            }

        }
        String result=stringBuilder.toString();
        char[] newChar =result.toCharArray();
        System.out.println("this is String: "+result);

        return newChar.length;
    }
}