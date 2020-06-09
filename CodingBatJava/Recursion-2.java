public boolean groupSum(int start, int[] nums, int target) {
  if(target == 0)
    return true;
  if(start >= nums.length)
    return false;
  if(target - nums[start] == 0){
    return true;
  }
  if(target - nums[start] < 0){
    return groupSum(start+1, nums, target);
  }
  if(target - nums[start] > 0){
    if(groupSum(start+1, nums, target-nums[start]))
      return true;
    else
      return groupSum(start+1, nums, target);
  }
  return false;
}



public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  if(nums[start] == 6)
    return groupSum6(start+1, nums, target-6);
  if(groupSum6(start+1, nums, target-nums[start]))
    return true;
  if(groupSum6(start+1, nums, target))
    return true;
  return false;
}



public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  if(groupNoAdj(start+2, nums, target-nums[start]))
    return true;
  if(groupNoAdj(start+1, nums, target))
    return true;
  return false;
}



public boolean groupSum5(int start, int[] nums, int target) {
  if(start>=nums.length) 
    return target == 0;
  if(nums[start]%5 == 0)
    return groupSum5(start+1, nums, target-nums[start]);
  if(start>0 && nums[start] == 1){
    if(nums[start-1]%5 == 0)
      return groupSum5(start+1, nums, target);
    if(groupSum5(start+1, nums, target-nums[start])) 
      return true;
  }
  if(groupSum5(start+1, nums, target-nums[start])) 
      return true;
  if(groupSum5(start+1, nums, target)) return true;
    return false;
}



public boolean groupSumClump(int start, int[] nums, int target) {
  if(start >= nums.length)
    return target == 0;
  if(start < nums.length-1 && start > 0){
    if(nums[start] == nums[start+1]){
      if(groupSumClump(start+2, nums, target-nums[start]-nums[start+1]))
        return true;
      return groupSumClump(start+2, nums, target);
      }
  }
  if(groupSumClump(start+1, nums, target-nums[start]))
    return true;
  if(groupSumClump(start+1, nums, target))
    return true;
  
  return false;
}



public boolean splitArray(int[] nums) {
  int sum1 = 0;
  int sum2 = 0;
  int start = 0;
  return splitArray(start, nums, sum1, sum2);
}

public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
  if(start >= nums.length)
    return sum1 == sum2;
  if(splitArray(start+1, nums, sum1+nums[start], sum2))
    return true;
  if(splitArray(start+1, nums, sum1, sum2+nums[start]))
    return true;
  return false;
}



public boolean splitOdd10(int[] nums) {
  int sum1 = 0;
  int sum2 = 0;
  int start = 0;
  return splitArray(start, nums, sum1, sum2);
}

public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
  if(start >= nums.length)
    return (sum1%10 == 0 && sum2%2 == 1) || (sum1%2 == 1 && sum2%10 == 0);
  if(splitArray(start+1, nums, sum1+nums[start], sum2))
    return true;
  if(splitArray(start+1, nums, sum1, sum2+nums[start]))
    return true;
  return false;
}



public boolean split53(int[] nums) {
  int sum1 = 0;
  int sum2 = 0;
  int start = 0;
  return splitArray(start, nums, sum1, sum2);
}

public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
  if(start >= nums.length)
    return (sum1 == sum2);
  if(nums[start]%5 == 0){
    return splitArray(start+1, nums, sum1+nums[start], sum2);
  }
  if(nums[start]%3 == 0){
    return splitArray(start+1, nums, sum1, sum2+nums[start]);
  }
  if(splitArray(start+1, nums, sum1+nums[start], sum2))
    return true;
  if(splitArray(start+1, nums, sum1, sum2+nums[start]))
    return true;
  return false;
}



