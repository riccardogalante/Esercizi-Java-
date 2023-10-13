public class Start {
    public static void main(String[] args) {
     char[] array= {'a','b','c','a','a','d','e','a','a'};
        System.out.println("le occorrenze del carattere a sono = " + occorrenze(array));


    }
    public static int occorrenze (char[] array){
        int counter=0;
        for(int i=0; i< array.length; i++){
            if (array[i]=='a'){
                counter+=1;
            }
        }
        return counter;
    }


}
