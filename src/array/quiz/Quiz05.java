package array.quiz;

public class Quiz05 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("배열에서 가장 작은 값은 " + min + "입니다.");
		System.out.println("배열에서 가장 큰 값은 " + max + "입니다.");

	}

}
