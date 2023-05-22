import java.util.Arrays;
  
// Main class 
class ArraysUtilty {
    
    // Main driver method 
    public static void main(String[] args)
    {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr);
        // To convert the elements as List
        System.out.println("list :"+Arrays.toString(intArr));
    }
}