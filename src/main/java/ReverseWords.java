public class ReverseWords {
    public static void main(String[] args) {
        String s= " the sky  is blue     ";
        ReverseWords reverseWords= new ReverseWords();
        reverseWords.reverseWords(s);
    }
    public String reverseWords(String s) {
        String result="";
        String[] words= s.trim().split(" ");
        StringBuilder sb=new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            System.out.println(words[i]);
            if(!words[i].isEmpty()){
                sb.append(words[i]);
                if(i!=0){
                    sb.append(" ");
                }

            }
        }
        result=sb.toString();
        System.out.println(result);
        return result;
    }
}
