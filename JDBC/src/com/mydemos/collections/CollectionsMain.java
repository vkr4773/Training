package com.mydemos.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
//set list

//map


//vector thread safe
//arrayList thread unsafe (fast) no locking

public class CollectionsMain {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<>();

		names.add("raja");
		names.add("raju");
		names.add("raj");
		names.add("raj");
		names.add("rajesh");

		for(String name:names)
		{
		System.out.println(name);
		}
		// TODO Auto-generated method stub

	}

}
