/**
 * 
 */
package com.sarashwathy.customer;

import org.springframework.data.annotation.Id;

/**
 * 
 * This is customer Transfer Object/ DTO class used to hold the customer
 * instances.
 * 
 * @author Sangeeth
 *
 */
public class CustomerTO {

	@Id
	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerMobileNo;
	private String customerEmailId;

	/**
	 * constructor for customer
	 * 
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param customerMobileNo
	 * @param customerEmailId
	 */
	public CustomerTO(String customerId, String customerName, String customerAddress, String customerMobileNo,
			String customerEmailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
	}

	/**
	 * No Arg constructor
	 */
	public CustomerTO() {

	}

	public String getcustomerId() {
		return customerId;
	}

	public void setcustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcustomerAddress() {
		return customerAddress;
	}

	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getcustomerMobileNo() {
		return customerMobileNo;
	}

	public void setcustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getcustomerEmailId() {
		return customerEmailId;
	}

	public void setcustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

}
