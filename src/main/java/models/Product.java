package models;

public class Product {

    private String name;
    private int amount;
    private int quantity;
    private String label;

    public Product( String name,int amount,int quantity,String label) {
        this.amount = amount;
        this.name = name;
        this.quantity = quantity;
        this.label = label;
    }

    public int getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLabel() {
        return label;
    }

}
