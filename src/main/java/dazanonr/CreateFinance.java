package dazanonr;

public class CreateFinance implements Runnable {

    Stock stock;
    Controller controller;

    public CreateFinance(Stock stock,Controller controller) {
        this.stock = stock;
        this.controller = controller;
    }

    public void run() {
        controller.createFinance(this.stock);
    }
}
