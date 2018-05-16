public class Product {
    private double price;
    private int amount;
    private String name;

    public Product(String name, double price, int amount){
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public void printProduct(){
        System.out.printf("%s, price %f, amount %d",name, price, amount);
    }
}
