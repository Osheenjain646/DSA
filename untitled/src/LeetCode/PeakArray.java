package LeetCode;

public class PeakArray {
    //                          s
//                      s   e   mid=1
//    [10,2,1,6,7,9,1] [5,1,2]
    public static int peakArray1(int[] arr){
        if (arr.length==1){
            return 0;
        }
        int s=0,e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(mid==0){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }else{
                    s=mid+1;
                }
            }
            else if(mid==arr.length-1){
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }else{
                    e=mid-1;
                }
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr={10,0,1,3};
        System.out.println(peakArray1(arr));
    }
}
