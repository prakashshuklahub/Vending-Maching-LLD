package models;

import java.util.List;

public class ProductDispenseState implements State {
    VendingMachine vendingMachine;

    public ProductDispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    @Override
    public void insertCoin(int amount) {
      System.out.println("cant insert coin at this stage");
    }

    @Override
    public void selectProduct(String label) {
     System.out.println("you have already selected product");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Machine is dispensing "+this.vendingMachine.getLabel());
    }

    @Override
    public void dispenseChange() {
        System.out.println("Please wait for product dispense");

    }
}
