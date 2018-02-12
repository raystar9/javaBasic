package week2.day6.goodsStock;

public class Main {

	public static void main(String[] args) {
		
		GoodsStock gs = new GoodsStock();
		gs.addStock(3);
		gs.addStock(2);
		
		gs.printStockCount();
	}
}
