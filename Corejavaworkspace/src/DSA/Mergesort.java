package DSA;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[] = { 6, 5, 4, 3 };

		divide(arr);

	}

	static void divide(int arr[]) {
		if (arr.length > 1) {
			return;
		}

		int left[] = new int[arr.length / 2];
		int right[] = new int[arr.length - left.length];

		int i;

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i];

		}
		divide(left);
		System.out.println("left values" + Arrays.toString(left));

		divide(right);
		System.out.println("right values" + Arrays.toString(right));
	}
}
