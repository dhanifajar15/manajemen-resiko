
import java.util.Scanner;

public class ContentTable {
    TableSize tableSize = new TableSize();
    Item inventory = new Item();

    public int total = tableSize.total;
    public int profit = inventory.profit;
    public int capital = inventory.production;
    public double[] probability = new double[total];
    public int[] visitors = new int[total];
    public int[] stock = new int[total];
    public int[][] riskTable = new int[total][total];

    public void createTable(){
        Scanner scan = new Scanner(System.in);
        int i=0;
        while (i<total) {
            System.out.println("Enter the number of visitors who have sequence number " + (i+1)+": ");
            visitors[i] = scan.nextInt();
            stock[i] = visitors[i];
            System.out.println("Probability :");
            probability[i] = scan.nextDouble();
            i++;
        }
        resultTable();
        printTable();
    }
    public void resultTable(){
        int a = 0;
        while (a<total) {
            int b = 0;
            while (b<total) {
                if (stock[a] != visitors[b]) {
                    if (stock[a] <= visitors[b]) {
                        if (stock[a]<visitors[b]){
                            riskTable[a][b]=profit*stock[a];
                            int failedProfit = (-1)*(stock[a]-visitors[b]);
                            riskTable[a][b] = riskTable[a][b] - (failedProfit*profit);
                        }
                    } else {
                        riskTable[a][b]=profit*visitors[b];
                        var remains = stock[a]-visitors[b];
                        riskTable[a][b]=riskTable[a][b]-(remains*capital);
                    }
                } else {
                    riskTable[a][b] = profit * visitors[b];
                }
                b++;
            }
            a++;
        }
    }
    public void printTable(){
        System.out.printf("\t");
        {
            int i=0;
            while (i<total) {
                System.out.printf(visitors[i]+"\t");
                i++;
            }
        }
        System.out.printf("\n");
        System.out.printf("\t");
        int i=0;
        while (i<total) {
            System.out.printf("("+probability[i]+")\t");
            i++;
        }
        System.out.printf("\n");
        int a = 0;
        while (a<total) {
            System.out.printf(stock[a]+"\t");
            int b =0;
            while (b<total) {
                System.out.printf(riskTable[a][b]+"\t");
                b++;
            }
            System.out.printf("\n");
            a++;
        }
    }
}
