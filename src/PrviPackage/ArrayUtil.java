package PrviPackage;

public class ArrayUtil {
	/**
	 * Funkcija koja ispisuje niz elmenata koji su razdvojeni zarezom
	 * 
	 * @param arr
	 *            niz elemenata koji zelimo isprintati
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

	/**
	 * Funkcija koja pomocu koje unosimo vrijednosti u niz
	 * 
	 * @param size
	 *            velicina niza oju mi odredjujemo
	 * @return vraca velicinu niza koju smo mi definisali sa vrijednosti koje mi
	 *         unosimo
	 */

	public static int[] getUserArray(int size) {

		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			System.out.println("Unesi elemente niza: ");
			newArray[i] = TextIO.getlnInt();
		}

		return newArray;
	}
	
	/**
	 * Funkcija koja  svakom clanu niza zadane velicine pripisuje vrijednost koju mi odredjumeo
	 * @param size vrijedost koja oznacava velcinu niza
	 * @param defaultValue je određena vrijednost koju sami definisemo
	 * @return vraca novi niz
	 */
	public static int [] getArray( int size, int defaultValue){
	 	int [] newArray = new int [size];
		for ( int i = 0; i< newArray.length; i++){
		newArray[i] = defaultValue;		
	}
		return newArray;
	}
	
	/**
	 * Funkcija koja prima dva niza, a prepisuje vrijednosti iy prvog niza u drugi
	 * @param niz1 prvi niz elemenata
	 * @param niz2 drugi niz elemenata
	 * @return vraca drugi niz elemenata u koji smo prepisali vrijednosti iz prvog niza elemenata
	 * @throws IllegalArgumentException ako je prvi niz veci od drugog
	 */
	public static int [] copyArray ( int [] array1, int [] array2){
//		int [] newArray = new int [array1.length];
	
		if ( array2.length < array1.length ){
		    array2 =  new int [array1.length];     //throw new IllegalArgumentException ("Ovaj program je nemoguce izvrsiti");	    
		    
//			for ( int i =0; i < array1.length; i++){
//				newArray[i] = array1[i];
//			}
//			array2 = newArray;
//		} else {
				  
//	}
//			return array2;
	   }
		for ( int i =0; i < array1.length; i++){
			array2[i] = array1[i];
	    }
		return array2;
}
	
	public static int [] pomjeriDesno (int [] array){
		
		for ( int i=array.length-2; i>=0; i--){
			array[i+1] = array[i];
		}
		array[0] =0;
		return array;
	}
	
public static int [] pomjeriLijevo(int [] array){
		
		for ( int i= 1; i< array.length; i++){
			array[i-1] = array[i];
		}
		array[array.length-1] =0;
		return array;
	}
}
