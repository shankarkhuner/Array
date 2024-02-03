package arrayPractice;
import java.util.HashMap;
import java.util.Map;
public class HashSet {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		      //(Key,Value)
		map.put("Indin",140);
		map.put("USA" ,30);
		map.put("Chaina", 155);
		
			System.out.println(map);
			map.put("Chaina" ,160);// If Key is already present in the map then the vale is update by the new value of the key;
		System.out.println(map);//If Key doesent exist the the new value pair is create.
		
		
		
		// If we want to get the value present with the key.
		System.out.println(map.get("Chaina"));// It will print 160 Becase value along with key chaina is 160.
		System.out.println(map.get("Indonesia"));// If key is not present in the map then it will print null value.
		
		
		// How to Iterate the 1 by 1 value
		for(Map.Entry<String,Integer> e:map.entrySet()) 
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
	}

}
