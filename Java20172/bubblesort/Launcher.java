package bubblesort;

public class Launcher {
    
    public static void sortBubble(int[] a) {

		int tmp = 0;
		boolean swapped = false;
	
		for (int i = 1; i < a.length; i++) {

		    swapped = false;
	
		    // Optimierung 2: Sortiere nur den noch nicht sortierten Teil des Feldes.
		    // (j < a.length - i) statt nur (j < a.length). 
		    for (int j = 0; j < a.length - i; j++) {
		
				if (a[j] > a[j + 1]) {

				    tmp = a[j];
				    a[j] = a[j + 1];
				    a[j + 1] = tmp;
				    swapped = true;
				}
		    }

		    // Optimierung 1: Beende Sortiervorgang, wenn nichts mehr zu sortieren ist.
		    if (swapped == false) {
	
		    	break;
		    }
		}
    }

    public static void main(String[] args) {

    	int[] a = {34, 65, 43, -23, 8, 454, 34, 2, -9, 7, 6, 4, 12, 234, 54, 23, 76, 8, 98, 32};

        Launcher.sortBubble(a);

        for (int i : a) {
            
            System.out.print(i + ", ");
        }

        System.out.println();
    }
}
