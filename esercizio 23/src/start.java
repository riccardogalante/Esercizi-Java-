import java.lang.reflect.Array;
import java.util.Arrays;

public class start {
    public static void main(String[] args) {
        int [] risultato= riempiArray(new int [10]);
        int  risultatoSomma= somma(risultato);
        System.out.println(risultatoSomma);

    }
    public static int [] riempiArray(int [] array) {

        for(int i=0;  i<array.length; i++) {
            array[i] = i + 1;

        }
        return array;
    }
    public  static int somma ( int []array ){
        int somma=0;
        for (int i=0; i<array.length; i++){
            somma = somma + array[i];
        }
        return somma;
    }
}

