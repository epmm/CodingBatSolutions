public int maxSpan(int[] nums) {
  if(nums.length == 0)
    return 0;
  int span = 1;
  int largeSpan = 1;
  for(int i = 0;i < nums.length - largeSpan;++i){
    for(int j = i+1;j < nums.length;++j){
      if(nums[i] == nums[j]){
        span = j - i + 1;
        if(span > largeSpan)
          largeSpan = span;
      }
    }
  }
  return largeSpan;
}



public int[] fix34(int[] nums) {
  int[] wack = new int[nums.length];
  int placeHold = 0;
  for(int i = 0;i<nums.length;++i){
    if(nums[i] == 3){
      wack[i] = 3;
      for(int j = placeHold;j<nums.length;++j){
        if(nums[j] == 4){
          placeHold = j;
          nums[j] = nums[i+1];
          wack[j] = nums[i+1];
          nums[i+1] = 4;
          break;
        }
      }
    }
    else
      wack[i] = nums[i];
  }
  return wack;
}



public int[] fix45(int[] nums) {
  int[] wack = new int[nums.length];
  int placeHold = 0;
  for(int i = 0;i<nums.length;++i){
    if(nums[i] == 4){
      wack[i] = 4;
      for(int j = placeHold;j<nums.length;++j){
        if(j == 0){
          if(nums[j] == 5){
            placeHold = j;
            nums[j] = nums[i+1];
            wack[j] = nums[i+1];
            nums[i+1] = 5;
            break;
          }
        }
        else{
          if(nums[j] == 5 && nums[j-1] != 4){
            placeHold = j;
            nums[j] = nums[i+1];
            wack[j] = nums[i+1];
            nums[i+1] = 5;
            break;
          }
        }
      }
    }
    else
      wack[i] = nums[i];
  }
  return wack;
}



public boolean canBalance(int[] nums) {
  int sumF = 0;
  int sumB = 0;
  for(int i = 0;i<nums.length;++i){
    sumF+=nums[i];
    sumB = 0;
    for(int j = i+1;j<nums.length;++j){
      sumB+=nums[j];
    }
    if(sumF == sumB)
      return true;
  }
  return false;
}



public boolean linearIn(int[] outer, int[] inner) {
  int j = 0;
  for(int i = 0; i < inner.length; ++i){
    do{
      if(inner[i] == outer[j])
        break;
      if(inner[i] < outer[j])
        return false;
      if(j == outer.length-1)
        return false;
      ++j;
    }while(j < outer.length);
  }
  return true;
}



public int[] squareUp(int n) {
  int[] gu = new int[n*n]; //auto-populates array with zeros
  for(int i = 1; i <= n; ++i){ // loops through the clumps of n integers
    for(int j = 1;j <= i; ++j){ 
      gu[n*i-j] = j; // starts moving left in the each clump on n integers b/c of the "-j"
    }
  }
  return gu;
}



public int[] seriesUp(int n) {
  int[] series = new int[n*(n+1)/2];
  for(int i = 0;i<n;++i){
    for(int j=0;j<=i;++j){
      series[i*(i+1)/2+j] = j+1;
    }
  }
  return series;
}



public int maxMirror(int[] nums) {
  if(nums.length == 1)
    return 1;
  int count = 0;
  for(int i = 0; i < nums.length-1; ++i){
    int x = i;
    for(int j = nums.length-1;j > 0; --j){
      int y = j;
      while(nums[i] == nums[j]){
        --j;
        ++i;
        if(i - x > count)
          count = i - x;
        if(j < 0 || i == nums.length)
          break;
      }
      i = x;
      j = y;
    }
    i = x;
  }
  return count;
}



public int countClumps(int[] nums) {
  int count = 0;
  int i = 0;
  while(i < nums.length - 1){
    if(i == 0 && nums[i] == nums[i+1])
      ++count;
    else if(nums[i] == nums[i+1] && nums[i] != nums[i-1]){
      ++count;
    }
    ++i;
  }
  return count;
}



