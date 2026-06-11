import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class IdleMonsterSlayer extends JFrame
{

    //Instance variables / Global currencies
    private int currency;
    private int tickets;
    private int flesh; 
    private int potions;
    private int gems;
    private int cash;

    //Has-a Relationships
    private Player player;
    private Shop shop;
    private Dungeons dungeons;
    
    //ArrayList
    private ArrayList<String> techTree;
    
    //Screens
    private JPanel homeScreen;
    private JPanel dungeonScreen;
    private JPanel shopScreen;
    private JPanel playerPanel;
    
/*        //Buttons
    private JButton homeButton;
    private JButton dungeonsButton;
    private JButton shopButton;
    private JButton playerButton;*/
    
    //Shop Buttons
    private JButton buyCurrency;
    private JButton buyTickets;
    private JButton buyFlesh;
    private JButton buyPotions;
    private JButton buyGems;

    private JLabel resourceLabel;
    
    
    //Constructor
    public IdleMonsterSlayer()
    {
        player = new Player();
        shop = new Shop();
        dungeons = new Dungeons();
        
        techTree = new ArrayList<String>();
        
        currency = 100;
        tickets = 0;
        flesh = 0;
        potions = 0;
        gems = 20;
        
        JFrame f = new JFrame();
        ImageIcon zombie = new ImageIcon("https://codehs.com/uploads/62d9db75a5ebb53e5783279c0948c363");

        JButton b1 = new JButton("Home");
        JButton b2 = new JButton("Dungeon");
        JButton b3 = new JButton("Shop");
        JButton b4 = new JButton("Info");
        
        JLabel i1 = new JLabel(zombie);
        
        b1.setBounds(250, 450, 90, 25);
        b2.setBounds(120, 450, 120, 25);
        b3.setBounds(350, 450, 90, 25);
        b4.setBounds(450, 450, 90, 25);
        i1.setBounds(200, 200, 300, 300);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(i1);
        
        //Code for the speical feature
        /*if ( cash < 25 )
        {
            JLabel popUp = new JLabel("eyy free cash thanks man");
            popUp.setBounds(150, 150, 300, 300);
            f.add(popUp);
        }
        */
        
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    
    //Updates the resources
    private void updateResources()
    {
        resourceLabel.setText("Coins: " + currency + "| Tickets: " + 
        tickets + "| Flesh: " + flesh + "| Potions: " + potions + 
        "| Gems: " + gems);
    }
    
    
    //Screen methods
    private void goHomeScreen()
    {
        homeScreen.setVisible(true);
        dungeonScreen.setVisible(false);
        shopScreen.setVisible(false);
    }
    
    private void goDungeonScreen()
    {
        homeScreen.setVisible(false);
        dungeonScreen.setVisible(true);
        shopScreen.setVisible(false);
    }
    
    private void goShopScreen()
    {
        homeScreen.setVisible(false);
        dungeonScreen.setVisible(false);
        shopScreen.setVisible(true);
    }
    
    private void playerInfo()
    {
        JOptionPane.showMessageDialog(this, player.toString());
    }
    
    
}
