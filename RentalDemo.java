import java.util.Scanner;
public class RentalDemo 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        Rental first = new Rental();
 
        System.out.println("Let's set up a rental.");
        System.out.print("Contract number (like K681) >> ");
        String contract = keyboard.nextLine();
        System.out.print("How many minutes was it rented for? >> ");
        int minutes = Integer.parseInt(keyboard.nextLine().trim());
        Rental second = new Rental(contract, minutes);
        keyboard.close();
        System.out.println();
        displayDetails(first);
        System.out.println();
        displayDetails(second);
    }
    public static void displayDetails(Rental r) 
    {
        System.out.println("Contract number: " + r.getContractNumber());
        System.out.println("   Time: " + r.getHours() + " hour(s) and " + r.getExtraMinutes() + " minute(s)");
        System.out.println("   Total price: $" + r.getPrice());
    }
}