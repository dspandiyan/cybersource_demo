package com.gp.cybersource.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gp.cybersource.common.dto.CCAuthReplyResponseDTO;
import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;
import com.gp.cybersource.common.dto.ItemRequestDTO;
import com.gp.cybersource.common.dto.PurchaseTotalsDTO;
import com.gp.cybersource.common.stub.BillTo;
import com.gp.cybersource.common.stub.CCAuthService;
import com.gp.cybersource.common.stub.Card;
import com.gp.cybersource.common.stub.Item;
import com.gp.cybersource.common.stub.PurchaseTotals;
import com.gp.cybersource.common.stub.ReplyMessage;
import com.gp.cybersource.common.stub.RequestMessage;
import com.gp.cybersource.common.stub.ShipTo;

@Component
public class CreditCardAuthRequestResponseMapper {

	public RequestMessage createCreditCardAuthRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		RequestMessage creditCardAuthRequest = null;

		if (null != ccAuthReqDTO) {
			creditCardAuthRequest = new RequestMessage();
			creditCardAuthRequest.setMerchantID(ccAuthReqDTO.getMerchantID());
			creditCardAuthRequest.setMerchantReferenceCode(ccAuthReqDTO.getMerchantReferenceCode());
			creditCardAuthRequest.setBillTo(mapBillToRequest(ccAuthReqDTO));
			creditCardAuthRequest.setShipTo(mapShipToRequest(ccAuthReqDTO));
			creditCardAuthRequest.setCcAuthService(mapCCAuthServiceRequest(ccAuthReqDTO));
			creditCardAuthRequest.setPurchaseTotals(mapPurchaseTotalRequest(ccAuthReqDTO));
			creditCardAuthRequest.getItem().addAll(mapItemListRequest(ccAuthReqDTO));
			creditCardAuthRequest.setCard(mapCardRequest(ccAuthReqDTO));
		}

