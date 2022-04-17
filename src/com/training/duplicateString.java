package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class duplicateString {
   public static void main(String[]args) {
Map<String, String> map = new HashMap<>();
 map.put("1","One");
 map.put("2", "Two");
 map.put("3", "Three");
 map.put("5", "Five");
 map.put("6", "Three");
 
 System.out.println("Before HashSet: "+map);
 System.out.println("\n");

Set<String> set = new HashSet<String>();
map = map.entrySet().stream()
.filter(entry -> set.add(entry.getValue()))
.collect(Collectors.toMap(Map.Entry:: getKey,Map.Entry::getValue));
System.out.println("After HashSet: "+map);

}
}