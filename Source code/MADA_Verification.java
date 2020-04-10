
public class MADA_Verification
{
	//BankCard CardInfo;
	DLL<BankCard> Cards = new DLL<BankCard>(); // linked list whos hold Cards.
	
	
// ----------------------------------------------- Adding bank card ---------------------------------------------------------------------------------------------------------------------------------------------------------------
				
	public void AddingBankCard(BankCard i)// i contains (name,CardNumber,ExpireDate,SecurityCode).
	{
		Cards.addLast(i);// add last to Linked List which mean: First card for mr.Omair will be first one and so on 
		System.out.print(i.Card_Name+" Card added succsesfuly \n");
	}

// ----------------------------------------------- Show card details ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void ShowCardDetails()
	{
		/*
			Which Card Details you want to see:
			1) Omair , xxxx-xxxx-xxxx-1121
			2) Sulaiman , xxxx-xxxx-xxxx-4456
			
			input: if (1) --> then Omair's card will show up , if (2) --> then Sulaiman's card will be show up.
		*/
		
		Node<BankCard> n =  Cards.getHead(); // Node for the first card.
		boolean f = true;
		int c = 1;
		
		while (n != null)// This loop work until next node is null.
		{
			if (!f)// This for count cards 1st,2nd,3rd ... etc cards. 
			{
				c++;
			}
			f = false;
						
			System.out.print(c+") "+"Card informaiton: ( CardName: "+n.getItem().Card_Name+" , CardNumber: "+n.getItem().Card_Number+" , ExpireDate: "+n.getItem().Expire_Date+" , SecurityCode:"+n.getItem().Security_code+" )");
			System.out.println();
			n = n.getNext();

		}
	}
	
	public static void main(String args[])
	{
		MADA_Verification MV = new MADA_Verification();
		
		
		//	BankCard(String name,String CN,String ED,String secure) --> change all to String better :D.
		MV.AddingBankCard(new BankCard("Omair","1234-5678-9101-1121","04/21","123"));// this for adding
		MV.AddingBankCard(new BankCard("Sulaiman","1121-5678-9101-4456","04/23","321"));
		MV.AddingBankCard(new BankCard("Omar","4323-5678-9101-2800","09/20","456"));
		MV.AddingBankCard(new BankCard("Abdulrhamn","2131-6678-7891-3232","01/22","840"));
		
		MV.ShowCardDetails();// show specific card details. user could be able to show (one of cards) details.
		
	}
}


