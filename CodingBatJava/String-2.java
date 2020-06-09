public String doubleChar(String str) {
  String newStr="";
  for(int i = 0;i<str.length();++i){
    newStr += str.substring(i,i+1);
    newStr += str.substring(i,i+1);
  }
  return newStr;
}



public int countHi(String str) {
  int count = 0;
  for(int i = 0;i < str.length()-1;++i){
    if(str.substring(i,i+2).equals("hi"))
      ++count;
  }
  return count;
}



public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  int i = 0;
  while(i < str.length()-2){
    if(str.substring(i, i+3).equals("cat")){
      ++catCount;
      i += 2;
    }
    else if(str.substring(i, i+3).equals("dog")){
      ++dogCount;
      i += 2;
    }
    else
      ++i;
  }
  if(catCount == dogCount)
    return true;
  else
    return false;
}



public int countCode(String str) {
  int count = 0;
  for(int i = 0; i < str.length()-3; ++i){
    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
      ++count;
  }
  return count;
}



public boolean endOther(String a, String b) {
  if(a.toLowerCase().endsWith(b.toLowerCase()) 
    || b.toLowerCase().endsWith(a.toLowerCase()))
    return true;
  return false;
}



public boolean xyzThere(String str) {
  for(int i = 0; i < str.length()-2;++i){
    if(i == 0 && str.substring(i,i+3).equals("xyz"))
      return true;
    if(i == str.length()-3)
      break;
    if(str.charAt(i) != '.' && str.substring(i+1,i+4).equals("xyz"))
      return true;
  }
  return false;
}



public boolean bobThere(String str) {
  for(int i = 0;i < str.length()-2;++i){
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
      return true;
  }
  return false;
}



public boolean xyBalance(String str) {
  boolean xOn = false;
  boolean yOn = true;
  for(int i = 0;i<str.length();++i){
    if(str.charAt(i) == 'x'){
      xOn = true;
      yOn = false;
    }
    if(str.charAt(i) == 'y' && xOn){
      yOn = true;
      xOn = false;
    }
  }
  return yOn;
}



public String mixString(String a, String b) {
  String mix = "";
  int length = Math.min(a.length(),b.length());
  if(length == 0)
    return a + b;
  for(int i = 0;i < length;++i){
    if(i == length-1 && a.length() > b.length()){
      mix += a.substring(i,i+1);
      mix += b.substring(i);
      mix += a.substring(i+1);
    }
    else if(i == length-1 && a.length() < b.length()){
      mix += a.substring(i,i+1);
      mix += b.substring(i);
    }
    else{
      mix += a.substring(i,i+1);
      mix += b.substring(i,i+1);
    }
  }
  return mix;
}



public String repeatEnd(String str, int n) {
  String bigN = "";
  for(int i = 0;i < n;++i){
    bigN += str.substring(str.length()-n, str.length()); 
  }
  return bigN;
}



public String repeatFront(String str, int n) {
  String rep = "";
  for(int i = n; i > 0;--i){
    rep += str.substring(0,i);
  }
  return rep;
}



public String repeatSeparator(String word, String sep, int count) {
  String str = "";
  for(int i = 1; i < count; ++i){
    str += word;
    str += sep;
  }
  if(count>0)
    return str + word;
  return str;
}



public boolean prefixAgain(String str, int n) {
  if(str.indexOf(str.substring(0,n), n) != -1)
    return true;
  return false;
}



public boolean xyzMiddle(String str) {
  if(str.length()%2 == 0 && str.length() > 2){
    if(str.substring(str.length()/2-1,str.length()/2+2).equals("xyz") 
      || str.substring(str.length()/2-2,str.length()/2+1).equals("xyz"))
      return true;
  }
  if(str.length()%2 == 1 && str.length() > 2){
    if(str.substring(str.length()/2-1,str.length()/2+2).equals("xyz"))
      return true;
  }
  return false;
}



public String getSandwich(String str) {
  int firstBread = str.indexOf("bread");
  int lastBread = str.lastIndexOf("bread");
  if(firstBread == lastBread)
    return "";
  return str.substring(firstBread+5,lastBread);
}



public boolean sameStarChar(String str) {
  for(int i = 1;i < str.length()-1;++i){
    if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))
      return false;
  }
  return true;
}



public String oneTwo(String str) {
  String twoOne = "";
  for(int i = 0; i < str.length()-2; i += 3){
    twoOne += str.substring(i+1,i+3);
    twoOne += str.substring(i,i+1);
  }
  return twoOne;
}



public String zipZap(String str) {
  if(str.length() <= 2)
    return str;
  String zp = "";
  for(int i = 0; i < str.length()-2;++i){
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
      zp += "zp"; i += 2;}
    else if(i >= str.length()-3)
      zp += str.substring(i);
    else
      zp += str.substring(i,i+1);
  }
  return zp;
}



public String starOut(String str) {
  String nu = "";
  for(int i = 0;i < str.length();++i){
    if(i == 0 && str.length() > 1){
      if(str.charAt(i) != '*' && str.charAt(i+1) != '*')
        nu += str.substring(i,i+1);
    }
    else if(i == str.length()-1 && str.length() > 1){
      if(str.charAt(i) != '*' && str.charAt(i-1) != '*')
        nu += str.substring(i,i+1);
    }
    else if(i == 0 && str.length() == 1 && str.charAt(i) != '*'){
      return str;
    }
    else if(str.charAt(i) != '*' && str.charAt(i-1) != '*' && str.charAt(i+1) != '*')
        nu += str.substring(i,i+1);
  }
  return nu;
}



public String plusOut(String str, String word) {
  int wordLen = word.length();
  String newStr = "";
  for(int i = 0; i < str.length(); ++i){
    if(i <= str.length()-wordLen){
      if(str.substring(i,i+wordLen).equals(word)){
        newStr += word;
        i += wordLen-1;
      }
      else 
        newStr += "+";
    }
    else
      newStr += "+";
  }
  return newStr;
}



public String wordEnds(String str, String word) {
  int wordLen = word.length();
  String ends = "";
  for(int i = 0 ; i <= str.length()-wordLen ; ++i){
    if(str.substring(i,i+wordLen).equals(word)){
      if(i > 0)
        ends += str.charAt(i-1);
      if(i+wordLen < str.length())
        ends += str.charAt(i+wordLen);
    }
  }
  return ends;
}



