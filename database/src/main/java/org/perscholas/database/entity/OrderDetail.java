package org.perscholas.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Integer id;
	
	//@Column(name = "order_id",insertable = false,updatable = false)
	//private Integer OrderId;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "order_id", nullable = false)
	    private Order order;
	 
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "product_id", nullable = false)
	    private Product product;
	 
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	//@Column(name = "product_id")
	//private Integer ProductId;
	
	@Column(name = "quantity_ordered")
	private Integer quantityOrdered;
	
	@Column(name = "price_each",columnDefinition = "Decimal(10,2)" )
	private Double priceEach;
	
	@Column(name = "order_line_number")
	private Short orderLineNumber;
	
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}*/

//	public Integer getProductId() {
//		return ProductId;
//	}
//
//	public void setProductId(Integer productId) {
//		ProductId = productId;
//	}
//
	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}

	public Short getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(Short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
	
	
	
	
}
