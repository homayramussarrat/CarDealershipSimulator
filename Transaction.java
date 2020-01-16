import java.util.GregorianCalendar;

public class Transaction
{
    //Homayra Mussarrat
    //500-834-556


    private GregorianCalendar transactionDate; //creates gregorian calender date
    private int transactionID;
    private Car carBought;
    private String salesPerson;
    private double salePrice;
    private String transactionType; //BUY or RETURN

     public Transaction(int transactionID, GregorianCalendar transactionDate, Car carBought, String salesPerson, String transactionType, double salePrice)
             //stores all the parameters in transaction
     {
         this.transactionID = transactionID;
         this.transactionDate = transactionDate;
         this.carBought = carBought;
         this.salesPerson = salesPerson;
         this.transactionType = transactionType;
         this.salePrice = salePrice;

     }



     public String display() //displays the transaction item
     {
         return "ID: " + this.transactionID + " Date: " + this.transactionDate + " Car " + this.carBought + " Sales person "
                 + this.salesPerson + " transaction type: " +  this.transactionType + " price: " + this.salePrice;
     }

     public int getTransactionID() //gets the transaction ID
     {
         return this.transactionID;
     }





}
