package models;

public class InsertCoinState implements State {
    VendingMachine vendingMachine;

    public InsertCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
      System.out.println("you have inserted "+amount+" coin");
      this.vendingMachine.setAmount(amount);
    }

    @Override
    public void selectProduct(String label) {
        System.out.println("Please insert coin first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coin first");
    }

    @Override
    public void dispenseChange() {
        System.out.println("Please insert coin first");
    }
}
