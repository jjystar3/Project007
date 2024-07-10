package array.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 20) {
				index = i;
			}
		}
		
		System.out.println("20을 가지는 요소의 인덱스는 " + index + " 입니다");
		
	}

}
