package models;

public class CashDispenseState implements State {

    VendingMachine vendingMachine;

    public CashDispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("can not insert coin at dispense state");
    }

    @Override
    public void selectProduct(String label) {
        System.out.println("can not select product at dispense state");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("product already dispensed");
    }

    @Override
    public void dispenseChange() {
        System.out.println("machine is dispensing "+this.vendingMachine.getAmount()+" change");

    }
}
