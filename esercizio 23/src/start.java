import java.lang.reflect.Array;
import java.util.Arrays;

public class start {
    public static void main(String[] args) {
        int [] array= new int [10];

//        System.out.println(calcoloSomma(array));
//        System.out.println(Arrays.toString((array)));
        int risultato= calcoloSomma(array);
        System.out.println(Arrays.toString(array));
        System.out.println(risultato);


    }

    public static int calcoloSomma(int [] a) {

        int somma = 0;
        for(int i=0;  i<a.length; i++) {
            a[i] = i + 1;
            somma += a[i];  // somma = somma + array[i]



        }
        return somma;
    }

}

