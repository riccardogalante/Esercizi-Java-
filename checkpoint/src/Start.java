import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array={3,5,8,9,6};
        String[] arrayStr={"calcio","tennis","pingpong"};
        String lunghezza= "tennis";
        System.out.println(maxValue(array));
        System.out.println(minValue(array));
        System.out.println(sommaInt(array));
        System.out.println(lunghezzaParola(arrayStr,6));

    }


    public static int maxValue(int[]array){
        int max=array[0];
        for (int i=0; i< array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static int minValue(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int sommaInt (int[] array){
        int somma=0;
        for (int i=0; i< array.length; i++){
            if(array[i] %2== 0){
                somma+=array[i];
            }
        }
        return somma;
    }
    public static boolean lunghezzaParola (String[] arrayStr, int lunghezza){



        for(int i=0; i<arrayStr.length; i++){
            if (arrayStr[i].length()==lunghezza){
                return true;

            }
        }
        return false;

    }

}
