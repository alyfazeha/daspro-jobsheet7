import java.util.Scanner;

public class forMultiples05 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int multiple, sum, counter;
       sum = 0;
       counter = 0;

       System.out.print("input the multiple : ");
       multiple = input.nextInt();

       for (int i=1; i<=50; i++){
        if (i % multiple == 0) {
            sum += i;
            counter++;
        }
    }
    System.out.printf("there are %d number that are multiple os %d in range 1 to 50.\n", counter, multiple);
    System.out.printf("the sum of all multiples of %d in range 1 to 5 is %d. \n", multiple, sum);
    }
}
