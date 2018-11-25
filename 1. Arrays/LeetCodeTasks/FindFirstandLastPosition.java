class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        int newArr[] = new int[2];
        if (nums.length == 0) {
            list.add(-1);
            list.add(-1);
            newArr[0] = list.get(0);
            newArr[1] = list.get(list.size() - 1);
            return newArr;

        } else {
            int lastdigit = nums[nums.length - 1];
            if (target > lastdigit) {
                list.add(-1);
                list.add(-1);
            } else {
                for (int i = 0; i <= nums.length - 1; i++) {
                    if (nums[i] == target) {
                        list.add(i);
                    }

                }
                if (list.size() == 0) {
                    list.add(-1);
                    list.add(-1);
                }

            }
            newArr[0] = list.get(0);
            newArr[1] = list.get(list.size() - 1);

        }
        return newArr;
    }
}