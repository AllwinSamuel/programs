import java.io.*;
class GFG {


	static int RSF(int n)
	{
		while (n >= 10) {

			// Creating an extra copy of n
			int x = n;
			int l = 0;

			// Counting the number of digits in n
			while (n > 0) {
				n = n / 10;
				l++;
			}

			// Now n is 0
			// Creating an array of length l
			int a[] = new int[l];

			// Initializing i with the last index of array
			int i = l - 1;

			while (x > 0) {

				// Filling array from right to left
				a[i] = x % 10;
				x = x / 10;
				i--;
			}

			for (int j = 0; j < l - 1; j++) {

				n = n * 10 + Math.abs(a[j] - a[j + 1]);
			}
		}


		return n;
	}

	public static void main(String[] arg)
	{
		int n = 6972;

		int ans = RSF(n);

		System.out.println(ans);
	}
}
