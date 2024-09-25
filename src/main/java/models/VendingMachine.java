package models;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    State cashDispenseState;
    State inMaintainanceState;
    State insertCoinState;
    State machineNotWorkingState;
    State productDispenseState;
    State selectProductState;
    State state;

    private int amount;
    private String label;

    List<Product> productList;

    public VendingMachine(){

        refillMachine();
        cashDispenseState = new CashDispenseState(this);
        inMaintainanceState = new InMaintainanceState(this);
        insertCoinState = new InsertCoinState(this);
        machineNotWorkingState = new MachineNotWorkingState(this);
        productDispenseState = new ProductDispenseState(this);
        selectProductState = new SelectProductState(this);

        //current state
        state = insertCoinState;
    }

    private void refillMachine() {
        Product p1 = new Product("diet_coke",50,2,"A1");
        Product p2 = new Product("chips",20,2,"A2");
        productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
    }

    public void insertCoin(int amount){
        state.insertCoin(amount);
        state = this.selectProductState;
    }

    public void selectProduct(String label){
        state.selectProduct(label);
        state = this.productDispenseState;
    }

    public void dispenseProduct(){
        state.dispenseProduct();
        state = this.cashDispenseState;

    }

    public void dispenseCash(){
        state.dispenseChange();
        state = this.insertCoinState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
       this.label = label;
    }

}
