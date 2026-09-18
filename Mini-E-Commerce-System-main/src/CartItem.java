class CartItem {
    Product product;
    int quantity;

    CartItem(Product p, int q) {
        product = p;
        quantity = q;
    }

    double getTotal() {
        return product.price * quantity;
    }
}