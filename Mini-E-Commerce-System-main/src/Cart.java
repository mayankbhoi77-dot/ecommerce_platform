import java.util.ArrayList;

class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addToCart(Product p, int qty) {
        items.add(new CartItem(p, qty));
        System.out.println(p.name + " added to cart!");
    }

    void showBill() {
        double total = 0;

        System.out.println("\n🧾 BILL:");
        for (CartItem item : items) {
            double cost = item.getTotal();
            System.out.println(item.product.name + " x" + item.quantity + " = ₹" + cost);
            total += cost;
        }

        double gst = total * 0.18;
        double finalTotal = total + gst;

        System.out.println("----------------------");
        System.out.println("Subtotal: ₹" + total);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Total: ₹" + finalTotal);
    }
}