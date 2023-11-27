package dazanonr;

public class CreateStock implements Runnable {

    Stock stock;
    Controller controller;

    public CreateStock(Stock stock,Controller controller) {
        this.stock = stock;
        this.controller = controller;
    }

    public void run() {
        controller.createStock(this.stock);
    }
}
