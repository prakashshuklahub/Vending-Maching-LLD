package models;

public class MachineNotWorkingState implements State {
    VendingMachine vendingMachine;

    public MachineNotWorkingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Out of Service");
    }

    @Override
    public void selectProduct(String label) {
        System.out.println("Out of Service");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Out of Service");
    }

    @Override
    public void dispenseChange() {
        System.out.println("Out of Service");
    }
}
