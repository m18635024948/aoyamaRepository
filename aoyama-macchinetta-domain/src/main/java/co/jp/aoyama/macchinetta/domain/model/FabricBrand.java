package co.jp.aoyama.macchinetta.domain.model;

import java.io.Serializable;
import java.util.Date;

public class FabricBrand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8035753338597368883L;
	
    private String fablicBrandNo;
	
	private String brandName;
	
	private String countryName;
	
	private Short version;
	
	private String createdUserId;
	
	private Date createdAt;

	private String updatedUserId;
	
	private Date updatedAt;
	
	private boolean delType;
	
	private String optionType;
	
	private String isNewData;
	
	private Boolean displayIdentify;
	
	private Boolean updateFlag;
	
	private String updateFailure;

	public String getFablicBrandNo() {
		return fablicBrandNo;
	}

	public void setFablicBrandNo(String fablicBrandNo) {
		this.fablicBrandNo = fablicBrandNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Short getVersion() {
		return version;
	}

	public void setVersion(Short version) {
		this.version = version;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(String updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isDelType() {
		return delType;
	}

	public void setDelType(boolean delType) {
		this.delType = delType;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getIsNewData() {
		return isNewData;
	}

	public void setIsNewData(String isNewData) {
		this.isNewData = isNewData;
	}

	public Boolean getDisplayIdentify() {
		return displayIdentify;
	}

	public void setDisplayIdentify(Boolean displayIdentify) {
		this.displayIdentify = displayIdentify;
	}

	public Boolean getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(Boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

	public String getUpdateFailure() {
		return updateFailure;
	}

	public void setUpdateFailure(String updateFailure) {
		this.updateFailure = updateFailure;
	}

}
