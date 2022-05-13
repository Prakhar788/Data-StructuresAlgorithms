class floor {


	static int floorSearch(
		int arr[], int low,
		int high, int x)
	{
	
		if (low > high)
			return -1;

		
		if (x >= arr[high])
			return high;

	 
		int mid = (low + high) / 2;

	
		if (arr[mid] == x)
			return mid;

		if (
			mid > 0 && arr[mid - 1] <= x && x < arr[mid])
			return mid - 1;

	
		if (x < arr[mid])
			return floorSearch(
				arr, low,
				mid - 1, x);

		return floorSearch(
			arr, mid + 1, high,
			x);
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
		int n = arr.length;
		int x = 7;
		int index = floorSearch(
			arr, 0, n - 1,
			x);
		if (index == -1)
			System.out.println(
				"Floor of " + x + " dosen't exist in array ");
		else
			System.out.println(
				"Floor of " + x + " is " + arr[index]);
	}
}

