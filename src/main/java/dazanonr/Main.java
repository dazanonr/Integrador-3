package dazanonr;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuantos datos desea crear?");
		int loop = scanner.nextInt();
		Stock stock = new Stock();
		View view = new View();
		Controller controller = new Controller(view);

		for (int i = 0; i < loop; i++) {
			Thread mainThread = new Thread(new CreateStock(stock, controller));
			Thread secondaryThread = new Thread(new CreateFinance(stock, controller));

			mainThread.start();
			mainThread.join();
			secondaryThread.start();
			secondaryThread.join();
		}
	}
}
