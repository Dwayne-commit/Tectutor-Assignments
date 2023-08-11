package tectutor.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ProductList {
    public static void main(String[] args){
        Product[] arr = new Product[3];

        insert(arr);
    }

    public static void insert(Product[] arr){
        int x = 0;
        while(x < arr.length){
            Scanner sc = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER ID");
            int ip = sc.nextInt();
            System.out.println("ENTER NAME");
            String nam = scan.nextLine();
            System.out.println("ENTER PRICE");
            double pri = sc.nextDouble();
            Product s = new Product(ip,nam,pri);
            if(arr[0] != null){
                if(arr[0].equals(s)){
                    System.out.println("Duplicate Data");
                } else {
                    arr[x] = s;
                    x = x + 1;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
    }
}
