package app.server;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import HashMapAndPath.PathList;
import app.communication.Game;
import app.communication.QueueElements;
import app.communication.QueueThread;


public class Main{
	
	public static String[] linesStatic = new String[161];
    
    public static String screen1ID = "main";
    public static String screen1File = "Screen1.fxml";
    public static String screen2ID = "screen2";
    public static String screen2File = "Screen2.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "Screen3.fxml";
    public static String screen4ID = "screen4";
    public static String screen4File = "Screen4.fxml";
    public static List l1;
    public static HashMap<String, HashMapAndPath.ListHashMap> m1;
    public static PathList path = new PathList();

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException { 
    	
    	l1 = app.server.List.createLinkedList();
        Game.linkedListToArray();
        m1 = util.Util.createHashMap();
//        System.out.println(Arrays.toString(linesStatic));
//        System.out.println(ServerCommunication.jsonDataSend());
//        System.out.println(ClientCommunication.jsonDataSend());
        
	     QueueElements queue = new QueueElements();
	     ClientThreads.createClientThreads();
	     Thread z = new Thread(new QueueThread());
	     z.start();
        
    }
    
}