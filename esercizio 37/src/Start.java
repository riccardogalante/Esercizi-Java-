import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        String test="oggi è una bella giornata";
        String test2="giorno: lunedì";



        System.out.println("lunghezza " + test.length());
        System.out.println("maiuscola " + test.toUpperCase());
        System.out.println("minuscola " + test.toLowerCase());



        String[] array= test.split(" ");
        String[] array2= test2.split(":");
        String giorno=array2[1].trim();




        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("numero di parole nell'array: " + array.length);
        System.out.println("numero di parole nell'array: " + array2.length);
        System.out.println("numero di parole nell'array: " + array2[1]);
        System.out.println(giorno);
        String lunedì= "lunedì";

        if (giorno.toLowerCase().equals(lunedì)){
            System.out.println("oggi è lunedì");
        }
        String test3= test2.replace("giorno", "settimana");
        System.out.println(test3);



    }
}
