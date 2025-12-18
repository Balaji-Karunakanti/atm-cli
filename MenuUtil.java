package AtmCli;
import java.util.*;
public class MenuUtil {

  Scanner scan = new Scanner(System.in);
   public void displayWelcomeMessage(){
    System.out.println("ATM system start");
   }

   public void displayMainMenu(){
    System.out.println("1.Check Balance:");
    System.out.println("2.Deposit:");
    System.out.println("3.Withdraw:");
    System.out.println("4.Exit:");
   }

  public int getUserChoice(){
    System.out.println("Enter your choice:");
    int choice = scan.nextInt();
    return choice;
  }

   public void displayExitMessage(){
    System.out.println("Thank-you");
   }

}
