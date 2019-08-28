package ua.kiev.prog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

public class ExercisesWithCollections {
	
	private static Logger logger = Logger.getLogger(ExercisesWithCollections.class.getName());
	
	static Collection<String> fill (Collection<String> collection) {
		collection.add("krysa");
		collection.add("koshka");
		collection.add("sobaka");
		collection.add("sobaka");
		return collection;
		
	}
	
	@SuppressWarnings("rawtypes")
	static Map fill (Map<String, String> map) {
		map.put("krysa", "Larisa");
		map.put("koshka", "Anfisa");
		map.put("sobaka", "Roksi");
		map.put("sobaka", "Tumba");
		return map;
		
	}
	public static void main(String[] args) {
/*	Collection<Integer> collection = new ArrayList<Integer>(); Using  ArrayList<> 
	Set<Integer> collection = new HashSet<Integer>();//	Using  Set<>
	for (int i = 0; i < 10; i++) 
		collection.add(i);
		for (Integer i : collection) 
		logger.info(i + " ");*/
		
	logger.info(fill(new ArrayList<String>()) + " ");	
	logger.info(fill(new LinkedList<String>()) + " ");	
	logger.info(fill(new HashSet<String>()) + " ");
	logger.info(fill(new TreeSet<String>()) + " ");
	logger.info(fill(new LinkedHashSet<String>()) + " ");
	logger.info(fill(new HashMap<String, String>()) + " ");
	logger.info(fill(new TreeMap<String, String>()) + " ");
	logger.info(fill(new LinkedHashMap<String, String>()) + " ");	

	}

}
