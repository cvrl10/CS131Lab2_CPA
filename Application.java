
public class Application 
{
	public static void main(String[] args)
	{
		Wizard game = new Wizard("Dr Strange");
		
		System.out.println(game.getHealth());
		System.out.println(game.getKey());
		
		game.setKey(112);
		System.out.println(game.getKey());
		
		game.setKey(15);//making sure my key is the original key I set it to
		System.out.println(game.getKey());
		
		System.out.println(game.isLocked());
		
		game.lock(112);//locking the Wizard
		System.out.println(game.isLocked());
		
		game.takeDamage(25);//Wizard shouldn't take any damage since it's locked
		System.out.println(game.getHealth());
		
		game.unlock(112);
		game.takeDamage(25);//Wizard health should now decrease by 25 since Wizard is unlocked
		System.out.println(game.getHealth());
		
		System.out.println();
		
		Wizard game2 = new Wizard();//testing empty argument constructor
		game2.setName("Harry");
		System.out.println(game2);
	}//end main
}
