package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class ItemRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String unitPrice;
	private BigInteger quantity;
	private String productCode;
	private String productName;
	private String productSKU;
	private String productRisk;
	private String taxAmount;
	private String cityOverrideAmount;
	private String cityOverrideRate;
	private String countyOverrideAmount;
	private String countyOverrideRate;
	private String districtOverrideAmount;
	private String districtOverrideRate;
	private String stateOverrideAmount;
	private String stateOverrideRate;
	private String countryOverrideAmount;
	private String countryOverrideRate;
	private String orderAcceptanceCity;
	private String orderAcceptanceCounty;
	private String orderAcceptanceCountry;
	private String orderAcceptanceState;
	private String orderAcceptancePostalCode;
	private String orderOriginCity;
	private String orderOriginCounty;
	private String orderOriginCountry;
	private String orderOriginState;
	private String orderOriginPostalCode;
	private String shipFromCity;
	private String shipFromCounty;
	private String shipFromCountry;
	private String shipFromState;
	private String shipFromPostalCode;
	private String export;
	private String noExport;
	private String nationalTax;
	private String vatRate;
	private String sellerRegistration;
	private String sellerRegistration0;
	private String sellerRegistration1;
	private String sellerRegistration2;
	private String sellerRegistration3;
	private String sellerRegistration4;
	private String sellerRegistration5;
	private String sellerRegistration6;
	private String sellerRegistration7;
	private String sellerRegistration8;
	private String sellerRegistration9;
	private String buyerRegistration;
	private String middlemanRegistration;
	private String pointOfTitleTransfer;
	private String giftCategory;
	private String timeCategory;
	private String hostHedge;
	private String timeHedge;
	private String velocityHedge;
	private String nonsensicalHedge;
	private String phoneHedge;
	private String obscenitiesHedge;
	private String unitOfMeasure;
	private String taxRate;
	private String totalAmount;
	private String discountAmount;
	private String discountRate;
	private String commodityCode;
	private String grossNetIndicator;
	private String taxTypeApplied;
	private String discountIndicator;
	private String alternateTaxID;
	private String alternateTaxAmount;
	private String alternateTaxTypeApplied;
	private String alternateTaxRate;
	private String alternateTaxType;
	private String localTax;
	private String zeroCostToCustomerIndicator;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerID;
	private String passengerStatus;
	private String passengerType;
	private String passengerEmail;
	private String passengerPhone;
	private String invoiceNumber;
	private String productDescription;
	private BigInteger id;

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public String getProductRisk() {
		return productRisk;
	}

	public void setProductRisk(String productRisk) {
		this.productRisk = productRisk;
	}

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getCityOverrideAmount() {
		return cityOverrideAmount;
	}

	public void setCityOverrideAmount(String cityOverrideAmount) {
		this.cityOverrideAmount = cityOverrideAmount;
	}

	public String getCityOverrideRate() {
		return cityOverrideRate;
	}

	public void setCityOverrideRate(String cityOverrideRate) {
		this.cityOverrideRate = cityOverrideRate;
	}

	public String getCountyOverrideAmount() {
		return countyOverrideAmount;
	}

	public void setCountyOverrideAmount(String countyOverrideAmount) {
		this.countyOverrideAmount = countyOverrideAmount;
	}

	public String getCountyOverrideRate() {
		return countyOverrideRate;
	}

	public void setCountyOverrideRate(String countyOverrideRate) {
		this.countyOverrideRate = countyOverrideRate;
	}

	public String getDistrictOverrideAmount() {
		return districtOverrideAmount;
	}

	public void setDistrictOverrideAmount(String districtOverrideAmount) {
		this.districtOverrideAmount = districtOverrideAmount;
	}

	public String getDistrictOverrideRate() {
		return districtOverrideRate;
	}

	public void setDistrictOverrideRate(String districtOverrideRate) {
		this.districtOverrideRate = districtOverrideRate;
	}

	public String getStateOverrideAmount() {
		return stateOverrideAmount;
	}

	public void setStateOverrideAmount(String stateOverrideAmount) {
		this.stateOverrideAmount = stateOverrideAmount;
	}

	public String getStateOverrideRate() {
		return stateOverrideRate;
	}

	public void setStateOverrideRate(String stateOverrideRate) {
		this.stateOverrideRate = stateOverrideRate;
	}

	public String getCountryOverrideAmount() {
		return countryOverrideAmount;
	}

	public void setCountryOverrideAmount(String countryOverrideAmount) {
		this.countryOverrideAmount = countryOverrideAmount;
	}

	public String getCountryOverrideRate() {
		return countryOverrideRate;
	}

	public void setCountryOverrideRate(String countryOverrideRate) {
		this.countryOverrideRate = countryOverrideRate;
	}

	public String getOrderAcceptanceCity() {
		return orderAcceptanceCity;
	}

	public void setOrderAcceptanceCity(String orderAcceptanceCity) {
		this.orderAcceptanceCity = orderAcceptanceCity;
	}

	public String getOrderAcceptanceCounty() {
		return orderAcceptanceCounty;
	}

	public void setOrderAcceptanceCounty(String orderAcceptanceCounty) {
		this.orderAcceptanceCounty = orderAcceptanceCounty;
	}

	public String getOrderAcceptanceCountry() {
		return orderAcceptanceCountry;
	}

	public void setOrderAcceptanceCountry(String orderAcceptanceCountry) {
		this.orderAcceptanceCountry = orderAcceptanceCountry;
	}

	public String getOrderAcceptanceState() {
		return orderAcceptanceState;
	}

	public void setOrderAcceptanceState(String orderAcceptanceState) {
		this.orderAcceptanceState = orderAcceptanceState;
	}

	public String getOrderAcceptancePostalCode() {
		return orderAcceptancePostalCode;
	}

	public void setOrderAcceptancePostalCode(String orderAcceptancePostalCode) {
		this.orderAcceptancePostalCode = orderAcceptancePostalCode;
	}

	public String getOrderOriginCity() {
		return orderOriginCity;
	}

	public void setOrderOriginCity(String orderOriginCity) {
		this.orderOriginCity = orderOriginCity;
	}

	public String getOrderOriginCounty() {
		return orderOriginCounty;
	}

	public void setOrderOriginCounty(String orderOriginCounty) {
		this.orderOriginCounty = orderOriginCounty;
	}

	public String getOrderOriginCountry() {
		return orderOriginCountry;
	}

	public void setOrderOriginCountry(String orderOriginCountry) {
		this.orderOriginCountry = orderOriginCountry;
	}

	public String getOrderOriginState() {
		return orderOriginState;
	}

	public void setOrderOriginState(String orderOriginState) {
		this.orderOriginState = orderOriginState;
	}

	public String getOrderOriginPostalCode() {
		return orderOriginPostalCode;
	}

	public void setOrderOriginPostalCode(String orderOriginPostalCode) {
		this.orderOriginPostalCode = orderOriginPostalCode;
	}

	public String getShipFromCity() {
		return shipFromCity;
	}

	public void setShipFromCity(String shipFromCity) {
		this.shipFromCity = shipFromCity;
	}

	public String getShipFromCounty() {
		return shipFromCounty;
	}

	public void setShipFromCounty(String shipFromCounty) {
		this.shipFromCounty = shipFromCounty;
	}

	public String getShipFromCountry() {
		return shipFromCountry;
	}

	public void setShipFromCountry(String shipFromCountry) {
		this.shipFromCountry = shipFromCountry;
	}

	public String getShipFromState() {
		return shipFromState;
	}

	public void setShipFromState(String shipFromState) {
		this.shipFromState = shipFromState;
	}

	public String getShipFromPostalCode() {
		return shipFromPostalCode;
	}

	public void setShipFromPostalCode(String shipFromPostalCode) {
		this.shipFromPostalCode = shipFromPostalCode;
	}

	public String getExport() {
		return export;
	}

	public void setExport(String export) {
		this.export = export;
	}

	public String getNoExport() {
		return noExport;
	}

	public void setNoExport(String noExport) {
		this.noExport = noExport;
	}

	public String getNationalTax() {
		return nationalTax;
	}

	public void setNationalTax(String nationalTax) {
		this.nationalTax = nationalTax;
	}

	public String getVatRate() {
		return vatRate;
	}

	public void setVatRate(String vatRate) {
		this.vatRate = vatRate;
	}

	public String getSellerRegistration() {
		return sellerRegistration;
	}

	public void setSellerRegistration(String sellerRegistration) {
		this.sellerRegistration = sellerRegistration;
	}

	public String getSellerRegistration0() {
		return sellerRegistration0;
	}

	public void setSellerRegistration0(String sellerRegistration0) {
		this.sellerRegistration0 = sellerRegistration0;
	}

	public String getSellerRegistration1() {
		return sellerRegistration1;
	}

	public void setSellerRegistration1(String sellerRegistration1) {
		this.sellerRegistration1 = sellerRegistration1;
	}

	public String getSellerRegistration2() {
		return sellerRegistration2;
	}

	public void setSellerRegistration2(String sellerRegistration2) {
		this.sellerRegistration2 = sellerRegistration2;
	}

	public String getSellerRegistration3() {
		return sellerRegistration3;
	}

	public void setSellerRegistration3(String sellerRegistration3) {
		this.sellerRegistration3 = sellerRegistration3;
	}

	public String getSellerRegistration4() {
		return sellerRegistration4;
	}

	public void setSellerRegistration4(String sellerRegistration4) {
		this.sellerRegistration4 = sellerRegistration4;
	}

	public String getSellerRegistration5() {
		return sellerRegistration5;
	}

	public void setSellerRegistration5(String sellerRegistration5) {
		this.sellerRegistration5 = sellerRegistration5;
	}

	public String getSellerRegistration6() {
		return sellerRegistration6;
	}

	public void setSellerRegistration6(String sellerRegistration6) {
		this.sellerRegistration6 = sellerRegistration6;
	}

	public String getSellerRegistration7() {
		return sellerRegistration7;
	}

	public void setSellerRegistration7(String sellerRegistration7) {
		this.sellerRegistration7 = sellerRegistration7;
	}

	public String getSellerRegistration8() {
		return sellerRegistration8;
	}

	public void setSellerRegistration8(String sellerRegistration8) {
		this.sellerRegistration8 = sellerRegistration8;
	}

	public String getSellerRegistration9() {
		return sellerRegistration9;
	}

	public void setSellerRegistration9(String sellerRegistration9) {
		this.sellerRegistration9 = sellerRegistration9;
	}

	public String getBuyerRegistration() {
		return buyerRegistration;
	}

	public void setBuyerRegistration(String buyerRegistration) {
		this.buyerRegistration = buyerRegistration;
	}

	public String getMiddlemanRegistration() {
		return middlemanRegistration;
	}

	public void setMiddlemanRegistration(String middlemanRegistration) {
		this.middlemanRegistration = middlemanRegistration;
	}

	public String getPointOfTitleTransfer() {
		return pointOfTitleTransfer;
	}

	public void setPointOfTitleTransfer(String pointOfTitleTransfer) {
		this.pointOfTitleTransfer = pointOfTitleTransfer;
	}

	public String getGiftCategory() {
		return giftCategory;
	}

	public void setGiftCategory(String giftCategory) {
		this.giftCategory = giftCategory;
	}

	public String getTimeCategory() {
		return timeCategory;
	}

	public void setTimeCategory(String timeCategory) {
		this.timeCategory = timeCategory;
	}

	public String getHostHedge() {
		return hostHedge;
	}

	public void setHostHedge(String hostHedge) {
		this.hostHedge = hostHedge;
	}

	public String getTimeHedge() {
		return timeHedge;
	}

	public void setTimeHedge(String timeHedge) {
		this.timeHedge = timeHedge;
	}

	public String getVelocityHedge() {
		return velocityHedge;
	}

	public void setVelocityHedge(String velocityHedge) {
		this.velocityHedge = velocityHedge;
	}

	public String getNonsensicalHedge() {
		return nonsensicalHedge;
	}

	public void setNonsensicalHedge(String nonsensicalHedge) {
		this.nonsensicalHedge = nonsensicalHedge;
	}

	public String getPhoneHedge() {
		return phoneHedge;
	}

	public void setPhoneHedge(String phoneHedge) {
		this.phoneHedge = phoneHedge;
	}

	public String getObscenitiesHedge() {
		return obscenitiesHedge;
	}

	public void setObscenitiesHedge(String obscenitiesHedge) {
		this.obscenitiesHedge = obscenitiesHedge;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getGrossNetIndicator() {
		return grossNetIndicator;
	}

	public void setGrossNetIndicator(String grossNetIndicator) {
		this.grossNetIndicator = grossNetIndicator;
	}

	public String getTaxTypeApplied() {
		return taxTypeApplied;
	}

	public void setTaxTypeApplied(String taxTypeApplied) {
		this.taxTypeApplied = taxTypeApplied;
	}

	public String getDiscountIndicator() {
		return discountIndicator;
	}

	public void setDiscountIndicator(String discountIndicator) {
		this.discountIndicator = discountIndicator;
	}

	public String getAlternateTaxID() {
		return alternateTaxID;
	}

	public void setAlternateTaxID(String alternateTaxID) {
		this.alternateTaxID = alternateTaxID;
	}

	public String getAlternateTaxAmount() {
		return alternateTaxAmount;
	}

	public void setAlternateTaxAmount(String alternateTaxAmount) {
		this.alternateTaxAmount = alternateTaxAmount;
	}

	public String getAlternateTaxTypeApplied() {
		return alternateTaxTypeApplied;
	}

	public void setAlternateTaxTypeApplied(String alternateTaxTypeApplied) {
		this.alternateTaxTypeApplied = alternateTaxTypeApplied;
	}

	public String getAlternateTaxRate() {
		return alternateTaxRate;
	}

	public void setAlternateTaxRate(String alternateTaxRate) {
		this.alternateTaxRate = alternateTaxRate;
	}

	public String getAlternateTaxType() {
		return alternateTaxType;
	}

	public void setAlternateTaxType(String alternateTaxType) {
		this.alternateTaxType = alternateTaxType;
	}

	public String getLocalTax() {
		return localTax;
	}

	public void setLocalTax(String localTax) {
		this.localTax = localTax;
	}

	public String getZeroCostToCustomerIndicator() {
		return zeroCostToCustomerIndicator;
	}

	public void setZeroCostToCustomerIndicator(String zeroCostToCustomerIndicator) {
		this.zeroCostToCustomerIndicator = zeroCostToCustomerIndicator;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public String getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}

	public String getPassengerStatus() {
		return passengerStatus;
	}

	public void setPassengerStatus(String passengerStatus) {
		this.passengerStatus = passengerStatus;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

}
