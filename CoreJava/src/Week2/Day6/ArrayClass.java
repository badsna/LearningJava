package Week2.Day6;

import java.util.Arrays;
import java.util.List;

public class ArrayClass {
    public static void main(String[] args) {
        int a[]={5,4,2,1,0,3};

        int b[]={5,4,2,1,0,3};
        int e[]={5,4,2,1,0,3};
        //to check if array value and values index is same or equal
        System.out.println(Arrays.equals(a,b));

        //used to sort the array and returns the array in modified form
        Arrays.sort(a);
        //used to  convert the array to string type
        System.out.println(Arrays.toString(a));

        //used to seacrch a value in an array
        //returns -7 which means 15 should be palced in index 7 to return sort array
        System.out.println(Arrays.binarySearch(a,15));



        //to replace value of all index
        Arrays.fill(a,8);
        System.out.println(Arrays.toString(a));

        //used to create a copy of an array and if index of original is less than other index contain defaultvalue
        int c[]=Arrays.copyOf(a,9);
        System.out.println(Arrays.toString(c));

        Integer[] d={10,15,0,20};
        //asList returns the list of fixed size so any add or remove throws unsupportedoperationexception
        List<Integer> list=Arrays.asList(d);
//        System.out.println(list);
//        list.add(25);
//        list.add(30);
//        System.out.println(list);

        //returns the hash code
        //same value leads to same hash code
        System.out.println(Arrays.hashCode(b));
        System.out.println(Arrays.hashCode(e));

        //comapres two multi dimensional array
        int[][] arr1 = {{5, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(arr1, arr2)); // Output: false
    }
}
