
public class Order {
	public PaymentInfo paymentInfo;
	public Product[] products;
	public ShippingInfo shippingInfo;
	public Order(PaymentInfo paymentInfo, Product[] products, ShippingInfo shippingInfo) {
		this.paymentInfo = paymentInfo;
		this.products = products;
		this.shippingInfo = shippingInfo;
	}
	
}
