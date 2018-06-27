public class MainClass
{
public static <M> void printArray(M[] inputArray)
{
	for( M element : inputArray)
	System.out.printf("%s",element);
	System.out.println(); 
}
public static void main(String[] args) {
	Integer[] integerArray ={1,2,3,4,5,6};
	Double[] doubleArray={1.1,2.2,3.3,4.4,5.5,6.6,7.7};
	Character[] characterArray ={'p','u','r','n','i','m','a'};

	System.out.println("Array integerArray contains:");
	printArray(integerArray);
	System.out.println("\nArray doubleArray contains:");
	printArray(doubleArray);
	System.out.println("\nArray characterArray contains:");
	printArray(characterArray);
}
}