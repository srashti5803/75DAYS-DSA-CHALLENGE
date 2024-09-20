import java.util.*;

class LargestElement{
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elments");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(i=0;i<n;i++){
           if(a[i]>max){
            max=a[i];
           }
        }
        System.out.println("The Largest element in the array is: "+max);

    }
}