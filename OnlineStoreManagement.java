package Arrays;
import java.util.Scanner;
import java.util.*;
public class OnlineStoreManagement {
    public static void main(String[] args){
        double orderAmount;
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for (int i=0; i<5; i++){
            System.out.print("Enter Order amount for buyer "+(i+1)+": ");
            orderAmount = input.nextDouble();
            list.add(orderAmount);
        }
        //hard coding five other order amounts
        list.add(5400.2);
        list.add(400.0);
        list.add(700.0);
        list.add(900.0);
        list.add(8000.5);
        //removing <500 and adding discount to >5000
        for (int i=0; i<list.size(); i++){
            if(list.get(i)<500){
                list.remove(i);
                i--;
            } else if (list.get(i)>5000) {
                double discounted = 0.9 * list.get(i);
                list.set(i, discounted);
            }
        }
        //alternative to traversing with get(i), can use iterator instead:
        /*Iterator<Double> itr = list.iterator();
        while (itr.hasNext()){
            double value = itr.next();
            if (value < 500){
                itr.remove();
            }*/
        //totaling after modifications
        double totalRevenue = 0;
        for (int i=0; i<list.size(); i++) {
            totalRevenue += list.get(i);
        }
        System.out.println("\nTotal Revenue after Modifications: " + totalRevenue);
        Collections.sort(list);
        System.out.println("Sorted List, least to most: \n" + list);

    }
}

