import java.util.*;

public class FindBiggestNumber {
    public static void main(String args[]){

        // Create object of array list
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Add numbers to array list
        arrayList.add(318);
        arrayList.add(299);
        arrayList.add(412);
        arrayList.add(621);
        arrayList.add(536);
        arrayList.add(178);
        arrayList.add(287);
        // Use collection.max to fetch largest number and print
        System.out.println("Largest number: "+ Collections.max(arrayList));
    }
}