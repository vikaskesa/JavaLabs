import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6_1 {
	static List getValues (HashMap<Integer,String> map) {
		Collection col=map.values();
		ArrayList newList = new ArrayList<>(col);
		Collections.sort(newList);
		return  newList;
		
	}

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1001,"Vikas");
		map.put(1007, "Teja");
		map.put(1005, "Srinu");
		map.put(1010, "Manohari");
		List list=getValues(map);
		System.out.println(list);
		

	}

}
