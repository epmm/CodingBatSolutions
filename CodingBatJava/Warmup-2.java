public String stringTimes(String str, int n) {
  String newStr = "";
  while(n > 0){
    newStr = newStr + str;
    --n;
  }
  return newStr;
}



public String frontTimes(String str, int n) {
  String strN = "";
  if(str.length() < 3){
    for(int i = 0; i < n; ++i){
      strN += str;
    }
  }
  else {
    for(int i = 0; i < n; ++i){
      strN += str.substring(0, 3);
    }
  }
  return strN;
}



int countXX(String str) {
  int count = 0;
  for(int i = 0; i < str.length()-1; ++i){
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
      ++count;
    }
  }
  return count;
}



boolean doubleX(String str) {
  if(str.contains("x") && str.indexOf("x") < str.length()-1){
    if(str.charAt(str.indexOf("x")+1) == 'x')
      return true;
  }
  return false;
}



public String stringBits(String str) {
  String everyOther = "";
  
  for(int i = 0; i < str.length(); i += 2){
    everyOther += str.substring(i, i +1);
  }
  
  return everyOther;
}



public String stringSplosion(String str) {
  String splosion = "";
  for(int i = 1; i <= str.length(); i++){
    splosion += str.substring(0, i);
  }
  return splosion;
}



public int last2(String str) {
  int count = 0;
  if(str.length() < 2)
    return count;
  String lastTwo = str.substring(str.length()-2);

  for(int i = 0;i < str.length()-2; i++){
    if(str.substring(i, i + 2).equals(lastTwo))
      count++;
  }
  return count;
}



public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length;++i){
    if(nums[i] == 9)
      ++count;
  }
  return count;
}



public boolean arrayFront9(int[] nums) {
  for(int i = 0; i < nums.length;++i){
    if(nums[i] == 9 && i < 4)
      return true;
  }
  return false;
}



public boolean array123(int[] nums) {
  for(int i = 0; i < nums.length - 2;++i){
    if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
      return true;
  }
  return false;
}



public int stringMatch(String a, String b) {
  int max = Math.min(a.length(), b.length());
  int count = 0;
  for(int i = 0;i < max-1;++i){
    if(a.substring(i, i+2).equals(b.substring(i,i+2)))
      ++count;
  }
  return count;
}



public String stringX(String str) {
  String front, back, middle, whole = str;
  if(str.length() > 2){
    front = str.substring(0,1);
    back = str.substring(str.length()-2);
    middle = str.substring(1, str.length()-2).replaceAll("x", "");
    //middle = middle.replaceAll("\\s+", "");
    
    whole = front + middle + back;
  }
  return whole;
}



public String altPairs(String str) {
  String pattern = "";
  int i = 0;
  while(i < str.length()){
    if(i == str.length()-1)
      pattern += str.substring(i);
    else
      pattern += str.substring(i,i+2);
    i = i + 4;
  }
  return pattern;
}



public String stringYak(String str) {
  String noYak = "";
  int i = 0;
  while(i < str.length()){
    if(i > str.length() - 3){
      noYak += str.substring(i);
      break;
    }
    else if(str.charAt(i) == 'y' && str.charAt(i+2) == 'k')
      i += 3;
    else{
      noYak += str.charAt(i);
      ++i;
    }
  }
  return noYak;
}



public int array667(int[] nums) {
  int count = 0;
  for(int i = 0;i < nums.length - 1;++i){
    if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
      ++count;
  }
  return count;
}



public boolean noTriples(int[] nums) {
  for(int i = 0;i < nums.length - 2;++i){
    if(nums[i] == nums[i+1] && nums[i] == nums[i+2])
      return false;
  }
  return true;
}



public boolean has271(int[] nums) {
  if(nums.length < 3)
    return false;
  for(int i = 0; i <= nums.length - 3; ++i){
    if(nums[i+1] == nums[i] + 5){
      if(nums[i+2] <= nums[i] + 1 && nums[i+2] >= nums[i] - 3)
        return true;
    }
  }
  return false;
}
