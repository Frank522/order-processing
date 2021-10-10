
public class PaymentInfo {
	public String creditCardNumber;
	public String expirationDate;
	public String cvvCode;
	public PaymentInfo(String creditCardNumber, String expirationDate, String cvvCode) {
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cvvCode = cvvCode;
	}
}