		return creditCardAuthRequest;
	}

	private BillTo mapBillToRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		BillTo billTo = null;
		if (null != ccAuthReqDTO.getBillTo()) {
			billTo = new BillTo();
			billTo.setBuildingNumber(ccAuthReqDTO.getBillTo().getBuildingNumber());
			billTo.setCity(ccAuthReqDTO.getBillTo().getCity());
			billTo.setCompany(ccAuthReqDTO.getBillTo().getCompany());
			billTo.setCompanyTaxID(ccAuthReqDTO.getBillTo().getCompanyTaxID());
			billTo.setCountry(ccAuthReqDTO.getBillTo().getCountry());
			billTo.setCounty(ccAuthReqDTO.getBillTo().getCounty());
			billTo.setCustomerID(ccAuthReqDTO.getBillTo().getCustomerID());
			billTo.setCustomerPassword(ccAuthReqDTO.getBillTo().getCustomerPassword());
			billTo.setDateOfBirth(ccAuthReqDTO.getBillTo().getDateOfBirth());
			billTo.setDomainName(ccAuthReqDTO.getBillTo().getDomainName());
			billTo.setDriversLicenseNumber(ccAuthReqDTO.getBillTo().getDriversLicenseNumber());
			billTo.setDriversLicenseState(ccAuthReqDTO.getBillTo().getDriversLicenseState());
			billTo.setEmail(ccAuthReqDTO.getBillTo().getEmail());
			billTo.setFirstName(ccAuthReqDTO.getBillTo().getFirstName());
			billTo.setHostname(ccAuthReqDTO.getBillTo().getHostname());
			billTo.setHttpBrowserCookiesAccepted(ccAuthReqDTO.getBillTo().getHttpBrowserCookiesAccepted());
			billTo.setHttpBrowserEmail(ccAuthReqDTO.getBillTo().getHttpBrowserEmail());
			billTo.setHttpBrowserType(ccAuthReqDTO.getBillTo().getHttpBrowserType());
			billTo.setIpAddress(ccAuthReqDTO.getBillTo().getIpAddress());
			billTo.setIpNetworkAddress(ccAuthReqDTO.getBillTo().getIpNetworkAddress());
			billTo.setLanguage(ccAuthReqDTO.getBillTo().getLanguage());
			billTo.setLastName(ccAuthReqDTO.getBillTo().getLastName());
			billTo.setMiddleName(ccAuthReqDTO.getBillTo().getMiddleName());
			billTo.setName(ccAuthReqDTO.getBillTo().getName());
			billTo.setNif(ccAuthReqDTO.getBillTo().getNif());
			billTo.setPersonalID(ccAuthReqDTO.getBillTo().getPersonalID());
			billTo.setPhoneNumber(ccAuthReqDTO.getBillTo().getPhoneNumber());
			billTo.setPostalCode(ccAuthReqDTO.getBillTo().getPostalCode());
			billTo.setSsn(ccAuthReqDTO.getBillTo().getSsn());
			billTo.setState(ccAuthReqDTO.getBillTo().getState());
			billTo.setStreet1(ccAuthReqDTO.getBillTo().getStreet1());
			billTo.setStreet2(ccAuthReqDTO.getBillTo().getStreet2());
			billTo.setStreet3(ccAuthReqDTO.getBillTo().getStreet3());
			billTo.setStreet4(ccAuthReqDTO.getBillTo().getStreet4());
			billTo.setSuffix(ccAuthReqDTO.getBillTo().getSuffix());
			billTo.setTitle(ccAuthReqDTO.getBillTo().getTitle());
		}

		return billTo;
	}

	public ShipTo mapShipToRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		ShipTo shipTo = null;
		if (null != ccAuthReqDTO.getShipTo()) {
			shipTo = new ShipTo();
			shipTo.setCity(ccAuthReqDTO.getShipTo().getCity());
			shipTo.setCompany(ccAuthReqDTO.getShipTo().getCompany());
			shipTo.setCountry(ccAuthReqDTO.getShipTo().getCountry());
			shipTo.setCounty(ccAuthReqDTO.getShipTo().getCounty());
			shipTo.setEmail(ccAuthReqDTO.getShipTo().getEmail());
			shipTo.setFirstName(ccAuthReqDTO.getShipTo().getFirstName());
			shipTo.setLastName(ccAuthReqDTO.getShipTo().getLastName());
			shipTo.setMiddleName(ccAuthReqDTO.getShipTo().getMiddleName());
			shipTo.setName(ccAuthReqDTO.getShipTo().getName());
			shipTo.setPhoneNumber(ccAuthReqDTO.getShipTo().getPhoneNumber());
			shipTo.setPostalCode(ccAuthReqDTO.getShipTo().getPostalCode());
			shipTo.setShippingMethod(ccAuthReqDTO.getShipTo().getShippingMethod());
			shipTo.setState(ccAuthReqDTO.getShipTo().getState());
			shipTo.setStreet1(ccAuthReqDTO.getShipTo().getStreet1());
			shipTo.setStreet2(ccAuthReqDTO.getShipTo().getStreet2());
			shipTo.setStreet3(ccAuthReqDTO.getShipTo().getStreet3());
			shipTo.setStreet4(ccAuthReqDTO.getShipTo().getStreet4());
			shipTo.setSuffix(ccAuthReqDTO.getShipTo().getSuffix());
			shipTo.setTitle(ccAuthReqDTO.getShipTo().getTitle());
		}

		return shipTo;
	}

	private PurchaseTotals mapPurchaseTotalRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		PurchaseTotals purchaseTotal = null;
		if (null != ccAuthReqDTO.getPurchaseTotals()) {
			purchaseTotal = new PurchaseTotals();
			purchaseTotal.setAdditionalAmount0(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmount0());
			purchaseTotal.setAdditionalAmount1(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmount1());
			purchaseTotal.setAdditionalAmount2(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmount2());
			purchaseTotal.setAdditionalAmount3(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmount3());
			purchaseTotal.setAdditionalAmount4(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmount4());
			purchaseTotal.setAdditionalAmountType0(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmountType0());
			purchaseTotal.setAdditionalAmountType1(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmountType1());
			purchaseTotal.setAdditionalAmountType2(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmountType2());
			purchaseTotal.setAdditionalAmountType3(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmountType3());
			purchaseTotal.setAdditionalAmountType4(ccAuthReqDTO.getPurchaseTotals().getAdditionalAmountType4());
			purchaseTotal.setCurrency(ccAuthReqDTO.getPurchaseTotals().getCurrency());
			purchaseTotal.setDiscountAmount(ccAuthReqDTO.getPurchaseTotals().getDiscountAmount());
			purchaseTotal.setDutyAmount(ccAuthReqDTO.getPurchaseTotals().getDutyAmount());
			purchaseTotal.setExchangeRate(ccAuthReqDTO.getPurchaseTotals().getExchangeRate());
			purchaseTotal.setExchangeRateTimeStamp(ccAuthReqDTO.getPurchaseTotals().getExchangeRateTimeStamp());
			purchaseTotal.setForeignAmount(ccAuthReqDTO.getPurchaseTotals().getForeignAmount());
			purchaseTotal.setForeignCurrency(ccAuthReqDTO.getPurchaseTotals().getForeignCurrency());
			purchaseTotal.setFreightAmount(ccAuthReqDTO.getPurchaseTotals().getFreightAmount());
			purchaseTotal.setGrandTotalAmount(ccAuthReqDTO.getPurchaseTotals().getGrandTotalAmount());
			purchaseTotal.setOriginalAmount(ccAuthReqDTO.getPurchaseTotals().getOriginalAmount());
			purchaseTotal.setOriginalCurrency(ccAuthReqDTO.getPurchaseTotals().getOriginalCurrency());
			purchaseTotal.setServiceFeeAmount(ccAuthReqDTO.getPurchaseTotals().getServiceFeeAmount());
			purchaseTotal.setTaxAmount(ccAuthReqDTO.getPurchaseTotals().getTaxAmount());
		}
		return purchaseTotal;
	}

	private CCAuthService mapCCAuthServiceRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		CCAuthService ccAuthService = null;
		if (null != ccAuthReqDTO.getCcAuthService()) {
			ccAuthService = new CCAuthService();
			ccAuthService.setAggregatorID(ccAuthReqDTO.getCcAuthService().getAggregatorID());
			ccAuthService.setAggregatorName(ccAuthReqDTO.getCcAuthService().getAggregatorName());
			ccAuthService.setAuthType(ccAuthReqDTO.getCcAuthService().getAuthType());
			ccAuthService.setAuthenticationXID(ccAuthReqDTO.getCcAuthService().getAuthenticationXID());
			ccAuthService.setAuthorizationXID(ccAuthReqDTO.getCcAuthService().getAuthorizationXID());
			ccAuthService.setAvsLevel(ccAuthReqDTO.getCcAuthService().getAvsLevel());
			ccAuthService.setBillPayment(ccAuthReqDTO.getCcAuthService().getBillPayment());
			ccAuthService.setCaptureDate(ccAuthReqDTO.getCcAuthService().getCaptureDate());
			ccAuthService.setCavv(ccAuthReqDTO.getCcAuthService().getCavv());
			ccAuthService.setCavvAlgorithm(ccAuthReqDTO.getCcAuthService().getCavvAlgorithm());
			ccAuthService.setChecksumKey(ccAuthReqDTO.getCcAuthService().getChecksumKey());
			ccAuthService.setCommerceIndicator(ccAuthReqDTO.getCcAuthService().getCommerceIndicator());
			ccAuthService.setDuration(ccAuthReqDTO.getCcAuthService().getDuration());
			ccAuthService.setEciRaw(ccAuthReqDTO.getCcAuthService().getEciRaw());
			ccAuthService.setFirstRecurringPayment(ccAuthReqDTO.getCcAuthService().getFirstRecurringPayment());
			ccAuthService.setFxQuoteID(ccAuthReqDTO.getCcAuthService().getFxQuoteID());
			ccAuthService.setIndustryDatatype(ccAuthReqDTO.getCcAuthService().getIndustryDatatype());
			ccAuthService.setParesStatus(ccAuthReqDTO.getCcAuthService().getParesStatus());
			ccAuthService.setPartialAuthIndicator(ccAuthReqDTO.getCcAuthService().getPartialAuthIndicator());
			ccAuthService.setReconciliationID(ccAuthReqDTO.getCcAuthService().getReconciliationID());
			ccAuthService.setReturnAuthRecord(ccAuthReqDTO.getCcAuthService().getReturnAuthRecord());
			ccAuthService.setRun(ccAuthReqDTO.getCcAuthService().getRun());
			ccAuthService.setSplitTenderIndicator(ccAuthReqDTO.getCcAuthService().getSplitTenderIndicator());
			ccAuthService.setTraceNumber(ccAuthReqDTO.getCcAuthService().getTraceNumber());
			ccAuthService.setVerbalAuthCode(ccAuthReqDTO.getCcAuthService().getVerbalAuthCode());
			ccAuthService.setVeresEnrolled(ccAuthReqDTO.getCcAuthService().getVeresEnrolled());
			ccAuthService.setXid(ccAuthReqDTO.getCcAuthService().getXid());
		}

		return ccAuthService;
	}

	private List<Item> mapItemListRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		List<Item> itemList = null;
		if (!ccAuthReqDTO.getItem().isEmpty()) {
			itemList = new ArrayList<>();
			for (ItemRequestDTO itemDTO : ccAuthReqDTO.getItem()) {
				Item item = new Item();
				item.setAlternateTaxAmount(itemDTO.getAlternateTaxAmount());
				item.setAlternateTaxID(itemDTO.getAlternateTaxID());
				item.setAlternateTaxRate(itemDTO.getAlternateTaxRate());
				item.setAlternateTaxType(itemDTO.getAlternateTaxType());
				item.setAlternateTaxTypeApplied(itemDTO.getAlternateTaxTypeApplied());
				item.setBuyerRegistration(itemDTO.getBuyerRegistration());
				item.setCityOverrideAmount(itemDTO.getCityOverrideAmount());
				item.setCityOverrideRate(itemDTO.getCityOverrideRate());
				item.setCommodityCode(itemDTO.getCommodityCode());
				item.setCountryOverrideAmount(itemDTO.getCountryOverrideAmount());
				item.setCountryOverrideRate(itemDTO.getCountryOverrideRate());
				item.setCountyOverrideAmount(itemDTO.getCountyOverrideAmount());
				item.setCountyOverrideRate(itemDTO.getCountyOverrideRate());
				item.setDiscountAmount(itemDTO.getDiscountAmount());
				item.setDiscountIndicator(itemDTO.getDiscountIndicator());
				item.setDiscountRate(itemDTO.getDiscountRate());
				item.setDistrictOverrideAmount(itemDTO.getDistrictOverrideAmount());
				item.setDistrictOverrideRate(itemDTO.getDistrictOverrideRate());
				item.setExport(itemDTO.getExport());
				item.setGiftCategory(itemDTO.getGiftCategory());
				item.setGrossNetIndicator(itemDTO.getGrossNetIndicator());
				item.setHostHedge(itemDTO.getHostHedge());
				item.setId(itemDTO.getId());
				item.setInvoiceNumber(itemDTO.getInvoiceNumber());
				item.setLocalTax(itemDTO.getLocalTax());
				item.setMiddlemanRegistration(itemDTO.getMiddlemanRegistration());
				item.setNationalTax(itemDTO.getNationalTax());
				item.setNoExport(itemDTO.getNoExport());
				item.setNonsensicalHedge(itemDTO.getNonsensicalHedge());
				item.setObscenitiesHedge(itemDTO.getObscenitiesHedge());
				item.setOrderAcceptanceCity(itemDTO.getOrderAcceptanceCity());
				item.setOrderAcceptanceCountry(itemDTO.getOrderAcceptanceCountry());
				item.setOrderAcceptanceCounty(itemDTO.getOrderAcceptanceCounty());
				item.setOrderAcceptancePostalCode(itemDTO.getOrderAcceptancePostalCode());
				item.setOrderAcceptanceState(itemDTO.getOrderAcceptanceState());
				item.setOrderOriginCity(itemDTO.getOrderOriginCity());
				item.setOrderOriginCountry(itemDTO.getOrderOriginCountry());
				item.setOrderOriginCounty(itemDTO.getOrderOriginCounty());
				item.setOrderOriginPostalCode(itemDTO.getOrderOriginPostalCode());
				item.setOrderOriginState(itemDTO.getOrderOriginState());
				item.setPassengerEmail(itemDTO.getPassengerEmail());
				item.setPassengerFirstName(itemDTO.getPassengerFirstName());
				item.setPassengerID(itemDTO.getPassengerID());
				item.setPassengerLastName(itemDTO.getPassengerLastName());
				item.setPassengerPhone(itemDTO.getPassengerPhone());
				item.setPassengerStatus(itemDTO.getPassengerStatus());
				item.setPassengerType(itemDTO.getPassengerType());
				item.setPhoneHedge(itemDTO.getPhoneHedge());
				item.setPointOfTitleTransfer(itemDTO.getPointOfTitleTransfer());
				item.setProductCode(itemDTO.getProductCode());
				item.setProductDescription(itemDTO.getProductDescription());
				item.setProductName(itemDTO.getProductName());
				item.setProductRisk(itemDTO.getProductRisk());
				item.setProductSKU(itemDTO.getProductSKU());
				item.setQuantity(itemDTO.getQuantity());
				item.setSellerRegistration(itemDTO.getSellerRegistration());
				item.setSellerRegistration0(itemDTO.getSellerRegistration0());
				item.setSellerRegistration1(itemDTO.getSellerRegistration1());
				item.setSellerRegistration2(itemDTO.getSellerRegistration2());
				item.setSellerRegistration3(itemDTO.getSellerRegistration3());
				item.setSellerRegistration4(itemDTO.getSellerRegistration4());
				item.setSellerRegistration5(itemDTO.getSellerRegistration5());
				item.setSellerRegistration6(itemDTO.getSellerRegistration6());
				item.setSellerRegistration7(itemDTO.getSellerRegistration7());
				item.setSellerRegistration8(itemDTO.getSellerRegistration8());
				item.setSellerRegistration9(itemDTO.getSellerRegistration9());
				item.setShipFromCity(itemDTO.getShipFromCity());
				item.setShipFromCountry(itemDTO.getShipFromCountry());
				item.setShipFromCounty(itemDTO.getShipFromCounty());
				item.setShipFromPostalCode(itemDTO.getShipFromPostalCode());
				item.setShipFromState(itemDTO.getShipFromState());
				item.setStateOverrideAmount(itemDTO.getStateOverrideAmount());
				item.setStateOverrideRate(itemDTO.getStateOverrideRate());
				item.setTaxAmount(itemDTO.getTaxAmount());
				item.setTaxRate(itemDTO.getTaxRate());
				item.setTaxTypeApplied(itemDTO.getTaxTypeApplied());
				item.setTimeCategory(itemDTO.getTimeCategory());
				item.setTimeHedge(itemDTO.getTimeHedge());
				item.setTotalAmount(itemDTO.getTotalAmount());
				item.setUnitOfMeasure(itemDTO.getUnitOfMeasure());
				item.setUnitPrice(itemDTO.getUnitPrice());
				item.setVatRate(itemDTO.getVatRate());
				item.setVelocityHedge(itemDTO.getVelocityHedge());
				item.setZeroCostToCustomerIndicator(itemDTO.getZeroCostToCustomerIndicator());
				itemList.add(item);
			}
		}
		return itemList;
	}

	private Card mapCardRequest(CreditCardAuthRequestDTO ccAuthReqDTO) {
		Card card = null;
		if (null != ccAuthReqDTO.getCard()) {
			card = new Card();
			card.setAccountEncoderID(ccAuthReqDTO.getCard().getAccountEncoderID());
			card.setAccountNumber(ccAuthReqDTO.getCard().getAccountNumber());
			card.setBin(ccAuthReqDTO.getCard().getBin());
			card.setCardType(ccAuthReqDTO.getCard().getCardType());
			card.setCvIndicator(ccAuthReqDTO.getCard().getCvIndicator());
			card.setCvNumber(ccAuthReqDTO.getCard().getCvNumber());
			card.setEncryptedData(ccAuthReqDTO.getCard().getEncryptedData());
			card.setExpirationMonth(ccAuthReqDTO.getCard().getExpirationMonth());
			card.setExpirationYear(ccAuthReqDTO.getCard().getExpirationYear());
			card.setFullName(ccAuthReqDTO.getCard().getFullName());
			card.setIssueNumber(ccAuthReqDTO.getCard().getIssueNumber());
			card.setPin(ccAuthReqDTO.getCard().getPin());
			card.setStartMonth(ccAuthReqDTO.getCard().getStartMonth());
			card.setStartYear(ccAuthReqDTO.getCard().getStartYear());
			card.setSuffix(ccAuthReqDTO.getCard().getSuffix());

		}
		return card;
	}

	public CreditCardAuthResponseDTO createCreditCardAuthResponse(ReplyMessage authResponse) {
		CreditCardAuthResponseDTO creditCardAuthResDTO = null;
		if (null != authResponse) {
			creditCardAuthResDTO = new CreditCardAuthResponseDTO();
			creditCardAuthResDTO.setcCAuthReply(mapCreditCarAuthResponse(authResponse));
			creditCardAuthResDTO.setDecision(authResponse.getDecision());
			creditCardAuthResDTO.setMerchantReferenceCode(authResponse.getMerchantReferenceCode());
			creditCardAuthResDTO.setPurchaseTotals(mapAuthResponsePurchaseTotal(authResponse));
			creditCardAuthResDTO.setReasonCode(authResponse.getReasonCode());
			creditCardAuthResDTO.setRequestID(authResponse.getRequestID());
			creditCardAuthResDTO.setRequestToken(authResponse.getRequestToken());
		}
		return creditCardAuthResDTO;
	}

	private CCAuthReplyResponseDTO mapCreditCarAuthResponse(ReplyMessage authResponse) {
		CCAuthReplyResponseDTO ccAuthReplyDTO = null;
		if (null != authResponse.getCcAuthReply()) {
			ccAuthReplyDTO = new CCAuthReplyResponseDTO();
			ccAuthReplyDTO.setReasonCode(authResponse.getCcAuthReply().getReasonCode());
			ccAuthReplyDTO.setAmount(authResponse.getCcAuthReply().getAmount());
			ccAuthReplyDTO.setAuthorizationCode(authResponse.getCcAuthReply().getAuthorizationCode());
			ccAuthReplyDTO.setAvsCode(authResponse.getCcAuthReply().getAvsCode());
			ccAuthReplyDTO.setAvsCodeRaw(authResponse.getCcAuthReply().getAvsCodeRaw());
			ccAuthReplyDTO.setAuthorizedDateTime(authResponse.getCcAuthReply().getAuthorizedDateTime());
			ccAuthReplyDTO.setProcessorResponse(authResponse.getCcAuthReply().getProcessorResponse());
			ccAuthReplyDTO.setReconciliationID(authResponse.getCcAuthReply().getReconciliationID());
		}
		return ccAuthReplyDTO;
	}

	private PurchaseTotalsDTO mapAuthResponsePurchaseTotal(ReplyMessage authResponse) {
		PurchaseTotalsDTO purchaseTotalDTO = null;
		if (null != authResponse.getPurchaseTotals()) {
			purchaseTotalDTO = new PurchaseTotalsDTO();
			purchaseTotalDTO.setCurrency(authResponse.getPurchaseTotals().getCurrency());
		}
		return purchaseTotalDTO;
	}
}
