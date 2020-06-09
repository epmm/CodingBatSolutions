public String helloName(String name) {
  return "Hello " + name + "!"; 
}



public String makeAbba(String a, String b) {
  return a + b + b + a;
}



public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}



public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2, 4);
}



public String extraEnd(String str) {
  return str.substring(str.length() - 2, str.length()) + 
    str.substring(str.length() - 2, str.length()) + 
    str.substring(str.length() - 2, str.length());
}



public String firstTwo(String str) {
  if(str.length() < 2)
    return str;
  return str.substring(0, 2);
}



public String firstHalf(String str) {
  return str.substring(0, str.length()/2);
}



public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}



public String comboString(String a, String b) {
  if (a.length() > b.length())
    return b + a + b;
  else
    return a + b + a;
}



public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}



public String left2(String str) {
  return str.substring(2) + str.substring(0,2);
}



public String right2(String str) {
  String rotated = "";
  rotated += str.substring(str.length() - 2);
  rotated += str.substring(0,str.length() - 2);
  
  return rotated;
}



public String theEnd(String str, boolean front) {
  return (front)? str.substring(0,1): str.substring(str.length() - 1);
}



public String withouEnd2(String str) {
 String without = "";
 if(str.length() > 1)
  without += str.substring(1,str.length()-1);
 return without;
}



public String middleTwo(String str) {
  return str.substring(str.length()/2-1, str.length()/2+1);
}



public boolean endsLy(String str) {
  return str.endsWith("ly");
}



public String nTwice(String str, int n) {
  if(str.length()>3)
    return str.substring(0, n) + str.substring(str.length() - n);
  else
    return str;
}



public String twoChar(String str, int index) {
  if(index+1 > str.length()-1 || index < 0)
    return str.substring(0, 2);
  return str.substring(index, index+2);
}



public String middleThree(String str) {
  return str.substring(str.length()/2-1, str.length()/2+2); 
}



public boolean hasBad(String str) {
  if(str.length()<3)
    return false;
  return (str.indexOf("bad") == 0||str.indexOf("bad") == 1)? true:false;
}



public String atFirst(String str) {
  if(str.length() > 1)
    return str.substring(0,2);
  if(str.length() == 1)
    return str + "@";
  else
    return "@@";
}



public String lastChars(String a, String b) {
  String last = "";
  if(a.length() == 0)
    last += "@";
  else 
    last += a.substring(0,1);
  if(b.length() == 0)
    last += "@";
  else 
    last += b.substring(b.length()-1);
  
  return last;
}



public String conCat(String a, String b) {
  if(b.length() != 0){
    if(a.endsWith(b.substring(0,1)))
      return a + b.substring(1);
  }
  return a + b;
}



public String lastTwo(String str) {
  if(str.length() > 1)
    return str.substring(0,str.length()-2) 
     + str.substring(str.length()-1,str.length())
     + str.substring(str.length()-2,str.length()-1);
  else
    return str;
   
}



public String seeColor(String str) {
  if(str.startsWith("red"))
    return "red";
  else if(str.startsWith("blue"))
    return "blue";
  else 
    return "";
}



public boolean frontAgain(String str) {
  if(str.length() > 1){
    String first2 = str.substring(0,2);
    return str.startsWith(first2) && str.endsWith(first2);
  }
  else
    return false;
}



public String minCat(String a, String b) {
  int difLength = Math.abs(a.length() - b.length());
  if(a.length() > b.length())
    return a.substring(difLength) + b;
  return a + b.substring(difLength);
}



public String extraFront(String str) {
  if(str.length() < 2)
    return str + str + str;
  else
    return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
}



public String without2(String str) {
  if(str.length() > 1){
    if(str.endsWith(str.substring(0,2))){
      return str.substring(2);
    }
    return str;
  }
  return str;
}



public String deFront(String str) {    
  String noFront = "";
  if(str.length() > 2){
    noFront += (contains(str, 'a', 0))? "a":"";
    noFront += (contains(str, 'b', 1))? "b":"";
    noFront += str.substring(2);
  }
  if(str.length() == 2){
    noFront += (contains(str, 'a', 0))? "a":"";
    noFront += (contains(str, 'b', 1))? "b":"";
  }
  if(str.length() == 1){
    noFront += (contains(str, 'a', 0))? "a":"";
  }
  return noFront;
}

public boolean contains(String str, char c, int index){
  return (str.charAt(index) == c)? true:false;
}



public String startWord(String str, String word) {
  if(str.length()<word.length())
    return "";
  if(word.length() == 1)
    return str.substring(0,1);
  else if(word.length() == 0)
    return "";
  if(match(str, word, 1))
    return str.substring(0, word.length());
  else
    return "";
    
}

public boolean match(String str, String word, int index){
  if(word.length() > index){
    if(str.charAt(index) == word.charAt(index)){
      ++index;
      return match(str, word, index);
    }
    else
      return false;
  }
  return true;
}



public String withoutX(String str) {
  if(str.startsWith("x") && str.length() > 1){
    if(str.endsWith("x"))
      return str.substring(1, str.length() -1);
    else return(str.substring(1));
  }
  else if(str.endsWith("x") && str.length() > 1)
    return str.substring(0, str.length() - 1);
  else{
    if(str.startsWith("x"))
      return "";
    return str;
  }
}



public String withoutX2(String str) {
  //shoulda used .replaceAll("x","")
  
  String newStr = "";
  if(str.startsWith("xx") && str.length() > 2)
    return str.substring(2);
  if(str.startsWith("xx") && str.length() == 2)
    return newStr;
  if(str.startsWith("x") && str.length() > 1)
    return str.substring(1);
  if(str.startsWith("x") && str.length() == 1)
    return newStr;
  if(str.length() == 2){
    if(str.charAt(1) == 'x'){
      return str.substring(0,1);
    }
  }
  if(str.length() > 2){
    if(str.charAt(1) == 'x'){
      return str.substring(0,1) + str.substring(2);
    }
  }
  return str;
}



