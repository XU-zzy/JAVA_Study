package test_1;
import java.util.Scanner;

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	Stock(String str_1,String name_1){
		symbol = str_1;
		name = name_1;
	}
	
	double changePercent() {
		return -(previousClosingPrice-currentPrice)/previousClosingPrice;
	}
}

public class test_4 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String symbol1=input.next();
	    String name1=input.next();    
	    Stock stock = new Stock(symbol1, name1);

	    stock.previousClosingPrice = input.nextDouble();

	    // Input current price
	    stock.currentPrice = input.nextDouble();

	    // Display stock info
	    System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
	    input.close();
	  }
}
