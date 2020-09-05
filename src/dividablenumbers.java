import java.util.Scanner;

public class dividablenumbers {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int usern = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int usern2 = n2.nextInt();
        System.out.println("First: " + usern);
        System.out.println("Second: " + usern2);



        for ( int i = 1; i < usern; i++){
            if (i % usern2 == 0) {
                System.out.println(i + " is dividable by:" + usern2);
            }


    }
}

}