package com.demo.shop.purchase.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BillDetail{
	@JsonProperty("bill_date")
	private String billDate;
	@JsonProperty("bill_invoice_no")
	private long billInvoiceNo;
	@JsonProperty("bill_name")
	private String billName;
}