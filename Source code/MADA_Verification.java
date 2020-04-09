
public class MADA_Verification
{
	//BankCard CardInfo;
	DLL<BankCard> Cards = new DLL<BankCard>(); // linked list whos hold Cards.
	Scanner input = new Scanner(System.in);
	
// ----------------------------------------------- Adding bank card ---------------------------------------------------------------------------------------------------------------------------------------------------------------
				
	public void AddingBankCard(BankCard i)// i contains (name,CardNumber,ExpireDate,SecurityCode).
	{
		Cards.addLast(i);// add last to Linked List which mean: First card for mr.Omair will be first one and so on 
		System.out.print(i.Card_Name+" Card added succsesfuly \n");
	}


