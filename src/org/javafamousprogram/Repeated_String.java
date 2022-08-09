package org.javafamousprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_String {

	public static void main(String[] args) {
		String str = "java selenium testing python selenium testing ui testing mobile java testing";
		System.out.println(str);

		String[] splitstr = str.split(" ");

		int length = splitstr.length;

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < length; i++) {
			if (m.containsKey(splitstr[i]))// condition works if string exists already
			{
				Integer value = m.get(splitstr[i]);// to get repeated values of the word
				m.put(splitstr[i], value + 1); // to store it in entry

			} 
			else 
			{
				m.put(splitstr[i], 1);// if word does not repeat this will execute

			}

		}
		System.out.println(m); // final output
		
		Set<Entry<String, Integer>> entries = m.entrySet();
		for (Entry<String, Integer> entry : entries) 
		{
			if (entry.getValue()>1) {
				
				System.out.println(entry);
			}
		}
		

	
	
	}
}
