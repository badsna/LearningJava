package Week1.Day4;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={1,5,2,3,10,0};
        for(int i=0;i<arr.length-1;i++){
            int temp;
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
