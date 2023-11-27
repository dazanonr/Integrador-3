package dazanonr;

public class View
{	
	public void printStock(Stock stock)
	{
		System.out.println(stock.toString());
	}

	public void printFinance(Double earnings, Double disclosedEarnings, Double loss, Long dateDifference) {
		System.out.println("Ganancias : "+ earnings
		+ "Ganancias netas:" + disclosedEarnings
		+ "Pérdidas: " + loss
		+ "Días de diferencia: "+dateDifference);
	}
}