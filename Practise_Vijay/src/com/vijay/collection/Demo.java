package com.vijay.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student("Vijay");
		Student s1 = new Student("Harsha");
		Student s2 = new Student("Me");
		Student s3 = new Student("Hlo");
		Student s4 = new Student("HII");

		List<Student> list = new ArrayList();
		list.add(s);
		list.add(s1);	
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// iterator
		Iterator<Student> iterate = list.iterator();
		for (Student st : list) {
			System.out.println(st.getName());

		}
		System.out.println("=====================");

		Set<Student> set = new HashSet<Student>();
		set.add(s);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for (Student stu : set) {
			System.out.println(stu.getName());

}}}




