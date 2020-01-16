import java.util.LinkedList;
import java.util.ListIterator;

public class SalesTeam
{
    //Homayra Mussarrat
    //500-834-556

    public LinkedList<String> names;
    private ListIterator<String> iterator;
    private int count;

    public SalesTeam() //a constructor that adds members of sales team and stores it in a linked list
    {
        names = new LinkedList<String>();
        iterator = names.listIterator();

        names.add("Ryan");
        names.add("Alex");
        names.add("David");
        names.add("Jordan");
        names.add("Kiara");
        names.add("Veronica");

        count =0;

    }

    public String randomSalesPerson() //gets random member from team //uses random number generator
    {
        int index =  (int) (Math.random() * 6);
        return names.get(index);
    }


    public void getSalesTeam() //uses list iterator and list all sales team members in a string
    {

        System.out.print("Team: ");

        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.print(name + " ");
            count++;

        }


    }

    public int numberSalesTeam() //returns number of ppl in the team
    {

        return count;

    }

    public String getSalesPerson(int indexno) //gets sales person based on index
    {
         return names.get(indexno);
    }

}
