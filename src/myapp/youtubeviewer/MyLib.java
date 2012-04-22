package myapp.youtubeviewer;

import java.util.HashMap;

public class MyLib {
	//
	static HashMap<Integer, Integer> tabSet = new HashMap<Integer, Integer>();
	
	// set elements
	
	
	//
	public MyLib() {
//		tabSet.put(1, R.id.tab1);
//		tabSet.put(2, R.id.tab2);
//		tabSet.put(3, R.id.tab3);
		tabSet.put(0, R.id.tab1);
		tabSet.put(1, R.id.tab2);
		tabSet.put(2, R.id.tab3);
	}//public MyLib()
	
	// get values
	public HashMap<Integer, Integer> getIdMap() {
		
		return tabSet;
		
	}//public static HashMap<Integer, Integer> getIdMap()
}
