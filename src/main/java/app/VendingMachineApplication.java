package app;

import models.VendingMachine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VendingMachineApplication {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(60);
        vendingMachine.selectProduct("A1");
        vendingMachine.dispenseProduct();
        vendingMachine.dispenseCash();

        vendingMachine.insertCoin(60);
        vendingMachine.selectProduct("A1");
        vendingMachine.dispenseProduct();
        vendingMachine.dispenseCash();


    }
}