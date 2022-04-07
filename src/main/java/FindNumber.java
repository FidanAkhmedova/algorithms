public class FindNumber {
    public static int search( int arr[]) {
        int start = 0, end = arr.length-1, mid = (start + end) / 2;
        if (arr.length == 0 || arr[0] != 1) return 1;

        else if(arr[arr.length-1] == arr.length) return arr.length + 1;

        for (int i = start;i < end;i++){
            if (arr[mid] == mid + 1 && arr[mid + 1] != mid + 2){
                return mid + 2;
            }
            else if (arr[mid] == mid + 1){
                start = mid;
                mid = (start + end) / 2;
            }
            else if(arr[mid] != mid + 1 && arr[mid-1] == mid){
                return mid + 1;
            }
            else {
                end = mid;
                mid = (start + end) / 2;
            }
        }
        return 0;
    }
}
