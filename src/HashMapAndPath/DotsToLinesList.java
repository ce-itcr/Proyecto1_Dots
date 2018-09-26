package HashMapAndPath;

public class DotsToLinesList {
	
public DotsToLinesNode firstNode;
		
public boolean firstEmpty() {
	
	return (firstNode == null);
	
}

public DotsToLinesList(String line) {

	DotsToLinesNode newDTLNode = new DotsToLinesNode(line);
	newDTLNode.next = firstNode;
	firstNode = newDTLNode;
	
}

public void display() {
	
	DotsToLinesNode DTL = firstNode;
	while (DTL != null) {
		DTL.display();		
		System.out.println("\n");

		
		DTL = DTL.next;
		
	}		
	
	}
}