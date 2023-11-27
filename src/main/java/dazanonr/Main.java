package dazanonr;

public class Main {

	public static void main (String[] args) throws InterruptedException {

		Stock stock = new Stock();
		View view = new View();
		Controller controller = new Controller(view);

		Thread mainThread = new Thread(new CreateStock(stock,controller));
		Thread secondaryThread = new Thread(new CreateFinance(stock,controller));

		mainThread.start();
		mainThread.join();
		secondaryThread.start();
		secondaryThread.join();
	}
}
