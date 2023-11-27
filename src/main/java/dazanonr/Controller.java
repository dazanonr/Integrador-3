package dazanonr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Controller
{
	private View view;

	public Controller(View view)
	{this.view = view;}

	public void createStock(Stock stock){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce detalles: ");
		stock.setDetails(scanner.nextLine());

		System.out.println("Introduce color: ");
		stock.setColor(scanner.nextLine());

		System.out.println("\nIntroduce fecha fabricación(yyyy-MM-dd): ");
		stock.setFabricationDate(LocalDate.parse(scanner.next()));

		System.out.println("\nIntroduce fecha vencimiento(yyyy-MM-dd): ");
		stock.setExpirationDate(LocalDate.parse(scanner.next()));

		System.out.println("Introduce unidades vendidas: ");
		stock.setSell(scanner.nextInt());

		System.out.println("Introduce peso: ");
		stock.setWeight(scanner.nextDouble());

		System.out.println("Introduce precio: ");
		stock.setPrice(scanner.nextDouble());

		view.printStock(stock);
}
	public void createFinance(Stock stock){
		Double earnings = stock.getPrice() * stock.getSell();
		Double disclosedEarnings = earnings * 0.83;
		Double loss = disclosedEarnings / 12;
		long dateDifference = ChronoUnit.DAYS.between(stock.getFabricationDate(), stock.getExpirationDate());
		view.printFinance(earnings, disclosedEarnings, loss, dateDifference);
	}
}
