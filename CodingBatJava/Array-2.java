public int countEvens(int[] nums) {
  int count = 0;
  for(int i = 0;i<nums.length;++i){
    if(nums[i]%2 == 0)
      ++count;
  }
  return count;
}



public int bigDiff(int[] nums) {
  int daMax = nums[0];
  int daMin = nums[0];
  for(int i = 1; i < nums.length ; ++i){
    daMax = Math.max(daMax,nums[i]);
    daMin = Math.min(daMin,nums[i]);
  }
  return daMax - daMin;
}



public int centeredAverage(int[] nums) {
  int smol = nums[0];
  int big = nums[0];
  int tot = 0;
  for(int i = 0; i < nums.length ; ++i){
    smol = Math.min(smol,nums[i]);
    big = Math.max(big,nums[i]);
    tot += nums[i];
  }
  tot = tot - smol - big;
  return tot/(nums.length-2);
}



public int sum13(int[] nums) {
  int tot = 0;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 13)
      ++i;
    else 
      tot+=nums[i];
  }
  return tot;
}



public int sum67(int[] nums) {
  boolean in67 = false;
  int tot = 0;
  for(int i = 0; i < nums.length ; ++i){
    if(nums[i] == 6)
      in67 = true;
    if(!in67)
      tot+=nums[i];
    if(nums[i] == 7 && in67)
      in67 = false;
  }
  return tot;
}



public boolean has22(int[] nums) {
  for(int i = 0; i < nums.length-1; ++i){
    if(nums[i] == 2 && nums[i+1] == 2)
      return true;
  }
  return false;
}



public boolean lucky13(int[] nums) {
  for(int i = 0;i < nums.length;++i){
    if(nums[i] == 1 || nums[i] == 3)
      return false;
  }
  return true;
}



public boolean sum28(int[] nums) {
  int count2 = 0;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] ==2)
      ++count2;
  }
  return (count2*2 == 8);
}



public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for(int i = 0; i < nums.length ; ++i){
    if(nums[i] == 1)
      ++count1;
    else if(nums[i] == 4)
      ++count4;
  }
  return count1 > count4;
}



public int[] fizzArray(int n) {
  int[] fizA = new int[n];
  for(int i = 0; i < n; ++i){
    fizA[i] = i;
  }
  return fizA;
}



public boolean only14(int[] nums) {
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] != 1 && nums[i] != 4)
      return false;
  }
  return true;
}



public String[] fizzArray2(int n) {
  String[] fizz = new String[n];
  for(int i = 0; i < n ; ++i){
    fizz[i] = String.valueOf(i);
  }
  return fizz;
}



public boolean no14(int[] nums) {
  boolean has1 = false;
  boolean has4 = false;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 1)
      has1 = true;
    else if(nums[i] == 4)
      has4 = true;
  }
  return !has1 || !has4;
}



public boolean isEverywhere(int[] nums, int val) {
  for(int i = 1; i < nums.length; ++i){
    if(nums[i] != val && nums[i-1] != val)
      return false;
  }
  return true;
}



public boolean either24(int[] nums) {
  boolean to2 = false;
  boolean fo4 = false;
  for(int i = 0; i < nums.length-1; ++i){
    if(nums[i] == 2 && nums[i+1] == 2)
      to2 = true;
    if(nums[i] == 4 && nums[i+1] == 4)
      fo4 = true;
  }
  return (to2 ^ fo4);
}



public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for(int i = 0; i < nums1.length; ++i){
    if(Math.abs(nums1[i]-nums2[i]) == 2 || Math.abs(nums1[i]-nums2[i]) == 1)
      ++count;
  }
  return count;
}



public boolean has77(int[] nums) {
  for(int i = 0; i < nums.length-2; ++i){
    if(nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7) 
        || (nums[i+1] == 7 && nums[i+2] == 7))
      return true;
  }
  return false;
}



public boolean has12(int[] nums) {
  boolean has1 = false;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 1)
      has1 = true;
    else if(has1 && nums[i] == 2)
      return true;
  }
  return false;
}



public boolean modThree(int[] nums) {
  for(int i = 0; i < nums.length-2; ++i){
    if(nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 == 0)
      return true;
    if(nums[i]%2 == 1 && nums[i+1]%2 == 1 && nums[i+2]%2 == 1)
      return true;
  }
  return false;
}



public boolean haveThree(int[] nums) {
  int count3 = 0;
  for(int i = 0; i < nums.length-1 ; ++i){
    if(nums[i] == 3){
      if(nums[i+1] == 3)
        return false;
      else
        ++count3;
    }
    if(i == nums.length-2 && nums[i+1] == 3)
      ++count3;
  }
  return (count3 == 3);
}



