package co.jp.aoyama.macchinetta.domain.repository.cash;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.jp.aoyama.macchinetta.domain.model.CashInfo;

public interface CashInfoRepository {

	CashInfo selectOrderByOrderId(String orderId);
	
	List<CashInfo> selectOrderByCashId(String cashId);
	
	void updateOrderByOrderId(CashInfo cashInfo);
	
	void updateCashInfoByPrimaryKey(@Param("cashInfoUpdList")List<CashInfo> cashInfoUpdList);
}
