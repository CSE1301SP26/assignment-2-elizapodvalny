import java.util.Scanner;
public class Nim {
public static void main(String[] args) {
        // Establishing how many initial sticks the user has
        int numSticks;
        Scanner scan = new Scanner(System.in);	
	System.out.println("How many sticks do you have?");
        numSticks = scan.nextInt();

        // // Round 0 (human)
        // int sticksTakenH;
        // System.out.println("How many sticks would you like to take?");
        // sticksTakenH = scan.nextInt();
        // int sticksLeft = numSticks - sticksTakenH;
        // System.out.println("Sticks left: " + sticksLeft);

        // // Round 1 (robot)
        // int sticksTakenR;
        // sticksTakenR = (int)(Math.random() * 2 + 1);
        // int sticksLeftR = sticksLeft - sticksTakenR;
        // System.out.println("Sticks left: " + sticksLeftR);
        int sticksTakenH;
        int sticksTakenR;

        while(numSticks > 0) {
                System.out.println("Choose 1 or 2 sticks");
                sticksTakenH = scan.nextInt();
                        if ((sticksTakenH < numSticks) && sticksTakenH <3 && sticksTakenH > 0) {
                                numSticks = numSticks - sticksTakenH;
                                System.out.println("Sticks left: " + numSticks);     
                sticksTakenR = (int)(Math.random() * 2 + 1);
                if (numSticks == 1) {
                        sticksTakenR = 1;
                }
                else {
                      sticksTakenR = (int)(Math.random() * 2 + 1);  
                }
                System.out.println("Robot took " + sticksTakenR);
                numSticks = numSticks - sticksTakenR;
                System.out.println("Sticks left: " + numSticks);  
        }       
                else {
                        System.out.println("Please choose 1 or 2 sticks");
                }
        }
        }
}



       // int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        // Scanner scan = new Scanner(System.in);
       //  pizzaSlices = scan.nextInt();
        // numPeople = scan.nextInt();
       // if (numPeople > 0) {