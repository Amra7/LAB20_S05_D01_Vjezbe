package PrviPackage;

public class TestnaKlasa {
    
	public static void main(String [] args){
    int [] arr1= {1,6,7,8,89,6};//ArrayUtil.getArray(5, -3);
    int [] arr2= ArrayUtil.getArray(3, 1);
    ArrayUtil.printArray(arr1);
    ArrayUtil.printArray(arr2);
    
  
    
    arr2 = ArrayUtil.copyArray(arr1, arr2);
	ArrayUtil.printArray(arr2);
	ArrayUtil.pomjeriDesno(arr1);
	ArrayUtil.printArray(arr1);
	ArrayUtil.pomjeriLijevo(arr1);
	ArrayUtil.printArray(arr1);
	
	}
			
}