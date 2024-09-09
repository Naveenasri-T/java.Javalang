import java.util.*;
public class bubble_sort{
    public static void main(String[] args) {
        int a[]={4,6,7,1,23,9};
        System.out.println("the array before sorting"+Arrays.toString(a));
        int n= a.length;
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("the array after sorting:"+Arrays.toString(a));
    }
}