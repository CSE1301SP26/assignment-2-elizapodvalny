import java.util.Scanner;
public class Nim {
public static void main(String[] args) {
        // Establishing how many initial sticks the user has
        int numSticks;
        Scanner scan = new Scanner(System.in);	
	System.out.println("How many sticks do you have?");
        numSticks = scan.nextInt();

        // Round 0 (human)
        int sticksTakenH;
        System.out.println("How many sticks would you like to take?");
        sticksTakenH = scan.nextInt();
        int sticksLeft = numSticks - sticksTakenH;
        System.out.println("Sticks left: " + sticksLeft);

        // Round 1 (robot)
        int sticksTakenR;
        sticksTakenR = (int)Math.random();
        int sticksLeftR = sticksLeft - sticksTakenR;
        System.out.println("Sticks left: " + sticksLeftR);
}
}
       // int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        // Scanner scan = new Scanner(System.in);
       //  pizzaSlices = scan.nextInt();
        // numPeople = scan.nextInt();
       // if (numPeople > 0) {