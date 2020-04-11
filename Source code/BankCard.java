//BankCrard class

public class BankCard
{
	private String Card_Name;
	private String Card_Number;
	private Date Expire_Date;
	private String Security_code;
	private DLL<String> operations = new DLL<>(); // linked list who's hold operations.	
	public BankCard(String name,String CN,Date ED,String secure)
	{
		this.Card_Name = name;
		this.Card_Number = CN;
		this.Expire_Date = ED;
		this.Security_code = secure;
	}

	public String getCard_Name() {
		return Card_Name;
	}

	public void setCard_Name(String card_Name) {
		Card_Name = card_Name;
	}

	public String getCard_Number() {
		return Card_Number;
	}

	public void setCard_Number(String card_Number) {
		Card_Number = card_Number;
	}

	public Date getExpire_Date() {
		return Expire_Date;
	}

	public void setExpire_Date(Date expire_Date) {
		Expire_Date = expire_Date;
	}

	public String getSecurity_code() {
		return Security_code;
	}

	public void setSecurity_code(String security_code) {
		Security_code = security_code;
	}

	
	public DLL<String> getOperations() {
		return operations;
	}

	public void setOperations(DLL<String> operations) {
		this.operations = operations;
	}
	
	public void addOperation(String op){
		operations.addFirst(op);
	}
	


}
