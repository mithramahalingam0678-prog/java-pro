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
public class PharmacyBillingSystem {
static Scanner sc = new Scanner(Syst em.in);
static ArrayList<Medicine> stock = new ArrayList<>();
static ArrayList<Medicine> cart = new ArrayList<>();initializeStock();
boolean running = true;
while (running) {
System.out.println(" n===== PHARMACY BILLING SYSTEM =====");
System.out.println("1. Display Medicines");
System.out.println("2. Purchase Medicine");
System.out.println("3. Generate Bill");
System.ou t.println("4. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
switch (choice) {
case 1 -->
case 2 -->
case 3 -->
case 4 -->
System.out.println("Exiting... Thank You!");
running = false;displayMedicines();
System.out.print("Enter medicine number to purchase: ");
int choice = sc.nextInt();
if (choice < 1 || choice > stock.size()) {
System.out.println("Invalid selection!");
return;
Medicine selected = stock.get(choice 1);
System.out.print("Enter quantity: ");
int qty = sc.nextInt();
if (qty > selected.quantity) {
System.out.println("Insufficient stock!");
ret urn;
cart.add(new Medicine(selected.name, selected.price, qty));
selected.quantity selected.quantity --= qty;= qty;
System.out.println("Added to cart!");System.out.println("Added to cart!");
}}
static void generateBill() {static void generateBill() {
if (cart.isEmpty()) {if (cart.isEmpty()) {
System.out.System.out.println("No medicines purchased yet.");println("No medicines purchased yet.");
return;return;
}}
double subtotal = 0;double subtotal = 0;
System.out.println("System.out.println("\\nn------------ PHARMACY BILL PHARMACY BILL ------------");");
System.out.println("MedicineSystem.out.println("Medicine\\tQtytQty\\tPricetPrice\\tTotal");tTotal");
for (Medicine m : cart) {for (Medicine m : cart) {
double total = m.price * m.quantity;double total = m.price * m.quantity;
subtotal += total;subtotal += total;
System.out.println(m.name + "System.out.println(m.name + "\\t" + m.quantity + "t" + m.quantity + "\\t" + m.price + "t" + m.price + "\\t" + total);t" + total);
}}
double gst = subtotal * 0.05; // 5% GSTdouble gst = subtotal * 0.05; // 5% GST
double finalBill = double finalBill = subtotal + gst;subtotal + gst;
System.out.println("System.out.println("\\nSubtotal: " + subtotal);nSubtotal: " + subtotal);
System.out.println("GST (5%): " + gst);System.out.println("GST (5%): " + gst);
System.out.println("Total Bill: " + finalBill);System.out.println("Total Bill: " + finalBill);
System.out.println("Thank You! Get Well Soon!");System.out.println("Thank You! Get Well Soon!");
cart.clear(); //cart.clear(); // Clear cart after billingClear cart after billing
}}
}
}
