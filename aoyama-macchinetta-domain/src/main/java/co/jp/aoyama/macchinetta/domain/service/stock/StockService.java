package co.jp.aoyama.macchinetta.domain.service.stock;

import java.math.BigDecimal;
import java.util.List;

import co.jp.aoyama.macchinetta.domain.model.Stock;

public interface StockService {
	
	List<Stock> findAllStock();
	
	List<Stock> fuzzyQuery(Stock stock);
	
	Boolean updateStockByPk(List<Stock> stockList);  
	
	void updateStockValue(String fabricNo,BigDecimal theoreticalStockUpdate,BigDecimal reservationStockUpdate,String orderPattern);
	
	void updateTheoreticalStock(String fabricNo,BigDecimal theoreticalStockUpdate,String orderPattern);

}
