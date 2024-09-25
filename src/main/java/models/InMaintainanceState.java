package models;

public class InMaintainanceState implements State {
    VendingMachine vendingMachine;

    public InMaintainanceState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("machine is in maintenance");
    }

    @Override
    public void selectProduct(String label) {
        System.out.println("machine is in maintenance");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("machine is in maintenance");
    }

    @Override
    public void dispenseChange() {
        System.out.println("machine is in maintenance");
    }
}
