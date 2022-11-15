package com.git.akash;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add("akash");
		hs.add("20000");
		hs .add("Tanmay");
		System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println("Value contain="+itr.next());
		}
	

	}

}
