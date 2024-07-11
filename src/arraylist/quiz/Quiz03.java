package arraylist.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		for (String str : list) {
			System.out.print(str + " ");
		}

		int listLength = list.size() - 1;

		for (int i = 0; i <= listLength; i++) {
			list.remove(listLength - i);
		}

		// list.removeAll(list);

		System.out.print("\n" + list.size());

	}

}
