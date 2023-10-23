package org.perscholas.database.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Integer id;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "contact_lastname")
	private String contactLastname;

	@Column(name = "contact_firstname")
	private String contactFirstName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "country")
	private String country;

	@Column(name = "sales_rep_employee_id")
	private Integer salesRepEmployessId;

	@Column(name = "credit_limit", columnDefinition = "Decimal(10,2)")
	private Double creditLimit;

	
	

	// =========Getters and setters============

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setContactLastname(String contactLastname) {
		this.contactLastname = contactLastname;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCountry(String country) {
		this.country = country;

	}

	public void setSalesRepEmployessId(Integer salesRepEmployessId) {
		this.salesRepEmployessId = salesRepEmployessId;
	}

	
	

	public Integer getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getContactLastname() {
		return contactLastname;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public Integer getSalesRepEmployessId() {
		return salesRepEmployessId;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	
}
