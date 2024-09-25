package models;

public interface State {


    public void insertCoin(int amount);

    public void selectProduct(String label);

    public void dispenseProduct();

    public void dispenseChange();
}
