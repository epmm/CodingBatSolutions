public boolean firstLast6(int[] nums) {
  return nums[0] == 6 || nums[nums.length - 1] == 6;
}



public boolean sameFirstLast(int[] nums) {
  return nums.length > 0 && nums[0] == nums[nums.length - 1];
}



public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}



public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
}



public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}



public int[] rotateLeft3(int[] nums) {
  int[] left = new int[3];
  left[0] = nums[1];
  left[1] = nums[2];
  left[2] = nums[0];
  return left;
}



public int[] reverse3(int[] nums) {
  int[] rev = new int[3];
  rev[0] = nums[2];
  rev[1] = nums[1];
  rev[2] = nums[0];
  return rev;
}



public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  int[] newNums = {max, max, max};
  return newNums;
}



public int sum2(int[] nums) {
  if(nums.length > 1)
    return nums[0] + nums[1];
  else if(nums.length == 1)
    return nums[0];
    
  return 0;
}



public int[] middleWay(int[] a, int[] b) {
  int[] middles = {a[a.length/2], b[b.length/2]};
  return middles;
}



public int[] makeEnds(int[] nums) {
  int[] newa = new int[2];
  newa[0] = nums[0];
  newa[1] = nums[nums.length - 1];
  return newa;
}



public boolean has23(int[] nums) {
  return nums[0] == 2 || nums [0] == 3 || nums[1] == 2 || nums [1] == 3;
}



public boolean no23(int[] nums) {
  return nums[0] != 2 && nums [0] != 3 && nums[1] != 2 && nums [1] != 3;
}



public int[] makeLast(int[] nums) {
  int[] big = new int[nums.length*2];
  big[big.length-1] = nums[nums.length-1];
  return big;
}



public boolean double23(int[] nums) {
  if(nums.length == 2)
    return nums[0] == 2 && nums [1] == 2 || nums[0] == 3 && nums [1] == 3;
  else
    return false;
}



public int[] fix23(int[] nums) {
  int i = 0;
  while(i < 2)
  {
    if(nums[i] == 2 && nums[i+1] == 3)
    {
      nums[i + 1] = 0;
    }
    ++i;
  }
  return nums;
}



public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length != 0){
    if(a[0] == 1)
      ++count;
  }
  if(b.length != 0){
    if(b[0] == 1)
      ++count;
  }
  return count;
}



public int[] biggerTwo(int[] a, int[] b) {
  return (a[0]+a[1]>=b[0]+b[1])? a:b;
}



public int[] makeMiddle(int[] nums) {
  int[] midTwo = new int[2];
  midTwo[0] = nums[nums.length/2 - 1];
  midTwo[1] = nums[nums.length/2];

  return midTwo;  
}



public int[] plusTwo(int[] a, int[] b) {
  int newAr[] = new int[4];
  newAr[0] = a[0];
  newAr[1] = a[1];
  newAr[2] = b[0];
  newAr[3] = b[1];
  return newAr;
}



public int[] swapEnds(int[] nums) {
  int indexZero = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = indexZero;
  
  return nums;
}



public int[] midThree(int[] nums) {

  int three[] = {nums[nums.length/2 - 1], 
                nums[nums.length/2], nums[nums.length/2 + 1]};
  return three;
}



public int maxTriple(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length/2]);
  max = Math.max(max, nums[nums.length-1]);
  return max;
}



public int[] frontPiece(int[] nums) {
  int[] arr = new int[2];
  if(nums.length >= 2){
    arr[0] = nums[0];
    arr[1] = nums[1];
    return arr;
  }
  return nums;
}



public boolean unlucky1(int[] nums) {
  int length = nums.length;
  int index = unluckyIndex(nums);
  if(index == 0 || index == 1 || index == length-2 || index == length-1)
    return true;
  else
    return false;
}

public int unluckyIndex(int[]nums){
    for(int i = 0; i < nums.length - 1; ++i)
    {
      if(nums[i] == 1 && nums[i+1] == 3)
      {
        return i;
      }
    }
    return -10;
  }



public int[] make2(int[] a, int[] b) {
  int[] c = new int[2];
  int x = 0;
  int y = 0;
  if(a.length >= 2)
  {
    c[0] = a[0];
    c[1] = a[1];
  }
  else if(a.length == 1)
  {
    c[0] = a[0];
    c[1] = b[0];
  }
  else
  {
    c[0] = b[0];
    c[1] = b[1];
  }
  return c;
}



public int[] front11(int[] a, int[] b) {
  int[] array;
  
  if(a.length == 0 && b.length == 0){
    array = new int[0];
  }
  else if(a.length == 0){
    array = new int[1];
    array[0] = b[0];
  }
  else if(b.length == 0){
    array = new int[1];
    array[0] = a[0];
  }
  else{
    array = new int[2];
    array[0] = a[0];
    array[1] = b[0];
  }
  return array;
}



