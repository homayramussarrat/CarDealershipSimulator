import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AccountingSystem
{
    //Homayra Mussarrat
    //500-834-556

    public ArrayList<Transaction> transactionsList;  //ADDS TO TRANSACTION


    public AccountingSystem()
    {
        transactionsList = new ArrayList<Transaction>(); //creates a list of type transaction

    }

    public String add(GregorianCalendar date, Car car, String person, String type, double price) //adds parameters
    {
        int IDnumber = (int) (Math.random()*100);
        Transaction transaction = new Transaction(IDnumber, date, car, person, type, price);
        transactionsList.add(transaction);

        return transaction.display();

    }

    public Transaction getTransaction(int ID) //gets transaction based on transaction ID
    {
        for(int i=0; i < transactionsList.size(); i++)
        {
            if(transactionsList.get(i).getTransactionID() == ID)
            {
                return transactionsList.get(i);
            }

        }

        return null;
    }



}
