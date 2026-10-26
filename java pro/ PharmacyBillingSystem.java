
import java.util.*;

class Medicine {
    String name;
    double price;
    int quantity;

    Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class PharmacyBillingSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Medicine> stock = new ArrayList<>();
    static ArrayList<Medicine> cart = new ArrayList<>();

    public static void main(String[] args) {
        initializeStock();

        boolean running = true;

        while (running) {
            System.out.println("\n===== PHARMACY BILLING SYSTEM =====");
            System.out.println("1. Display Medicines");
            System.out.println("2. Purchase Medicine");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMedicines();
                    break;

                case 2:
                    purchaseMedicine();
                    break;

                case 3:
                    generateBill();
                    break;

                case 4:
                    System.out.println("Exiting... Thank You!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

    static void initializeStock() {
        stock.add(new Medicine("Paracetamol", 20.0, 50));
        stock.add(new Medicine("Vitamin C", 30.0, 40));
        stock.add(new Medicine("Cough Syrup", 80.0, 20));
        stock.add(new Medicine("Antacid", 25.0, 30));
        stock.add(new Medicine("First Aid Cream", 45.0, 15));
    }

    static void displayMedicines() {
        System.out.println("\n----- AVAILABLE MEDICINES -----");
        System.out.println("No.  Medicine\t\tPrice\tStock");

        for (int i = 0; i < stock.size(); i++) {
            Medicine m = stock.get(i);

            System.out.println((i + 1) + ".   " + m.name
                    + "\tRs." + m.price
                    + "\t" + m.quantity);
        }
    }

    static void purchaseMedicine() {
        displayMedicines();

        System.out.print("Enter medicine number to purchase: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > stock.size()) {
            System.out.println("Invalid selection!");
            return;
        }

        Medicine selected = stock.get(choice - 1);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        if (qty <= 0) {
            System.out.println("Quantity must be greater than zero!");
            return;
        }

        if (qty > selected.quantity) {
            System.out.println("Insufficient stock!");
            return;
        }

        cart.add(new Medicine(selected.name, selected.price, qty));
        selected.quantity -= qty;

        System.out.println("Added to cart successfully!");
    }

    static void generateBill() {
        if (cart.isEmpty()) {
            System.out.println("No medicines purchased yet.");
            return;
        }

        double subtotal = 0;

        System.out.println("\n---------- PHARMACY BILL ----------");
        System.out.println("Medicine\tQty\tPrice\tTotal");

        for (Medicine m : cart) {
            double total = m.price * m.quantity;
            subtotal += total;

            System.out.println(m.name + "\t"
                    + m.quantity + "\t"
                    + m.price + "\t"
                    + total);
        }

        double gst = subtotal * 0.05;
        double finalBill = subtotal + gst;

        System.out.printf("\nSubtotal: Rs.%.2f%n", subtotal);
        System.out.printf("GST (5%%): Rs.%.2f%n", gst);
        System.out.printf("Total Bill: Rs.%.2f%n", finalBill);

        System.out.println("Thank You! Get Well Soon!");

        cart.clear();
    }
}
