package cts.com.app;

public class Stock {

	private String stockId;
	private  String stockName;
	private int quantity;

	public Stock(String stockId, String stockName, int quantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.quantity = quantity;
	}

	public String getStockId() {
		return stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public int getQuantity() {
		return quantity;
	}

}
