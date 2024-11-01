import java.util.Scanner;

public class WhileMultiples05 {
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
       int multiple, sum, counter;
       double average;
       sum = 0;
       counter = 0;
       
       System.out.print("input the multiple : ");
       multiple = input.nextInt();

       int i = 1;
       while (i<=50) {
            sum += i;
            counter++;

            i++;
       }
       
        System.out.printf("there are %d number that are multiple os %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("the sum of all multiples of %d in range 1 to 5 is %d. \n", multiple, sum);
        average = (double)sum/counter;
        System.out.println("the average is : " + average);
    }
}
