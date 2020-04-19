package edu.solid.dip.business;

public interface StockRepository {

	int getStock(String shop, String product);

}