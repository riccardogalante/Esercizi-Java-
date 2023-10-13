import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array= {1,3,3,3,5,9,9,2,4,0};
        System.out.println(Arrays.toString(duplicati(array)));
    }
    public static int[] duplicati(int[] array){
        int[] nuovoArray= new int[array.length];
        int counter=0;
        for (int i=0; i<array.length-1; i++){
            if (array[i]!= array[i+1]){
                nuovoArray[counter++]=array[i];
            }else {
                nuovoArray[counter++]=0;
            }
        }
        return nuovoArray;
    }
}
