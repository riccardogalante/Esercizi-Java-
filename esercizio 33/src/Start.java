public class Start {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo(5,3);
        Triangolo triangolo=new Triangolo (8,4);
        System.out.println("l'area del triangolo è = " + triangolo.calcolaArea());
        System.out.println("l'area del rettangolo è = " + rettangolo.calcolaArea());
    }

}
