public class BubbleSort {
    public static void sort(int arr[],int i,int j)
    {
        if(i==arr.length-2)
            return;
        if(j< arr.length-1-i)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            sort(arr, i, j+1);
        }
        else
            sort(arr, i+1, 0);
    }

    public static void main(String[] args) {
        int arr[]={10,60,40,20,30,50};
        System.out.println("Orignal Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sort(arr,0,0);
        System.out.println("\nSorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}