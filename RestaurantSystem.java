import java.util.*; 

class RestaurantSystem { 
static Scanner sc = new Scanner(System.in); 

static String[] items = {"C.BRIYANI", "M.BRIYANI", "MANDHI", "GRILLED CHICKEN", "COKE"}; 
static double[] prices = {150, 350, 900, 300, 50}; 

public static void main(String[] args) { 
int choice; 
int[] quantity = new int[items.length]; 
double total = 0; 

System.out.println("Welcome to ABU DHABI RESTAURANT "); 

do { 
displayMenu(); 
System.out.print("Enter item number to order: "); 
choice = sc.nextInt(); 

if (choice >= 1 && choice <= items.length) { 
System.out.print("Enter quantity: "); 
int qty = sc.nextInt(); 
quantity[choice - 1] += qty; 
total += prices[choice - 1] * qty; 
} else if (choice != 0) { 
System.out.println("Invalid choice!"); 
} 

} while (choice != 0); 

generateBill(quantity, total); 
} 

static void displayMenu() { 
System.out.println("\nMenu:"); 
for (int i = 0; i < items.length; i++) { 
System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]); 
} 
System.out.println("0. Finish Order"); 
} 

static void generateBill(int[] quantity, double total) { 
System.out.println("\nBILL"); 
for (int i = 0; i < items.length; i++) { 
if (quantity[i] > 0) { 
System.out.println(items[i] + " x " + quantity[i] + " = Rs." + (prices[i] * quantity[i])); 
} 
} 

double tax = total * 0.05; 
double grandTotal = total + tax; 

System.out.println(" "); 
System.out.println("Total: Rs." + total); 
System.out.println("Tax (5%): Rs." + tax); 
System.out.println("Grand Total: Rs." + grandTotal); 
System.out.println(" "); 
System.out.println("Thank You! Visit Again!"); 
} 
}