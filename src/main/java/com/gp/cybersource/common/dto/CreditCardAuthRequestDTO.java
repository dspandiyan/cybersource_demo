package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.util.List;

public class CreditCardAuthRequestDTO extends BaseRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private BillToRequestDTO billTo;
	private ShipToRequestDTO shipTo;
	private List<ItemRequestDTO> item;
	private PurchaseTotalsDTO purchaseTotals;
	private CCAuthServiceRequestDTO ccAuthService;
	private CardRequestDTO card;

	public BillToRequestDTO getBillTo() {
		return billTo;
	}

	public void setBillTo(BillToRequestDTO billTo) {
		this.billTo = billTo;
	}

	public ShipToRequestDTO getShipTo() {
		return shipTo;
	}

	public void setShipTo(ShipToRequestDTO shipTo) {
		this.shipTo = shipTo;
	}

	public List<ItemRequestDTO> getItem() {
		return item;
	}

	public void setItem(List<ItemRequestDTO> item) {
		this.item = item;
	}

	public PurchaseTotalsDTO getPurchaseTotals() {
		return purchaseTotals;
	}

	public void setPurchaseTotals(PurchaseTotalsDTO purchaseTotals) {
		this.purchaseTotals = purchaseTotals;
	}

	public CCAuthServiceRequestDTO getCcAuthService() {
		return ccAuthService;
	}

	public void setCcAuthService(CCAuthServiceRequestDTO ccAuthService) {
		this.ccAuthService = ccAuthService;
	}

	public CardRequestDTO getCard() {
		return card;
	}

	public void setCard(CardRequestDTO card) {
		this.card = card;
	}

}
