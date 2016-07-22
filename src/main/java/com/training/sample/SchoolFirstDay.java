package com.training.sample;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SchoolFirstDay {
	
	String [] schoolbag= null;

	public String[] prepareMyBag() {
		schoolbag = new String[] { "Books", "Notebooks", "Pens" };
		System.out.println("My school bag contains: " + Arrays.toString(schoolbag));
		return schoolbag;
	}

	public String[] addPencils() {
		schoolbag = new String[] { "Books", "Notebooks", "Pens", "Pencils" };
		System.out.println("Now my school bag contains: " + Arrays.toString(schoolbag));
		return schoolbag;
	}
	
	public String[] sortItems()
	{
		List<String> wordList = new ArrayList<String>(); 
		wordList= Arrays.asList(schoolbag);  
		Collections.sort(wordList,(s1, s2) -> s1.compareTo(s2));
		schoolbag= wordList.toArray(schoolbag);
		return schoolbag;
	}
}
