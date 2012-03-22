//Shaun Donachy
//Created 11/04/2010
//Last Modified 11/06/2010

//This program will randomly pick a game map for a 1v1 game.

import javax.swing.JOptionPane; 
public class Pick1PGame
{
	public static void main (String[] args)
	{
		String[] gameList = {"1v1","2v2", "2vAI", "3vAI"};
		String[] mapList = { "Abyssal Caverns", "Antiga Shipyard", "Backwater Gulch", "Xel'Naga Caverns", "Nerazim Crypt", "Shakuras Plateau", "Searing Crater", "Tal'Darim Altar", "The Shattered Temple", "Typhon Peaks"};
		
		int mapLength = mapList.length;
		int gameLength = gameList.length;
		
		int rand2 = 0;
		int rand1 = (int) (Math.random() * mapLength);

		switch (rand2){
			
			case 0:
			JOptionPane.showMessageDialog(null, "Play " + gameList[0] + " on " + mapList[rand1]);
			break;
			case 1:
			JOptionPane.showMessageDialog(null, "Play " + gameList[1]);
			break;
			case 2:
			JOptionPane.showMessageDialog(null, "Play " + gameList[2]);
			break;
			case 3:
			JOptionPane.showMessageDialog(null, "Play " + gameList[3]);
			break;
			default:	System.out.println("I don't know what happened");
		}//end switch
						 

	}//end main()
}//end PickGame