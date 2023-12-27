public class GreatestCommon {
    public static void main(String[] args) {
        GreatestCommon greatestCommon= new GreatestCommon();
        String str1="TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
//        greatestCommon.gcdOfStrings(str1,str2);
        System.out.println(greatestCommon.gcdOfStrings(str1,str2));
    }
    public String gcdOfStrings(String str1, String str2) {
        String largeString="";
        StringBuilder stringBuilder= new StringBuilder();

        if(str1.contains(str2) && str1.length()>str2.length()){
            char[] oneChars=str1.toCharArray();
            int temp=0;
            char[] chars= str2.toCharArray();
            System.out.println(chars.length-1);
            if(oneChars[chars.length]==chars[0]){
                for (int i = 0; i < chars.length-1; i++) {
                    if(chars[0]!=chars[i+1]){
                        System.out.println("this char is added to String:"+chars[i]);
//                    stringBuilder.append(chars[i]);
                        temp=i+1;

                    }else {

                        i=chars.length;
                    }


                }
                System.out.println(temp);
                for (int i = 0; i <= temp; i++) {
                    stringBuilder.append(chars[i]);
                }
                largeString= stringBuilder.toString();
                System.out.println("this is large string: "+largeString);
            }else {
                largeString="";
            }

        }

        else {
            if(str2.contains(str1)){
                char[] oneChars=str2.toCharArray();
                int temp=0;
                char[] chars= str1.toCharArray();
                System.out.println(chars.length-1);
                if(oneChars[chars.length]==chars[0]){
                    for (int i = 0; i < chars.length-1; i++) {
                        if(chars[0]!=chars[i+1]){
                            System.out.println("this char is added to String:"+chars[i]);
//                    stringBuilder.append(chars[i]);
                            temp=i+1;

                        }else {

                            i=chars.length;
                        }


                    }
                    System.out.println(temp);
                    for (int i = 0; i <= temp; i++) {
                        stringBuilder.append(chars[i]);
                    }
                    largeString= stringBuilder.toString();
                    System.out.println("this is large string: "+largeString);
                }else {
                    largeString="";
                }

            }
        }
        return largeString;

    }
}
