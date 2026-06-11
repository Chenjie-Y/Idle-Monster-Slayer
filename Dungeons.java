public class Dungeons 
{
    public int[] dungeonOne(int power)
    {
        int coins = 0;
        int flesh = 0;
        
        for (int i = 0; i < 3; i++)
        {
            int monsterHp = (int) (Math.random() * 5) + 25;
            
            if ( power >= monsterHp || monsterHp > 20)
            {
                coins += 20;
                flesh += 5;
            }
        }
        
        return new int[]{coins,flesh,0};
    }
    
    public int[] dungeonTwo(int power)
    {
        int coins = 0;
        int flesh = 0;
        int potion = 0;
        
        for (int i = 0; i < 4; i++)
        {
            int monsterHp = (int) (Math.random() * 5) + 100;
            
            if ( power >= monsterHp || monsterHp > 90 )
            {
                coins += 50;
                flesh += 10;
                potion++;
            }
        }
        
        return new int[]{coins, flesh, potion};
    }
    
    public int[] dungeonThree(int power)
    {
        int coins = 0;
        int flesh = 0;
        int tickets = 0;
        
        for (int i = 0; i < 5; i++)
        {
            int monsterHp = (int) (Math.random() * 5 ) + 250;
            
            if ( power >= monsterHp || monsterHp > 240 )
            {
                coins += 75;
                flesh += 15;
                tickets++;
            }
        }
        
        return new int[]{coins, flesh, tickets};
    }

}
