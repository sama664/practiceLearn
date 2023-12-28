public class Flowers {
    public static void main(String[] args) {
        Flowers flowers= new Flowers();
        int[] flowerbed={0,0,0,0,1};
        int n=2;
        System.out.println(flowers.canPlaceFlowers(flowerbed,n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result= false;
        boolean found=true;
        if(n==0){
            return true;
        }else if(n==1 && flowerbed.length>1){
            if(flowerbed[0]==0 &&flowerbed[1]==0){
                return true;
            }
        }
        int startPos=0;
        int lastPos=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[0]==0){
                if(flowerbed.length==1){
                    return true;
                }

            }
            if(flowerbed[i]==1){
                if(found){
                    startPos=i;
                    found=false;

                }else{
                    lastPos=i;
                    break;
                }

            }
        }
        System.out.println(startPos+"    "+lastPos);
        if(lastPos==0){
            if((startPos-2)/n>1){
                return true;
            }else if(startPos==0){
                if((flowerbed.length-2)/n>=1){
                    return true;
                }
            }
        }
        int i=0;
        int flower=n;
        while(i<n){
            if(lastPos-startPos-2/n>1){
                result=true;
                flower--;
            }else {
                result=false;
            }
            i++;
            lastPos=lastPos-3;
        }
        if(flower>0 && flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            result=true;
        }
        return result;
    }
}
