public class RotatedBS {
    public static int search(int arr[],int target)
    {
        return find(arr,0,arr.length-1,target);
    }
    public static int find(int arr[],int start,int end, int target)
    {
        if(start>end)
            return -1;
       int mid=start+(end-start)/2;
       if(arr[mid]==target)
           return mid;
       if(arr[mid]>=arr[start])
       {
           if(target>=arr[start] && target<=arr[mid])
           {
               return find(arr,start,mid-1,target);
           }
           else
               return find(arr,mid+1,end,target);
       }
       if(target>arr[mid]&& target<arr[end])
       {
            return find(arr,mid+1,end,target);
       }
       else
           return find(arr,start,mid-1,target);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=2;
        System.out.println(search(arr,target));
        
    }
}