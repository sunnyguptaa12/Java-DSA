package LinkedList;

public class FindDuplicateNumber {

    static int findDuplicate(int[] nums){

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];                           //move 1 steps
            fast = nums[nums[fast]];                     //move 2 steps
        }

        while (slow != fast);
        {

            slow = nums[0];                              //reset slow to start
            while (slow != fast){
                slow = nums[slow];                       //Both move 1 step
                fast = nums[fast];
            }

            return slow;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        System.out.println("The duplicate number is: " + findDuplicate(nums));
    }
}
