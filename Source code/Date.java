public  class Date
{
   private int month;
   private int day;
   private int year;

   // constructor
   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   // second constructor which take only the month and the year    
   public Date(int month, int year)
   {
      this.month = month;
      this.year = year;
   }

   // set the month
   public void setMonth(int month)
   {
      this.month = month;
   } 

   // return the month
   public int getMonth()
   {
      return month;
   }

   // set the day
   public void setDay(int day)
   {
      this.day = day;
   }

   // return the day
   public int getDay()
   {
      return day;
   }

   // set the year
   public void setYear(int year)
   {
      this.year = year;
   } 
   
   // return the year
   public int getYear()
   {
      return year;
   } 

   // display the date
   public String displayDate()
   {
      
      return String.format("%d/%d",getMonth(),getYear());}
 

      

} // end class Date