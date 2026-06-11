public class Player 
{
    //Instance variables
    private double weapon;
    private double chestPiece;
    private double leggings;
    private double boots;
    private double ring;
    private double shoulderPiece;
        
    //Constructors
    public Player()
    {
        weapon = 1;
        chestPiece = 1;
        leggings = 1;
        boots = 1;
        ring = 1;
        shoulderPiece = 1;
    }
        
    public Player(double weapon, double chestPiece,
    double leggings, double boots, double ring, double shoulderPiece)
    {
        this.weapon = weapon;
        this.chestPiece = chestPiece;
        this.leggings = leggings;
        this.boots = boots;
        this.ring = ring;
        this.shoulderPiece = shoulderPiece;
    }
        
    //Getters 
    public double getWeapon()
    {
        return weapon;
    }
        
    public double getChestPiece()
    {
        return chestPiece;
    }
        
    public double getLeggings()
    {
        return leggings;
    }
        
    public double getBoots()
    {
        return boots;
    }
        
    public double getRing()
    {
        return ring;
    }
        
    public double getShoulderPiece()
    {
        return shoulderPiece;
    }
    
    public int getTotalPower()
    {
        return (int) (weapon + ring + shoulderPiece);
    }
    
    public int getTotalHealth()
    {
        return (int) (chestPiece + leggings + boots);
    }
        
        
    //Setters 
        
    public void setWeapon(double weapon)
    {
        this.weapon = weapon;
    }
        
    public void setChestPiece(double chestPiece)
    {
        this.chestPiece = chestPiece;
    }
        
    public void setLeggings(double leggings)
    {
        this.leggings = leggings;
    }
  
    public void setBoots(double boots)
    {
        this.boots = boots;
    }
        
    public void setRing(double ring)
    {
        this.ring = ring;
    }
  
    public void setShoulderPiece(double shoulderPiece)
    {
        this.shoulderPiece = shoulderPiece;
    }
    
  
    //Returns the total Damage and Health the player has
    public String toString()
    {
        return "Total Damage: " + getTotalPower() +
        "\nTotal Health: " + getTotalHealth();
    }
  
  
}
