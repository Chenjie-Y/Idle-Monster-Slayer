public class Shop 
{
    //Instance variables
    private double currencyPrice;
    private double ticketPrice;
    private double fleshPrice;
    private double potionPrice;
    private double gemPrice;
    private double cash;
    
    /*shop screen if user clicks on a button on the screen the method will run
    */
    //Constructor
    public Shop()
    {
        currencyPrice = .99;
        ticketPrice = .99;
        fleshPrice = .99;
        potionPrice = .99;
        gemPrice = 1.99;
        cash = 50;
    }
    
    //Getters
    public double getCurrencyPrice()
    {
        return currencyPrice;
    }
    
    public double getTicketPrice()
    {
        return ticketPrice;
    }
    
    public double getFleshPrice()
    {
        return fleshPrice;
    }

    public double getPotionPrice()
    {
        return potionPrice;
    }

    public double getGemPrice()
    {
        return gemPrice;
    }

    //toStirng method
    public String toString()
    {
        return "Shop";
    }

}
