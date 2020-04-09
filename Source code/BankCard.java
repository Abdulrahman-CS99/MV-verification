public class BankCard
{
	String Card_Name;
	String Card_Number;
	String Expire_Date;
	String Security_code;
	
	public BankCard(String name,String CN,String ED,String secure)
	{
		this.Card_Name = name;
		this.Card_Number = CN;
		this.Expire_Date = ED;
		this.Security_code = secure;
	}
}