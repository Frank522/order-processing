
public class ShippingInfo {
	public String name;
	public String address;
	public String city;
	public String state;
	public String ZipCode;
	public String email;
	public String shipping_method;
	public ShippingInfo(String name, String address, String city, String state, String ZipCode, String email, String shipping_method) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.ZipCode = ZipCode;
		this.email = email;
		this.shipping_method = shipping_method;
	}
}
