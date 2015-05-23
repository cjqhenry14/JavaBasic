package java_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;


public class ArrayListTest {

	public static void arraylist_2d()
	{
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i < 5;i++)
			matrix.add(new ArrayList<Integer>());
		
		matrix.get(0).add(1);
		matrix.get(0).add(2);
		matrix.get(1).add(11);
		matrix.get(3).add(31);
		matrix.get(3).add(32);
		
		for(int i = 0;i < 5;i++)
		{
			System.out.println(i + ":" + matrix.get(i).size());
		}
	}
	public static void arraylist_1d_sample()
	{
		ArrayList<Integer> slist= new ArrayList<Integer>();
		for(int i = 0;i < 10;i++)
			slist.add(i);
		
		Random rand = new Random(2);
		//System.out.println(Math.abs(rand.nextInt() % 10));
		//for(i=99; i>=1; --i) swap(a[i], a[rand()%i]);
		for(int i=slist.size() - 1; i>=1; --i) 
		{
			//swap
			int tmp = slist.get(i);
			int ran_idx = Math.abs(rand.nextInt() % i);
			slist.set(i, slist.get(ran_idx));
			slist.set(ran_idx, tmp);
		}
		
		for(int i = 0;i < 10;i++)
			System.out.print(slist.get(i) + " ");

	}
	
	/*<id, hashset<int>>*/
	public static void arraylist_hash()
	{
		ArrayList<HashSet<Integer>> slist= new ArrayList<HashSet<Integer>>();
		for(int i = 0;i < 5;i++)
			slist.add(new HashSet<Integer>());
		
		slist.get(0).add(10);
		slist.get(0).add(20);
		slist.get(1).add(30);
		for(int i = 0;i < 5;i++)
			System.out.println(i + " " + slist.get(i).size());
	}
	
	/*sort*/
	public static void arraylist_sort()
	{
		ArrayList<Integer> slist= new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			slist.add((int) (Math.random() * 100));
        }
        Collections.sort(slist);
        for (int i = 0; i < 10; i++) {
        	System.out.print(slist.get(i) + " ");
        }
        int top10 =(int)(slist.size() * 0.3f);
        System.out.print("\n" + slist.get(top10));
	}
	
	public static void main(String[] args) {
		//arraylist_2d();
		//arraylist_1d_sample();
		//arraylist_hash();
		arraylist_sort();
	}

}
