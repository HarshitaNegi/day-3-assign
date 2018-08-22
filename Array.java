import java.util.*;
public class Array
{
    public static void main(String[] args) {
        int[] num = {1,4,6,7,8,9,10};
         Scanner X = new Scanner(System.in);
         
        System.out.print("Enter value n : ");
           int find = X.nextInt();
        boolean found = false;

        for (int n : num) {
            if (n == find) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(find+ " is found.");
        else
            System.out.println(find + " is not found.");
    }
}    

