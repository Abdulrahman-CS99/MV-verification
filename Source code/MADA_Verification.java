
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
	//public void ShowCardDetails()
	//{
		/*
			Which Card Details you want to see:
			1) Omair , xxxx-xxxx-xxxx-1121
			2) Sulaiman , xxxx-xxxx-xxxx-4456
			
			input: if (1) --> then Omair's card will show up , if (2) --> then Sulaiman's card will be show up.
		*/
		/*
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

		}*/
	
		public void ShowCardDetails()
		{
			/*
				list of Cards:
				1) Omair , xxxx-xxxx-xxxx-1121
				2) Sulaiman , xxxx-xxxx-xxxx-4456
			
				input: if (1) --> then Omair's card will show up , if (2) --> then Sulaiman's card will be show up.
			*/
		
			Node<BankCard> n =  Cards.getHead();// node for the first card.
			int c = 1;

			System.out.print("\nlist of Cards:\n\n");
					
			while(n != null) 
			{
			//System.out.println(c+") "+n.getItem().Card_Name+" , "+n.getItem().Card_Number);
			System.out.print(c+") "+n.getItem().Card_Name+" ");
			String s = n.getItem().Card_Number.substring(15);
			System.out.print("xxxx-xxxx-xxxx-"+s+"\n");
				
			c++;
			n = n.getNext();
			}
		
			System.out.print("\nEnter which Card details you want to see: ");
		
			int userInput = input.nextInt();// user will enter number of card which one of the list.
		
			Node<BankCard> tmp =  Cards.getHead();
			try{
			switch(userInput)// 2
			{
				case 1: 
					System.out.print("Card informaiton: ( CardName: "+tmp.getItem().Card_Name+" , CardNumber: "+tmp.getItem().Card_Number+" , ExpireDate: "+tmp.getItem().Expire_Date+" , SecurityCode:"+tmp.getItem().Security_code+" )");
					System.out.println();
					break;
				case 2: 
					tmp = tmp.getNext();
					System.out.print("Card informaiton: ( CardName: "+tmp.getItem().Card_Name+" , CardNumber: "+tmp.getItem().Card_Number+" , ExpireDate: "+tmp.getItem().Expire_Date+" , SecurityCode:"+tmp.getItem().Security_code+" )");
					System.out.println();
					break;
				case 3: 
					tmp = tmp.getNext().getNext();
					System.out.print("Card informaiton: ( CardName: "+tmp.getItem().Card_Name+" , CardNumber: "+tmp.getItem().Card_Number+" , ExpireDate: "+tmp.getItem().Expire_Date+" , SecurityCode:"+tmp.getItem().Security_code+" )");
					System.out.println();
					break;
				case 4: 
					tmp = tmp.getNext().getNext().getNext();
					System.out.print("Card informaiton: ( CardName: "+tmp.getItem().Card_Name+" , CardNumber: "+tmp.getItem().Card_Number+" , ExpireDate: "+tmp.getItem().Expire_Date+" , SecurityCode:"+tmp.getItem().Security_code+" )");
					System.out.println();2
					break;
				case 5: 
					tmp = tmp.getNext().getNext().getNext().getNext();
					System.out.print("Card informaiton: ( CardName: "+tmp.getItem().Card_Name+" , CardNumber: "+tmp.getItem().Card_Number+" , ExpireDate: "+tmp.getItem().Expire_Date+" , SecurityCode:"+tmp.getItem().Security_code+" )");
					System.out.println();
					break;
				default:
					System.out.print("wrong input, There are no card.");
					break;	
			}
			}
			catch(Exception e)
			{
			System.out.print("\nwrong input, There are no card.");
			}
		}	
}	


