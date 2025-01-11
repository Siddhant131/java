import java.util.Scanner;
class Discount
{
    public static void main ( String args [] )
    {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner ( System.in);
        System.out.println (" Enter your name ");
        String name = Sc.next ();
        System.out.print ("Hi " + name);
        System.out.println (" what is the amount you will be paying ");
        double amount = Sc.nextDouble ();
        System.out.println ("Serial No" + "\t" + "Name" + "\t" + "Ticket Charges" + "\t" + "Discount");
        if ( amount > 70000 )
        {
            System.out.println ("    1" + "\t" + "\t" +   name + "\t" + amount + "\t" + "\t" +  (amount * 18 / 100));
        System.out.println (" The net price is " + ((amount - (amount * 18 / 100))));
    }
        if ( (amount >= 55001) && (amount < 70000))
        {
            System.out.println ("    1" + "\t" +   name + "\t" + amount + "\t" +  (amount * 16 / 100));
        System.out.println (" The net price is " + ((amount - (amount * 16 /100))));
    }
        if ( (amount >= 35001) && (amount < 55000))
        {
            System.out.println ("    1" + "\t" +   name + "\t" + amount + "\t" +  (amount * 12 / 100) );
            System.out.println (" The net price is " + ((amount - (amount * 12/100 ))));
        }
            if (( amount >= 25000) && (amount < 35000))
        {
            System.out.println ("    1" + "\t" +   name + "\t" + amount + "\t" +  (amount * 10 / 100));
            System.out.println (" The net price is " + ((amount - (amount * 10/100 ))));
    }
        if ( amount <= 25001 )
        {
            System.out.println ("     1" + "\t" +   name + "\t" + amount + "\t" +  (amount * 2 / 100) );
        System.out.println (" The net price is " + ((amount - (amount * 2/100 ))));
    }
    }
}


        