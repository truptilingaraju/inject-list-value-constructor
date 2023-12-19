package com.ty;

import java.util.List;

public class Student {

		private String name;
		private List<String> subjectname;
		public Student(String name, List<String> subjectname) {
			super();
			this.name = name;
			this.subjectname = subjectname;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", subjectname=" + subjectname + "]";
		}
		
		
 }
