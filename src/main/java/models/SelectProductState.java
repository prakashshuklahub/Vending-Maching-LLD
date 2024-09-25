package models;

import java.util.List;

public class SelectProductState implements State {
    VendingMachine vendingMachine;


    public SelectProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;

    }
    @Override
    public void insertCoin(int amount) {
        System.out.println("you already inserted the coin");
    }

    @Override
    public void selectProduct(String label) {
        List<Product> productList = this.vendingMachine.productList;
        this.vendingMachine.setLabel(label);
        for(Product product:productList){
            if (product.getLabel().equals(label)){

                if(product.getQuantity() ==0 ){
                    throw new RuntimeException("product is out of stock");
                }

                int amount  = product.getAmount();

                if(amount>this.vendingMachine.getAmount()){
                    throw new RuntimeException("not enough money");
                }

                product.setQuantity(product.getQuantity()-1);
                this.vendingMachine.setAmount(this.vendingMachine.getAmount()-amount);
            }
        }
    }

    @Override
    public void dispenseProduct() {
        System.out.println("you have to select product first");
    }

    @Override
    public void dispenseChange() {
        System.out.println("you have to select product first");
    }
}
