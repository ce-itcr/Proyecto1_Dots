package app.client;

import app.server.Player;
import app.server.Turn;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import util.List;


public class Game  {
	
	Player p1;
	Player p2;
	Turn b1;
	
	public static String[] lines = new String[24];
	
	public Game() {
		
		this.p1	= new Player(1);
		this.p2	= new Player(2);
		this.b1 = new Turn(p1, p2);
		
	}

	
	public void setPoints(javafx.scene.input.MouseEvent event) {
		
		if(this.p1.getTurn()){
			this.p1.scorePoints();
			((Line)event.getSource()).setStroke(Color.BLUE);
			p1.switchTurn();
		}
		else{
			this.p2.scorePoints();
			((Line)event.getSource()).setStroke(Color.RED);
			p1.switchTurn();
		}
	}
	
}
