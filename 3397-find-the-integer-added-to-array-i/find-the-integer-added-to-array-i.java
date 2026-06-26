class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=99999,m2=99999;
        for(int i=0;i<nums1.length;i++){
            m1 = Math.min(nums1[i],m1);
        }
        for(int i=0;i<nums2.length;i++){
            m2 = Math.min(nums2[i],m2);
        }
        return m2-m1;
    }
}