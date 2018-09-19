package app.server;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Game {
	
	public Player P1;
	public Player P2;
	public Turn b1;

	public static String[] lines = new String[24]; // Mover Server
	public static String[][] dots = new String[4][4]; // Mover Server
	
	public void setScore(javafx.scene.input.MouseEvent event) {
			
			if(this.P1.getTurn()){
				this.P1.scorePoints();
//				((Line)event.getSource()).setStroke(Color.web("#FFAE52"));
				P1.switchTurn();
			}
			else{
				this.P2.scorePoints();
//				((Line)event.getSource()).setStroke(Color.web("#95F4F1"));
				P1.switchTurn();
			}
		}
		
	public static void linkedListToArray(){ // Mover Server
		
		NodeList LN = List.firstPointFinal;
		System.out.println(List.firstPointFinal);
		NodeList LN1 = LN.matrix.firstPoint;
		int i = 0;
		int j = 0;
		while(LN != null) {
			while(LN1 != null) {
				dots[j][i] = LN1.getPointNumber();
				i++;
				LN1 = LN1.next;
			};
			LN = LN.next;
			try {
				LN1 = LN.matrix.firstPoint;
			}catch (Exception e) {
				System.out.println(e);
			}
			j++; i = 0;
		}
	}
	

}