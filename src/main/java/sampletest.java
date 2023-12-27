public class sampletest {
    public static void main(String[] args) {
        int steps=2;
        int badindex=2;
        int result=0;
        for(int i=1; i<=steps; i++){
            for (int j = 1; j <= steps  ; j++) {
                if(badindex!=j){
                  result=result+j;
                }


            }
        }
        System.out.println("This is result:"+ result);
    }
}
