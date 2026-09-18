import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        Cart cart = new Cart();

        int choice;

        while (true) {
            System.out.println("\n===== E-Commerce Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add to Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Product Name: ");
                    String name = sc.next();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(id, name, price));
                    System.out.println("Product added!");
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("No products available!");
                    } else {
                        System.out.println("\nAvailable Products:");
                        for (Product p : products)
                            p.display();
                    }
                    break;

                case 3:
                    if (products.isEmpty()) {
                        System.out.println("Add products first!");
                        break;
                    }

                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {
                        if (p.id == pid) {
                            cart.addToCart(p, qty);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println(" Product not found!");
                    break;

                case 4:
                    cart.showBill();
                    break;

                case 5:
                    System.out.println("Thank you for shopping!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}