
class ShoppingCartItem implements IShoppingCartItem {
    String productName;
    int qyt;
    double price;
    double totalPrice;

    public ShoppingCartItem(String productName, int qyt, double price, double totalPrice) {
        this.productName = productName;
        this.qyt = qyt;
        this.price = price;
        this.totalPrice = totalPrice;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return price * qyt;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
class ShoppingCart{
    public void addItem(IShoppingCartItem cartItem){

    }
}

//discount 20%
class TwentyPercentDownShoppingCartItem implements IShoppingCartItem{

    private IShoppingCartItem shoppingCartItem;

    public TwentyPercentDownShoppingCartItem(IShoppingCartItem shoppingCartItem) {
        this.shoppingCartItem = shoppingCartItem;
    }

    public String getProductName() {
        return shoppingCartItem.getProductName();
    }

    public int getQyt() {
        return shoppingCartItem.getQyt();
    }

    public double getPrice() {
        return shoppingCartItem.getPrice();
    }

    public double getTotalPrice() {
        return shoppingCartItem.getTotalPrice() * 0.80;
    }
}

class Buy3payFor2FreeShoppingCartItem implements IShoppingCartItem{

    private IShoppingCartItem shoppingCartItem;

    public Buy3payFor2FreeShoppingCartItem(IShoppingCartItem shoppingCartItem) {
        this.shoppingCartItem = shoppingCartItem;
    }

    public String getProductName() {
        return shoppingCartItem.getProductName();
    }

    public int getQyt() {
        return shoppingCartItem.getQyt();
    }

    public double getPrice() {
        return shoppingCartItem.getPrice();
    }

    public double getTotalPrice() {

        if (getQyt() == 3){
            return getPrice() * 2;
        }
        return shoppingCartItem.getTotalPrice() * 0.80;
    }
}
public class DecoratorPattern {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        IShoppingCartItem cartItem = new ShoppingCartItem("2& Fat Milk", 3, 10.99);

       cartItem = new Buy3payFor2FreeShoppingCartItem(cartItem);
        System.out.println(cartItem.getTotalPrice());

        cart.addItem(cartItem);
    }
}
