import java.util.Scanner;

public class UPIPaymentSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate user input
        System.out.println("Enter UPI ID of the receiver:");
        String upiId = scanner.nextLine();

        System.out.println("Enter the payment amount:");
        double amount = scanner.nextDouble();

        scanner.nextLine();  // consume newline

        System.out.println("Enter a transaction note (optional):");
        String note = scanner.nextLine();

        // Generate UPI URI
        String upiUri = generateUpiUri(upiId, amount, note);

        // Simulate initiating the UPI payment request
        System.out.println("Simulating UPI payment request...");
        System.out.println("UPI Payment Request: " + upiUri);

        // In a real scenario, the UPI app would be invoked here.
        // This part is just to simulate.
        System.out.println("Proceeding to payment with the UPI app...");

        // Simulate the user deciding to complete the payment or cancel.
        System.out.println("Payment Successful! Transaction ID: " + System.currentTimeMillis());
        // If you want to simulate failure, you can comment the success message and uncomment the failure one.
        // System.out.println("Payment Failed. Please try again.");
    }

    // Function to create the UPI URI for the payment
    public static String generateUpiUri(String upiId, double amount, String note) {
        return "upi://pay?pa=" + upiId + "&pn=ReceiverName&mc=0000&tid=" + System.currentTimeMillis() +
                "&tr=" + System.currentTimeMillis() + "&tn=" + note + "&am=" + amount + "&cu=INR";
    }
}
