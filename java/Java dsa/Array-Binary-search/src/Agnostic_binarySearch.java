public class Agnostic_binarySearch {

    public static void main(String[] args) {
//      int[] arr = {-1, 0, 2, 5, 7, 12, 13, 15, 18, 24, 26, 28, 35, 39, 54, 56, 58, 59};  //acc
       int[] arr = {100,90,89,75,45,30,25,10};  //dec

        int target = 90;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAcc = arr[start] < arr[end];
        if (isAcc) {
            //accending code binary search
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid; // target found
                }
            }
            return -1; // target not found
        }
        else{
            //decending binary search code
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid; // target found
                }
            }
            return -1; // target not found
        }


    }
}
