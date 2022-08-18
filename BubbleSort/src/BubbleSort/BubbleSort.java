package BubbleSort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 9, 4, 7, 2, 6, 5, 1, 3, 8 };
		
		bubbleSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}