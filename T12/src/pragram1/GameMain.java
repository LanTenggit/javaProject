package pragram1;

public class GameMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Initial.StartGame();
		Initial.cardInit();
		Initial.showwujiang();
		Actor []actors=Initial.selectwujiang();
		
		for (int i = 0; i < actors.length; i++) {
			actors[i].giveCard();
			actors[i].showHandCard();
			
		}
		actors[0].fetchCard(2);
		actors[0].showHandCard();
		
	}

}
