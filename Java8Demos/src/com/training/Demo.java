package com.training;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface Calculator{
	void calculate(int x,int y);
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Calculator calc1 = (int x, int y)-> System.out.println(x*y);
         calc1.calculate(10,20);
         
         
         Consumer<String> con = (s)->System.out.println(s.toUpperCase());
         con.accept("hello");
         Consumer<Integer> in = (t)->System.out.println("sq"+t*t);
         in.accept(10);
         
         
         Predicate<String> pred1 = (s)->s.length()>5;
         System.out.println(pred1.test("hello"));
         pred1 = (s) -> s.toLowerCase().equals("welcome");
         
	}

}
