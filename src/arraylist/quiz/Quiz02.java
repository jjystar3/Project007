package arraylist.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();

		list.add(true);
		list.add(true);
		list.add(false);

		for (Boolean bool : list) {
			System.out.print(bool + " ");
		}

		System.out.print("\n" + list.get(0) + ", " + list.get(list.size() - 1));
		System.out.print("\n" + list.getFirst() + ", " + list.getLast());

	}

}
