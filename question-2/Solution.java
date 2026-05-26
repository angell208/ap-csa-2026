public class Bottle
{
    private double capacity;
    private double amount;

    public Bottle(double cap)
    {
        capacity = cap;
        amount = cap;
    }

  
    public double updateAmount(double removeAmt)
    {
        amount -= removeAmt;

        if (amount < 0.25 * capacity)
        {
            amount = capacity;
        }

        return amount;
    }
}
