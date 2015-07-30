package java_basic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
2
1, 3, 5, 7
2, 4, 5, 7
========
4 
11 2 3 4 
5 
1 2 6 5 4 

 * 
 * */
public class acm_io {

	static void read_input() throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		//Scanner cin2 = new Scanner(new BufferedInputStream(System.in)); faster
		//sc.useDelimiter("[\\s*]"); 
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print(sc.nextInt() + " ");
			}
			System.out.print("\n");
		}
	}
	static void read_input_douhao() throws FileNotFoundException {
		File file = new File("input-douhao.txt");
		Scanner sc = new Scanner(file);
		int n = Integer.parseInt(sc.nextLine());
		//System.out.print(ii.substring(1, 2)+"\n");//substring [start, end)
		for (int i = 0; i < n; i++) {
			String []line = sc.nextLine().split(",");
			for (int j = 0; j < line.length; j++) {
				System.out.print(line[j] + " ");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		//read_input();
		read_input_douhao();
	}
}
