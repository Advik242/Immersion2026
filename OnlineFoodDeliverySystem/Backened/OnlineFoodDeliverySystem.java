public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {
        // Create Food Items
        FoodItem item1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem item2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem item3 = new FoodItem(103, "Pasta", 150, 3);
        FoodItem item4 = new FoodItem(104, "Sandwich", 90, 2);

        // Create Customers
        Customer customer1 = new Customer(1, "Advik", "9876543210");
        Customer customer2 = new Customer(2, "Rohan", "9123456780");

        // Print Order Summaries
        System.out.println("===== Order Summary for Customer 1 =====");
        printOrderSummary(customer1, new FoodItem[] {item1, item2});
        System.out.println();

        System.out.println("===== Order Summary for Customer 2 =====");
        printOrderSummary(customer2, new FoodItem[] {item3, item4});
    }

    private static void printOrderSummary(Customer customer, FoodItem[] items) {
        customer.displayCustomerDetails();
        System.out.println("Ordered Items:");
        double totalAmount = 0;

        for (FoodItem item : items) {
            item.displayItemDetails();
            totalAmount += item.calculateAmount();
            System.out.println();
        }

        System.out.println("Total Bill Amount: " + totalAmount);
    }
}
