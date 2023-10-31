public class Main {
    public static void main(String[] args) {
        System.out.println(prendiCarattere("Rykard", 3));
    }

    public static StringBuilder prendiCarattere (String str1, int arg1) {
        StringBuilder str2 = new StringBuilder();
        if(arg1 < 0 || arg1 >= str1.length()) {
            System.out.println("La posizione inserita non è una posizione valida.");
        } else {
            int myUnicode = (int)str1.charAt(arg1);
            str2.append(myUnicode);
        }

        return str2;
    }
}

