package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void getMapDemo() {
		
		Map<String,Pet> m = new HashMap<String,Pet>();
		m.put("xiaoming",new Pet("xiaomingCat"));
		System.out.println(m.get("xiaoming").name);
	}
}


class Pet{
	public String name;
	public Pet(String name) {
		this.name = name;
	}
}