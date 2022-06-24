public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(search(arr,0, 4));
    }
    static int search(int [] arr,int index,int target){
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else
        {
            return search(arr, index+1, target);
        }
    }
    
}
