public class Alternately {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="efghi";
        Alternately al= new Alternately();
//        al.mergeAlternately(word1,word2);
        System.out.println("this is my string"+al.mergeAlternately(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
        char[] firstWord= word1.toCharArray();
        char[] sendWord=word2.toCharArray();
        StringBuilder sb=new StringBuilder();
        System.out.println(firstWord);
        if(firstWord.length==sendWord.length){
            for (int i = 0; i < firstWord.length; i++) {
                sb.append(firstWord[i]);
                sb.append(sendWord[i]);
            }
        }else if(firstWord.length> sendWord.length){
            int temp=0;
            for (int i = 0; i < sendWord.length; i++) {
                sb.append(firstWord[i]);
                sb.append(sendWord[i]);
                temp=i;
            }
            for (int i = temp+1; i < firstWord.length; i++) {
                sb.append(firstWord[i]);
                sb.append(" ");

            }

        }else if(firstWord.length< sendWord.length) {
            int temp = 0;
            for (int i = 0; i < firstWord.length; i++) {
                sb.append(firstWord[i]);
                sb.append(sendWord[i]);
                temp = i;
            }
            for (int i = temp + 1; i < sendWord.length; i++) {
                sb.append(" ");
                sb.append(sendWord[i]);
            }
        }
            return sb.toString();
    }
}
