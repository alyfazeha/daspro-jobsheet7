import java.util.Scanner;

public class theTriangle05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput, i=0;
        String s="";

        System.out.print("input some number : ");
        numInput = input.nextInt();

        for (i=0; i< numInput; i++){
            s += " *";
            System.out.println(s);
        }

        // while (i< numInput) {
        //     s += " *";
        //     System.out.println(s);
        //     i++;
        // }
    }
}
