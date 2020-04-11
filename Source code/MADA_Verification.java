import java.util.Scanner;

public class MADA_Verification
{
	//BankCard CardInfo;
	DLL<BankCard> Cards = new DLL<BankCard>(); // linked list who's hold Cards.
	Scanner input = new Scanner(System.in);
	
// ----------------------------------------------- Adding bank card ---------------------------------------------------------------------------------------------------------------------------------------------------------------
				
	public void AddingBankCard(BankCard i)// i contains (name,CardNumber,ExpireDate,SecurityCode).
	{
		Cards.addLast(i);// add last to Linked List which mean: First card for mr.Omair will be first one and so on 
		System.out.print(i.getCard_Name()+" Card added successfully \n");
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
		Node<BankCard> n =  Cards.getHead();// node for the first card.
		boolean f = true;
		int c = 1;
		
		while (n != null)// this loop work until next node is null.
		{
			if (!f)// this for count cards 1st,2nd,3rd ... etc cards. 
			{
				c++;
			}
			f = false;
						
			System.out.print(c+") "+"Card information: ( CardName: "+n.getItem().Card_Name+" , CardNumber: "+n.getItem().Card_Number+" , ExpireDate: "+n.getItem().Expire_Date+" , SecurityCode:"+n.getItem().Security_code+" )");
			System.out.println();
			n = n.getNext();

		}
	}	*/
	
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
			System.out.print(c+") "+n.getItem().getCard_Name()+" ");
			String s = n.getItem().getCard_Number().substring(15);
			System.out.print("xxxx-xxxx-xxxx-"+s+"\n");
				
			c++;
			n = n.getNext();
		}
		
		System.out.print("\nEnter which Card details you want to see: ");
		
		int userInput = input.nextInt();// user will enter number of card which one of the list.
		
		Node<BankCard> tmp =  Cards.getHead();
		try{
		
			int count=1;//3

			while( count != userInput){
			tmp=tmp.getNext();
			count++;
		}
		System.out.print("Card information: ( CardName: "+tmp.getItem().getCard_Name()+" , CardNumber: "+tmp.getItem().getCard_Number()+" , ExpireDate: "+tmp.getItem().getExpire_Date().displayDate()+" , SecurityCode:"+tmp.getItem().getSecurity_code()+" )");

		}
		catch(Exception e)
		{
			System.out.print("\nwrong input, There are no card.");
		}
	}
	
	
// ------------------------------------------------ Show latest operation ---------------------------------------------------------------------------------------------------------------------------------------------------------------

public void ShowLatestOperation(){
		
		Node<BankCard> tmp =  Cards.getHead();// node for the first card.
		int count = 1;

		System.out.print("\n\nlist of Cards:\n\n");
					
		while(tmp != null)
		{
			//System.out.println(c+") "+n.getItem().Card_Name+" , "+n.getItem().Card_Number);
			System.out.print(count+") "+tmp.getItem().getCard_Name()+" ");
			String s = tmp.getItem().getCard_Number().substring(15);
			System.out.print("xxxx-xxxx-xxxx-"+s+"\n");
				
			count++;
			tmp = tmp.getNext();
		}
		
		System.out.print("\n\nEnter which Card do you want to see its latest operations: ");
		
		int userInput = input.nextInt();// user will enter number of card which one of the list.
		
		Node<BankCard> cardNode =  Cards.getHead();// This variable for going to user chose card 
		try{

			int cardsCounter=1;// This variable for checking which card did the user chose 

			while( cardsCounter != userInput){
				cardNode=cardNode.getNext();
				cardsCounter++;
			}

			if(cardNode.getItem().getOperations().getHead() !=null){ // checking if the card has operations 
				System.out.print("\nLast operations for card number xxxx-xxxx-xxxx-"+ cardNode.getItem().getCard_Number().substring(15) +":");
	 
			 
			int opCount=1; // count for counting last 3 operations
			Node opNode= cardNode.getItem().getOperations().getHead(); // this node is for going to the latest operations
			
			System.out.print("(");
			while(opNode.getNext()!=null && opCount < 3){
						System.out.print(" "+opNode.getItem()+" ,");
						opNode=opNode.getNext();
						opCount++;
					}
												 	
						 System.out.println(" "+opNode.getItem()+" )");
					 }
					 else {
						 System.out.println("There are no operations in this card"); // this wil happen if the card has no operation 
					 }
					 System.out.println();
	

			}
			catch(Exception e)
			{
				System.out.print("\nwrong input, There are no card.");
			}


		
	}



// -------------------------------------------------- Driver Class -------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String args[])
	{
		MADA_Verification MV = new MADA_Verification();


		// -------------------------------------------------- Card 1 -------------------------------------------------------------------------------------------------------------------------------------------------------------------
			BankCard card1=new BankCard("Omair","1234-5678-9101-1121",new Date(04,21),"123");
			card1.addOperation("Transfer");// adding the first operation for card1
			card1.addOperation("new beneficiary"); // adding the second  operation for card1
			card1.addOperation("Government payments"); // adding the third  operation for card1
			card1.addOperation("Online shopping"); // adding the fourth operation for card1
			 MV.AddingBankCard(card1);// this for adding the card 
		
		// -------------------------------------------------- Card 2 -------------------------------------------------------------------------------------------------------------------------------------------------------------------
			BankCard card2=new BankCard("Sulaiman","1121-5678-9101-4456",new Date(04,23),"321");
			card2.addOperation("Online shopping");// adding the first  operation for card2
			MV.AddingBankCard(card2);// this for adding

		// -------------------------------------------------- Card3-------------------------------------------------------------------------------------------------------------------------------------------------------------------
			BankCard card3=new BankCard("Omar","4323-5678-9101-2800",new Date(06,24),"456");
			card3.addOperation("Transfer"); // adding operation for card3
			card3.addOperation("Online shopping"); // adding operation for card3
			MV.AddingBankCard(card3);// this for adding
		
		// -------------------------------------------------- Card4-------------------------------------------------------------------------------------------------------------------------------------------------------------------

			BankCard card4=new BankCard("Abdulrahman","2131-6678-7891-3232",new Date(01,21),"840");
			card4.addOperation("new beneficiary"); // adding operation for card4
			MV.AddingBankCard(card4);
			
			
			MV.ShowCardDetails();// show specific card details. user could be able to show (one of the added cards) details.
			MV.ShowLatestOperation();// show the last three operation for the user chose card 

		
		
		
		
	}
	

}
