class Solution {
    public int removeDuplicates(int[] nums) {
        int index= nums.length;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<index-1;){
            if (nums[i]==nums[i+1]){
                int remove=i+1;
                for (int j=remove;j<index-1;j++){
                    nums[j]=nums[j+1];
                }

                nums[index-1]=0;
                index--;

            }else {
                i++;
            }
        }
        int[]k=nums;
        System.out.println(Arrays.toString(k));

    return index;}
}