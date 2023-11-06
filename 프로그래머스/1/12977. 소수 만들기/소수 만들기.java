class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i]!= nums[k]){
                        int sum = nums[i] + nums[j] +nums[k];
                        boolean r = false;
                        int num = 2;
                        while(num < sum){
                            r = true;
                            if(sum % num ==0){
                                r = false;
                                break;
                            }
                            num++;
                        }
                        if(r) answer ++;
                    }
                   
                }
            }
        }
        return answer;
    }
}