
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
}


