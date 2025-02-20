class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return result.toString();
    }
}