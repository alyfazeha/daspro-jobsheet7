import java.util.Scanner;

public class doWhileLeaveEntitlement05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("input the number of leave entitlement : ");
        leaveEntitlement = input.nextInt();
        do {
            System.out.print("do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("t")) {
                break;
            } else if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("how many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.print("remaining leave entitlement : " + leaveEntitlement + "\n");
                } else {
                    System.out.println("you dont have enough leave entitlement. please enter the number of days according to your entitlement");
                    continue;
                }
            }
        } while (leaveEntitlement >0);
    }
}
