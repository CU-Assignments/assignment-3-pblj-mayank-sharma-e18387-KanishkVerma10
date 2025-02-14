// Problem 2: ATM Withdrawal System

import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawalSystem {
    private static final int CORRECT_PIN = 12395;  
    private static double balance = 5000;         

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
           System.out.println("Hello Kanishk");
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin != CORRECT_PIN) {
                throw new InvalidPinException("Error: Invalid PIN.");
            }

      
            System.out.print("Withdraw Amount: ");
            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException("Error: Insufficient balance.");
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal Successful! Remaining Balance: " + balance);

        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } finally {
          
            System.out.println("Current Balance: " + balance);
            scanner.close();
        }
    }
}
