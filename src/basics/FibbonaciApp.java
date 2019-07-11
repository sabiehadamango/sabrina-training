package basics;

public class FibbonaciApp {

	public static void main(String[] args) {
		// Fibbonaci number is defined by the sum of the two previous fibonnaci numbers
		// fib [0] = 0
		// fib [1] = 1
		// fib[2] = fib(1) + fib(0) = 0 + 1 = 1
		// etc
		System.out.println(fib(5));
	}
	public static int fib(int n) {
			if (n==0) {
				return 0;
			}
			else if (n == 1) {
				return 1;
			}
			return ( ((fib(n-1)) + (fib(n-2))) );
		}

	}


