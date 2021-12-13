
import java.util.Scanner;
import java.util.*;

public class Item {
    static int production,sale,profit;
    
    public void inventory(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("======= Risk Management Program ======== \n");
        System.out.println("Enter the production price per unit : ");
        production = scan.nextInt();
        
        System.out.println("Enter the selling price per unit : ");
        sale = scan.nextInt();
        
        profit = sale-production;
        
        System.out.println("Profit :" + profit);
    }
}
