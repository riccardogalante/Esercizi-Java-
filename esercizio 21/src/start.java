public class start {
    public static void main(String[] args) {
        int A=20;
        numStamp(A);


    }

    public static void numStamp (int limitSup) {
        for (int i=0; i<=limitSup; i++){
            if (i==5){
                break;
            } else {
                System.out.println(i);
            }
        }

    }
}
