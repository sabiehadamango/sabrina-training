package basics;
public class Lab1 {

	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(4));
		
		// Write a function that computes factorial "hint: use recursion, n = n*(n-1)! = n*(n-1)*(n-2)! = n*(n-1)*(-2)
		System.out.println("Factorial: " + fact(5));
		
		//Write 3 functions that return the min, avg, and max of an array
		int[] numbers = {5, -2, 0 ,234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
	}
	
		private static String fact(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		private static char[] sum(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		private static String findMax(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

		public static int findAvg(int[] arr) {
			// Take sum, divide by number of elements
			int sum=0;
			for (int n=0; n<arr.length; n++) {
				sum = sum + arr[n];
			}
			System.out.println("Sum: " + sum);
			return sum/arr.length;
		}
		
		public static int findMin(int[] arr) {
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
				min = arr[i];
				}
			}
			return min;
			
		}
		
}
		
		