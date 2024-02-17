import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter five (5) numbers:");

        recursiveInput(nums, 0, scanner);

        //Calculate the product using recursion
        int product = getProduct(nums, 0);

        //Display the result
        System.out.println("\nThe product of the 5 numbers is: " + product);
        
        //Saves memory by closing scanner
        scanner.close();
    }
    
    //Recursive method to get the user inputs
    private static void recursiveInput(int[] nums, int i, Scanner scanner) {
        //Base case: when the index reaches the length of the array
        if (i < nums.length) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
            //Recursive case: Call itself with the next index
            recursiveInput(nums, i + 1, scanner);
        }
    }
    
    //Recursive method to calculate the product of an array of numbers
    private static int getProduct(int[] nums, int i) {
        //Base case: when i reaches the end of the array
        if (i == nums.length - 1) {
            return nums[i];
        } else {
            //Recursive case: multiply the current number with the product of the rest
            return nums[i] * getProduct(nums, i + 1);
        }
    }
}