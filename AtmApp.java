package AtmCli;

import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {
        new AtmApp().startApplication();
    }

    private void startApplication() {

        // ---------- System Setup ----------
        Scanner scan = new Scanner(System.in);

        Account account = new Account(102116212116L, 200);
        AccountService accountService = new AccountService(account);
        AuthenticationService authService = new AuthenticationService();
        MenuUtil menuUtil = new MenuUtil();

        // ---------- Welcome ----------
        menuUtil.displayWelcomeMessage();

        // ---------- Authentication Phase ----------
        boolean isAuthenticated = false;

        while (authService.isAttemptsRemaining()) {
            System.out.println("Enter your PIN:");
            int pin = scan.nextInt();

            if (authService.validatePin(pin)) {
                isAuthenticated = true;
                break;
            } else {
                System.out.println("Invalid PIN");
            }
        }

        if (!isAuthenticated) {
            System.out.println("Too many failed attempts. Card blocked.");
            scan.close();
            return;
        }

        // ---------- Main Menu Loop ----------
        boolean exit = false;

        while (!exit) {

            menuUtil.displayMainMenu();
            int choice = menuUtil.getUserChoice();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + accountService.getBalance());
                    break;

                case 2:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scan.nextDouble();

                    if (accountService.depositAmount(depositAmount)) {
                        System.out.println("Amount deposited successfully");
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;

                case 3:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scan.nextDouble();

                    if (accountService.withdrawAmount(withdrawAmount)) {
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient balance or invalid amount");
                    }
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // ---------- Exit ----------
        menuUtil.displayExitMessage();
        scan.close();
    }
}
