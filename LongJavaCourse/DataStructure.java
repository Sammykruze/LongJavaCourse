public class DataStructure {
     public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,11,13,14,23,24,25};
        int indexInSearch = 25;

        int result = linearSearch(nums, indexInSearch);
        int result2 = binarySearch(nums, indexInSearch);

        if (result2 == -1) 
            System.out.println("Index number not found");
        else
         System.out.println("The index number is " + result2);
      
    }

    public static int binarySearch(int[] nums, int indexInSearch) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;
            if (nums[mid] == indexInSearch) 
                return mid;
            else if (nums[mid] < indexInSearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }      
        }
       return -1;
    }

    public static int linearSearch(int[] nums, int indexInSearch) {

      for(int i = 0; i < nums.length; i++){
        if(nums[i] == indexInSearch)
        return i;      
      }

       return -1;
    }
}