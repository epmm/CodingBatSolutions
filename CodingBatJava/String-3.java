public int countYZ(String str) {
  str = str.toLowerCase();
  int count = 0;
  for(int i = 0; i < str.length();++i){
    if(i < str.length()-1){
      if((str.charAt(i) == 'z' || str.charAt(i) == 'y') 
        && Character.isLetter(str.charAt(i+1)) == false)
        ++count;
    }
    else{
      if(str.charAt(i) == 'z' || str.charAt(i) == 'y')
        ++count;
    }
  }
  return count;
}



public String withoutString(String base, String remove) {
  remove = remove.toLowerCase();
  int remLen = remove.length();
  String newStr = "";
  int i = 0;
  while(i < base.length())
  {
    if(i < base.length()-remLen)
    {
      if(base.substring(i,i+remLen).toLowerCase().equals(remove))
        i += remLen;
      else
      {
        newStr += base.substring(i, i+1);
        ++i;
      }
    }
    else if(base.substring(i).toLowerCase().equals(remove))
      i += remLen;
    else
    {
     newStr += base.substring(i, i+1);
      ++i;
    }
  }
  return newStr;
}



public boolean equalIsNot(String str) {
  int countIs = 0;
  int countNot = 0;
  for(int i = 0; i < str.length()-1;++i){
    if(str.substring(i,i+2).equals("is"))
      ++countIs; 
  }
  for(int i = 0; i < str.length()-2;++i){
    if(str.substring(i,i+3).equals("not"))
      ++countNot;
  }
  return countIs == countNot;
}



public boolean gHappy(String str) {
  for(int i = 0; i < str.length(); ++i){
    if(str.length() ==1)
      return false;
    else if(str.charAt(i) == 'g' && i == 0){
      if(str.charAt(i+1) != 'g')
        return false;
    }
    else if(str.charAt(i) == 'g' && i == str.length()-1){
      if(str.charAt(i-1) != 'g')
        return false;
    }
    else if(str.charAt(i) == 'g'){
      if(str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g')
        return false;
    }
  }
  return true;
}



public int countTriple(String str) {
  int numTrips = 0;
  for(int i = 0; i < str.length()-2; ++i){
    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
      ++numTrips;
  }
  return numTrips;
}



public int sumDigits(String str) {
  int tot = 0;
  for(int i = 0; i < str.length(); ++i){
    if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
      tot += Integer.valueOf(str.substring(i,i+1));
  }
  return tot;
}



public String sameEnds(String string) {
  String ends = "";
  for(int i = string.length()/2; i >= 0 ; --i){
    if(string.endsWith(string.substring(0,i))){
      ends = string.substring(0,i);
      break;
    }
  } 
  return ends;
}



public String mirrorEnds(String string) {
  String mirror = "";
  for(int i = 0; i < string.length(); ++i){
    if(string.charAt(i) == string.charAt(string.length()-1-i))
      mirror += string.charAt(i);
    else
      break;
  }
  return mirror;
}



public int maxBlock(String str) {
  int bigBlock = 0;
  for(int i = 0; i < str.length()-1; ++i){
    for(int j = i; j < str.length(); ++j){
      if(str.charAt(i) != str.charAt(j))
        break;
      else 
        bigBlock = Math.max(bigBlock, j-i+1);
    }
  }
  return bigBlock;
}



public int sumNumbers(String str) {
  int tot = 0;
  for(int i = 0; i < str.length(); ++i){
    if(Character.isDigit(str.charAt(i))){
      for(int j = i; j < str.length(); ++j){
        if(!Character.isDigit(str.charAt(j))){
          tot += Integer.parseInt(str.substring(i,j));
          i = j-1;
          break;
        }
        if(j == str.length()-1){
          tot += Integer.parseInt(str.substring(i,j+1));
          i = j;
        }
      }
    }
  }
  return tot;
}



public String notReplace(String str) {
  String isNot = "";
  for(int i = 0; i < str.length()-1; ++i){
    if(str.substring(i,i+2).equals("is")){
      if(i == 0 && i < str.length()-2){
        if(!Character.isLetter(str.charAt(i+2)))
          isNot += "is not";
        else
          isNot += str.substring(i,i+2);
      }
      else if(i == 0 && i == str.length()-2){
          isNot += "is not";
      }
      else if(i != 0 && i <= str.length()-3){
        if(!Character.isLetter(str.charAt(i+2)) && !Character.isLetter(str.charAt(i-1)))
          isNot += "is not";
        else
          isNot += str.substring(i,i+2);
      }
      else if(i != 0 && i == str.length()-2){
        if(!Character.isLetter(str.charAt(i-1)))
          isNot += "is not";
        else
          isNot += str.substring(i,i+2);
      }
      else
        isNot += str.substring(i,i+2);
      ++i;
    }
    else if(i == str.length()-2)
      isNot += str.substring(i);
    else
      isNot += str.charAt(i);
  }
  return isNot;
}



