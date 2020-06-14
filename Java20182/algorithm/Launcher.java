package algorithm;

import java.util.Arrays;

public class Launcher {

	/**
	 * Sort array using quick sort algorithm.
	 * 
	 * @param a the array
	 * @param l the left index
	 * @param r the right index
	 */
	public static void sort_quick(int[] a, int l, int r) {

		// solange mehr als 1 Folgenelement existiert
		if (l < r) {

			// Variableninitialisierung mit Folgenrändern
			int i = l - 1;
			int j = r;
			int tmp = 0;

			while (true) {

				do {

					// Increment until greater element is found.
					i++;

				} while (a[i] < a[r]);

				do {

					// Decrement until lesser element is found.
					j--;

				} while ((a[j] > a[r]) & (j > i));

				// Break if indices meet.
				if (i >= j) {

					break;
				}

				// Swap lesser with greater element.
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}

			// Swap separating element.
			tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;

			// Call this function recursively for left subsequence.
			Launcher.sort_quick(a, l, i - 1);

			// Call this function recursively for right subsequence.
			Launcher.sort_quick(a, i + 1, r);
		}
	}

	public static void main(String[] args) {

		int[] a = { 34, 65, 43, -23, 8, 454, 34, 2, -9, 7, 6, 4, 12, 234, 54, 23, 76, 8, 98, 32 };

		Launcher.sort_quick(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
	}
}
