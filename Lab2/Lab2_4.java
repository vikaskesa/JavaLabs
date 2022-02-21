class Lab2_4 {

	public static int removeDuplicate(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = {15,10,30,15,8,10,23,30,23};
		int length = arr.length;
		length = removeDuplicate(arr, length);

		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

		System.out.println("Array in Decending order: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}