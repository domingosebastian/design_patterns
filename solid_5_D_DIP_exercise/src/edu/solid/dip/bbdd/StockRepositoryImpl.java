package edu.solid.dip.bbdd;

import edu.solid.dip.business.StockRepository;

public class StockRepositoryImpl implements StockRepository {


	// Database query method
	
	@Override
	public int getStock(String shop, String product) {
		return DataBase.stocks.get(shop).get(product);
	}
}
