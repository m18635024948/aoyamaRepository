package co.jp.aoyama.macchinetta.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NextGenerationPrice implements Serializable {

	private static final long serialVersionUID = -4741749028696681516L;

	/*
	 　 オプション価格について
	 */
	private String keyCode;
	// オプション選択肢のサブアイテムコード
	private String mobSubItemCode;
	// オプション選択肢のオプションコード
	private String mobOptionCode;
	// オプション選択肢のオプション選択肢コード
	private String mobOptionBranchCode;
	// オプション付属価格のサブアイテムコード
	private String moapSubItemCode;
	// オプション付属価格のオプションコード
	private String moapOptionCode;
	// オプション付属価格のオプション選択肢コード
	private String moapOptionBranchCode;
	// オプション付属価格 (単位は円で設定)
	private Integer moapPrice;
	// オプション付属価格のダブルモデルの価格e（単位は円で設定）
	private Integer moapDoublePrice;
	// オプション工賃価格のサブアイテムコード
	private String mowSubItemCode;
	// オプション工賃価格のオプションコード
	private String mowOptionCode;
	// オプション工賃価格のオプション選択肢コード
	private String mowOptionBranchCode;
	// オプション工賃価格 (単位は＄で設定)
	private BigDecimal mowWage;

	/*
	 　 基本価格とダブルブレスト価格について
	 */
	private String keyItemCode;
	// 生地代
	private Integer fabricPrice;
	//下代調整金
	private Integer wsPriceAdjust;
	// 工場コード
	private String mfaFactoryCode;
	// 基本工賃価格 (単位は＄で設定)
	private BigDecimal mbwWage;
	// ダブルブレスト工賃価格 (単位は＄で設定)
	private BigDecimal mdbwWage;
	// 基本付属価格 (単位は円で設定)
	private Integer mnapPrice;
	// ダブルブレスト付属価格 (単位は円で設定)
	private Integer mdbapPrice;
	// アイテムコード
	private String mbwItemCode;
	// サブアイテムコード
	private String mdbwSubItemCode;

	/*
	 　 オプション付属詳細価格について
	 */
	private String keyDetailCode;
	// オプション選択肢のサブアイテムコード
	private String mobdSubItemCode;
	// オプション選択肢のオプションコード
	private String mobdOptionCode;
	// オプション選択肢のオプション選択肢コード
	private String mobdOptionBranchCode;
	// オプション付属価格のオプションコード
	private String moapOptionCodeT;
	// オプション付属価格のオプション選択肢コード
	private String moapOptionBranchCodeT;
	// オプション付属価格 (単位は円で設定)
	private Integer moapPriceT;
	// オプション付属価格のダブルモデルの価格e（単位は円で設定）
	private Integer moapDoublePriceT;
	// オプション工賃価格のオプションコード
	private String mowOptionCodeT;
	// オプション工賃価格のオプション選択肢コード
	private String mowOptionBranchCodeT;
	// オプション工賃価格 (単位は＄で設定)
	private BigDecimal mowWageT;
	// オプション付属詳細価格のオプション選択肢詳細コード
	private String moadpOptionBranchDetailCode;
	// オプション付属詳細価格の価格 (単位は円で設定)
	private Integer moadpPrice;
	// オプション付属詳細価格のダブルモデルの価格 (単位は円で設定)
	private Integer moadpDoublePrice;
	
	/*
	 	要尺について
	 */
	//サブアイテムコード
	private String subItemCode;
	//ノーマルモデル生地量
	private Integer nomalFabricAmount;
	//ダブルブレストモデル生地量
	private Integer doubleBreastedFabricAmount;
	
	/*
	 	下代価格マスタについて
	 */
	private String wholesaleKeyCode;
	//ドル為替
	private BigDecimal dollarExchange;
	//製品関税
	private Double productTariff;
	//製品運賃
	private Integer productShipping;
	//運賃誤差
	private Integer shippingError;
	
	/*
	 	マージンの取得
	 */
	private Double marginRate;
	
	public String getKeyCode() {
		return keyCode==null ? "" : keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public String getMobSubItemCode() {
		return mobSubItemCode==null ? "" : mobSubItemCode;
	}

	public void setMobSubItemCode(String mobSubItemCode) {
		this.mobSubItemCode = mobSubItemCode;
	}

	public String getMobOptionCode() {
		return mobOptionCode==null ? "" : mobOptionCode;
	}

	public void setMobOptionCode(String mobOptionCode) {
		this.mobOptionCode = mobOptionCode;
	}

	public String getMobOptionBranchCode() {
		return mobOptionBranchCode==null ? "" : mobOptionBranchCode;
	}

	public void setMobOptionBranchCode(String mobOptionBranchCode) {
		this.mobOptionBranchCode = mobOptionBranchCode;
	}

	public String getMoapSubItemCode() {
		return moapSubItemCode==null ? "" : moapSubItemCode;
	}

	public void setMoapSubItemCode(String moapSubItemCode) {
		this.moapSubItemCode = moapSubItemCode;
	}

	public String getMoapOptionCode() {
		return moapOptionCode==null ? "" : moapOptionCode;
	}

	public void setMoapOptionCode(String moapOptionCode) {
		this.moapOptionCode = moapOptionCode;
	}

	public String getMoapOptionBranchCode() {
		return moapOptionBranchCode==null ? "" : moapOptionBranchCode;
	}

	public void setMoapOptionBranchCode(String moapOptionBranchCode) {
		this.moapOptionBranchCode = moapOptionBranchCode;
	}

	public Integer getMoapPrice() {
		return moapPrice==null ? 0 : moapPrice;
	}

	public void setMoapPrice(Integer moapPrice) {
		this.moapPrice = moapPrice;
	}

	public Integer getMoapDoublePrice() {
		return moapDoublePrice==null ? 0 : moapDoublePrice;
	}

	public void setMoapDoublePrice(Integer moapDoublePrice) {
		this.moapDoublePrice = moapDoublePrice;
	}

	public String getMowSubItemCode() {
		return mowSubItemCode==null ? "" : mowSubItemCode;
	}

	public void setMowSubItemCode(String mowSubItemCode) {
		this.mowSubItemCode = mowSubItemCode;
	}

	public String getMowOptionCode() {
		return mowOptionCode==null ? "" : mowOptionCode;
	}

	public void setMowOptionCode(String mowOptionCode) {
		this.mowOptionCode = mowOptionCode;
	}

	public String getMowOptionBranchCode() {
		return mowOptionBranchCode==null ? "" : mowOptionBranchCode;
	}

	public void setMowOptionBranchCode(String mowOptionBranchCode) {
		this.mowOptionBranchCode = mowOptionBranchCode;
	}

	public BigDecimal getMowWage() {
		return mowWage==null ? new BigDecimal(0.0) : mowWage;
	}

	public void setMowWage(BigDecimal mowWage) {
		this.mowWage = mowWage;
	}

	public String getKeyItemCode() {
		return keyItemCode==null ? "" : keyItemCode;
	}

	public void setKeyItemCode(String keyItemCode) {
		this.keyItemCode = keyItemCode;
	}

	public Integer getFabricPrice() {
		return fabricPrice==null ? 0 : fabricPrice;
	}

	public void setFabricPrice(Integer fabricPrice) {
		this.fabricPrice = fabricPrice;
	}

	public String getMfaFactoryCode() {
		return mfaFactoryCode==null ? "" : mfaFactoryCode;
	}

	public void setMfaFactoryCode(String mfaFactoryCode) {
		this.mfaFactoryCode = mfaFactoryCode;
	}

	public BigDecimal getMbwWage() {
		return mbwWage==null ? new BigDecimal(0.0) : mbwWage;
	}

	public void setMbwWage(BigDecimal mbwWage) {
		this.mbwWage = mbwWage;
	}

	public BigDecimal getMdbwWage() {
		return mdbwWage==null ? new BigDecimal(0.0) : mdbwWage;
	}

	public void setMdbwWage(BigDecimal mdbwWage) {
		this.mdbwWage = mdbwWage;
	}

	public Integer getMnapPrice() {
		return mnapPrice==null ? 0 : mnapPrice;
	}

	public void setMnapPrice(Integer mnapPrice) {
		this.mnapPrice = mnapPrice;
	}

	public Integer getMdbapPrice() {
		return mdbapPrice==null ? 0 : mdbapPrice;
	}

	public void setMdbapPrice(Integer mdbapPrice) {
		this.mdbapPrice = mdbapPrice;
	}

	public String getMbwItemCode() {
		return mbwItemCode==null ? "" : mbwItemCode;
	}

	public void setMbwItemCode(String mbwItemCode) {
		this.mbwItemCode = mbwItemCode;
	}

	public String getMdbwSubItemCode() {
		return mdbwSubItemCode==null ? "" : mdbwSubItemCode;
	}

	public void setMdbwSubItemCode(String mdbwSubItemCode) {
		this.mdbwSubItemCode = mdbwSubItemCode;
	}

	public String getKeyDetailCode() {
		return keyDetailCode==null ? "" : keyDetailCode;
	}

	public void setKeyDetailCode(String keyDetailCode) {
		this.keyDetailCode = keyDetailCode;
	}

	public String getMobdSubItemCode() {
		return mobdSubItemCode==null ? "" : mobdSubItemCode;
	}

	public void setMobdSubItemCode(String mobdSubItemCode) {
		this.mobdSubItemCode = mobdSubItemCode;
	}

	public String getMobdOptionCode() {
		return mobdOptionCode==null ? "" : mobdOptionCode;
	}

	public void setMobdOptionCode(String mobdOptionCode) {
		this.mobdOptionCode = mobdOptionCode;
	}

	public String getMobdOptionBranchCode() {
		return mobdOptionBranchCode==null ? "" : mobdOptionBranchCode;
	}

	public void setMobdOptionBranchCode(String mobdOptionBranchCode) {
		this.mobdOptionBranchCode = mobdOptionBranchCode;
	}

	public String getMoapOptionCodeT() {
		return moapOptionCodeT==null ? "" : moapOptionCodeT;
	}

	public void setMoapOptionCodeT(String moapOptionCodeT) {
		this.moapOptionCodeT = moapOptionCodeT;
	}

	public String getMoapOptionBranchCodeT() {
		return moapOptionBranchCodeT==null ? "" : moapOptionBranchCodeT;
	}

	public void setMoapOptionBranchCodeT(String moapOptionBranchCodeT) {
		this.moapOptionBranchCodeT = moapOptionBranchCodeT;
	}

	public Integer getMoapPriceT() {
		return moapPriceT==null ? 0 : moapPriceT;
	}

	public void setMoapPriceT(Integer moapPriceT) {
		this.moapPriceT = moapPriceT;
	}

	public Integer getMoapDoublePriceT() {
		return moapDoublePriceT==null ? 0 : moapDoublePriceT;
	}

	public void setMoapDoublePriceT(Integer moapDoublePriceT) {
		this.moapDoublePriceT = moapDoublePriceT;
	}

	public String getMowOptionCodeT() {
		return mowOptionCodeT==null ? "" : mowOptionCodeT;
	}

	public void setMowOptionCodeT(String mowOptionCodeT) {
		this.mowOptionCodeT = mowOptionCodeT;
	}

	public String getMowOptionBranchCodeT() {
		return mowOptionBranchCodeT==null ? "" : mowOptionBranchCodeT;
	}

	public void setMowOptionBranchCodeT(String mowOptionBranchCodeT) {
		this.mowOptionBranchCodeT = mowOptionBranchCodeT;
	}

	public BigDecimal getMowWageT() {
		return mowWageT==null ? new BigDecimal(0.0) : mowWageT;
	}

	public void setMowWageT(BigDecimal mowWageT) {
		this.mowWageT = mowWageT;
	}

	public String getMoadpOptionBranchDetailCode() {
		return moadpOptionBranchDetailCode==null ? "" : moadpOptionBranchDetailCode;
	}

	public void setMoadpOptionBranchDetailCode(String moadpOptionBranchDetailCode) {
		this.moadpOptionBranchDetailCode = moadpOptionBranchDetailCode;
	}

	public Integer getMoadpPrice() {
		return moadpPrice==null ? 0 : moadpPrice;
	}

	public void setMoadpPrice(Integer moadpPrice) {
		this.moadpPrice = moadpPrice;
	}

	public Integer getMoadpDoublePrice() {
		return moadpDoublePrice==null ? 0 : moadpDoublePrice;
	}

	public void setMoadpDoublePrice(Integer moadpDoublePrice) {
		this.moadpDoublePrice = moadpDoublePrice;
	}

	public Integer getNomalFabricAmount() {
		return nomalFabricAmount==null ? 0 : nomalFabricAmount;
	}

	public void setNomalFabricAmount(Integer nomalFabricAmount) {
		this.nomalFabricAmount = nomalFabricAmount;
	}

	public Integer getDoubleBreastedFabricAmount() {
		return doubleBreastedFabricAmount==null ? 0 : doubleBreastedFabricAmount;
	}

	public void setDoubleBreastedFabricAmount(Integer doubleBreastedFabricAmount) {
		this.doubleBreastedFabricAmount = doubleBreastedFabricAmount;
	}

	public String getSubItemCode() {
		return subItemCode==null ? "" : subItemCode;
	}

	public void setSubItemCode(String subItemCode) {
		this.subItemCode = subItemCode;
	}

	public String getWholesaleKeyCode() {
		return wholesaleKeyCode==null ? "" : wholesaleKeyCode;
	}

	public void setWholesaleKeyCode(String wholesaleKeyCode) {
		this.wholesaleKeyCode = wholesaleKeyCode;
	}

	public BigDecimal getDollarExchange() {
		return dollarExchange==null ? new BigDecimal(0.0) : dollarExchange;
	}

	public void setDollarExchange(BigDecimal dollarExchange) {
		this.dollarExchange = dollarExchange;
	}

	public Double getProductTariff() {
		return productTariff==null ? 0.0 : productTariff;
	}

	public void setProductTariff(Double productTariff) {
		this.productTariff = productTariff;
	}

	public Integer getProductShipping() {
		return productShipping==null ? 0 : productShipping;
	}

	public void setProductShipping(Integer productShipping) {
		this.productShipping = productShipping;
	}

	public Integer getShippingError() {
		return shippingError==null ? 0 : shippingError;
	}

	public void setShippingError(Integer shippingError) {
		this.shippingError = shippingError;
	}

	public Double getMarginRate() {
		return marginRate==null ? 0.0 : marginRate;
	}

	public void setMarginRate(Double marginRate) {
		this.marginRate = marginRate;
	}

	public Integer getWsPriceAdjust() {
		return wsPriceAdjust==null ? 0 : wsPriceAdjust;
	}

	public void setWsPriceAdjust(Integer wsPriceAdjust) {
		this.wsPriceAdjust = wsPriceAdjust;
	}

}
