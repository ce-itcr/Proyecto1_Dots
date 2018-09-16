package application.game;

public class Player {
	
	int points;
	boolean turn;
	
	public Player(int p) {
		
		this.points = 0;
		this.turn = false;
		
	}
	
	public void switchTurn(){
		
		if(this.turn){
			this.turn = false;
		}
		else {
			this.turn = true;
		}
	}
	
	public void setTurn(Boolean turn){
		this.turn = turn;
	}
	
	public boolean getTurn(){
		return this.turn;
	}
	
	public void scorePoints(){
		this.points += 2;
	}
	
	public int getScore(){
		
		return this.points;
	}

}