public boolean twoTwo(int[] nums) {
  if(nums.length == 1 && nums[0] != 2)
    return true;
  if(nums.length == 1 && nums[0] == 2)
    return false;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 2){
      if(i == 0 && nums[1] != 2)
        return false;
      else if(i < nums.length-1 && !(nums[i+1] == 2 || nums[i-1] == 2))
        return false;
      else if(i == nums.length-1 && !(nums[i-1] == 2))
        return false;
    }
  }
  return true;
}



public boolean sameEnds(int[] nums, int len) {
  for(int i = 0; i < len; ++i){
    if(nums[i] != nums[nums.length-len+i])
      return false;
  }
  return true;
}



public boolean tripleUp(int[] nums) {
  for(int i = 0; i < nums.length-2; ++i){
    if(nums[i] == nums[i+1]-1 && nums[i] == nums[i+2]-2)
      return true;
  }
  return false;
}



public int[] fizzArray3(int start, int end) {
  int[] asdf = new int[end-start];
  for(int i = 0; i < asdf.length; ++i){
    asdf[i] = start++;
  }
  return asdf;
}



public int[] shiftLeft(int[] nums) {
  if(nums.length == 1)
    return nums;
  int[] shifted = new int[nums.length];
  for(int i = 0; i < nums.length-1; ++i){
    shifted[i] = nums[i+1];
    if(i == nums.length-2)
      shifted[nums.length-1] = nums[0];
  }
  return shifted;
}



public int[] tenRun(int[] nums) {
  boolean tenMult = false;
  for(int i = 0; i < nums.length; ++i){
    if(tenMult && nums[i]%10 == 0)
      tenMult = false;
    if(tenMult)
      nums[i] = nums[i-1];
    if(tenMult == false && nums[i]%10 == 0)
      tenMult = true;
  }
  return nums;
}



public int[] pre4(int[] nums) {
  int[] no4 = new int[0];
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 4){
      int[] preFo = new int[i];
      for(int j = 0; j < i; ++j){
        preFo[j] = nums[j];
      }
      return preFo;
    }
  }
  return no4;
}



public int[] post4(int[] nums) {
  for(int i = nums.length-1; i >=0; --i){
    if(nums[i] == 4){
      return Arrays.copyOfRange(nums,i+1, nums.length);
    }
  }
  return nums;
}



public int[] notAlone(int[] nums, int val) {
  for(int i = 1; i < nums.length-1; ++i){
    if(val != nums[i-1] && val != nums[i+1])
      nums[i] = Math.max(nums[i-1],nums[i+1]);
  }
  return nums;
}



public int[] zeroFront(int[] nums) {
  int[] newNums = new int[nums.length];
  int x = nums.length-1;
  for(int i = 0; i < nums.length ; ++i){
    if(nums[i] != 0){
      newNums[x] = nums[i];
      --x;
    }
  }
  return newNums;
}



public int[] withoutTen(int[] nums) {
  int[] no10 = new int[nums.length];
  int index = 0;
  for(int i = 0; i < nums.length; ++i){
    if(nums[i] == 10)
      continue;
    no10[index] = nums[i];
    ++index;
  }
  return no10;
}



public int[] zeroMax(int[] nums) {
  int largO = 0;
  for(int i = nums.length-1; i >= 0 ; --i){
    if(nums[i] != 0 && nums[i]%2 == 1)
      largO = Math.max(largO,nums[i]);
    if(nums[i] == 0)
      nums[i] = largO;
  }
  return nums;
}



public int[] evenOdd(int[] nums) {
  int eInd = 0;
  int oInd = nums.length-1;
  int[] eO = new int[nums.length];
  for(int i = 0; i < nums.length; ++i){
    if(nums[i]%2 == 0){
      eO[eInd] = nums[i];
      ++eInd;
    }
    else{
      eO[oInd] = nums[i];
      --oInd;
    }
  }
  return eO;
}



public String[] fizzBuzz(int start, int end) {
  String[] stupidProblem = new String[end-start];
  for(int i = 0;i < stupidProblem.length;++i){
    if(start%3 == 0 && start%5 == 0)
      stupidProblem[i] = "FizzBuzz";
    else if(start%3 == 0)
      stupidProblem[i] = "Fizz";
    else if(start%5 == 0)
      stupidProblem[i] = "Buzz";
    else
      stupidProblem[i] = String.valueOf(start);
    ++start;
  }
  return stupidProblem;
}



