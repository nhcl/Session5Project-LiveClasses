package Session5.Project1;

import com.sun.tools.javac.util.List;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	collectionsExamples();
    }
    
    static void mapExample() {
    	//Map
    	//Create naming conventions to quickly find objects
    	//key --> points to --> hashcode --> memory(not relevant how many keys)
    	//if you have million cars the speed is same as as if you have two cars
    	Map<String, Cars> carsByNickname = new HashMap<String, Cars>();
    	
    	carsByNickname.put("tez", new Tesla("123344"));
    	carsByNickname.put("goat", new Toyota("46767879"));
    	
    	Set<String> nicknames = carsByNickname.keySet();
    	for(int i = 0; i< nicknames.toArray().length; i++) {
    		System.out.println(nicknames.toArray()[i]);
    	}
    }
    
    static void collectionsExamples() {
    	//Stack of cars at Garage
    	Stack<Cars> carsInGarage = new Stack<Cars>();
    	carsInGarage.add(new Toyota("34645"));
    	carsInGarage.add(new Toyota("5634574"));
    	carsInGarage.add(new Toyota("89678956"));
    	carsInGarage.add(new Tesla("8908985"));
    	
    	Cars easyToTakeFromGarage = carsInGarage.pop();
    	
    	System.out.println("The easiest to take out of garage electric " + easyToTakeFromGarage);
    	
    	//Queue of cars at carwash
    	Queue<Cars> carsQueueAtCarwash = new LinkedList<Cars>();
    	carsQueueAtCarwash.add(new Toyota("23543"));
    	carsQueueAtCarwash.add(new Toyota("5686786"));
    	carsQueueAtCarwash.add(new Toyota("8578657"));
    	carsQueueAtCarwash.add(new Tesla("123445"));
    	
    	Cars nextInLine = carsQueueAtCarwash.remove();
    	
    	System.out.println("Is next in line at carwash electric: " + nextInLine);
    	
    	
    	
    	//Arrays are fixed in size
        Cars[] carsArray = new Cars[10];
        carsArray[0] = new Tesla("4563456");
        carsArray[1] = new Toyota("63463456");
        for(int i=0; i<carsArray.length;i++) {
        	if(carsArray[i]!=null) {
        		System.out.println(carsArray[i].isElectric());
        	}
        	else {
        		System.out.println("No car at entry " + i);
        	}	
        }
        
    	ArrayList<Cars> carsList = new ArrayList<Cars>();
    	carsList.add(new Tesla("568767856745"));
    	carsList.add(new Toyota("12345456768"));
    	
    	for(int i=0; i<carsList.size(); i++) {
    		System.out.println(carsList.get(i).isElectric());
    	}
    }
    
    static void kiwiExample() {
        fruit kiwi = new fruit();
        kiwi.printGood();

        fruit veryGoodKiwi = new fruit(true);
        veryGoodKiwi.printGood("Super good");
    }
    
}
