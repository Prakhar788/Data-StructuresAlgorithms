public class SortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,34,56};
        System.out.println(sort(arr,0));
    }
    static boolean sort( int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr, index+1);
        
    }
}
