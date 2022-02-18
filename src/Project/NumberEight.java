package Project;

public class NumberEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 10, 1, 45, 10, 32, 750, 50, 100 };

		int min = number[0];

		for (int n = 0; n < number.length; n++) {
			if (number[n] < min) {
				min = number[n];
			}
		}
		System.out.println(min);

		int max = number[0];

		for (int n = 0; n < number.length; n++) {
			if (number[n] > max) {
				max = number[n];
			}
		}
		System.out.println(max);
	}

}
