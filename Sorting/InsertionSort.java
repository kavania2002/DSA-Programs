import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int x=0;x<n;x++){
        int a=s.nextInt();
        arr[x]=a; 
    }
    for(int i=0;i<n;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp ){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    for(int y=0;y<n;y++){
        System.out.print(arr[y] + " ");
    }
}
}
