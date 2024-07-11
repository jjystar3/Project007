package arraylist.quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		
		char ch1 = list.get(0);
		System.out.print(ch1 + " ");
		
		System.out.println(list);

	}

}
