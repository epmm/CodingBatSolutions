public boolean sleepIn(boolean weekday, boolean vacation) {
  
  if(!weekday || vacation)
    return true;
  else
    return false;
}



public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  
  boolean both;
  
  if((aSmile && bSmile) || (!aSmile && !bSmile))
    return true;
  else
    return false;
}



public int sumDouble(int a, int b) {
  
  if(a == b)
    return (a + b) * 2;
  else
    return a + b;
}



public int diff21(int n) {
  
  if(n > 21)
    return (n - 21) * 2;
  else
    return 21 - n;
}



public boolean parrotTrouble(boolean talking, int hour) {
  
  boolean badTime = false;
  if(hour < 7 || hour > 20)
    badTime = true;
  
  return badTime & talking;
}



public boolean makes10(int a, int b) {
  
  if(a == 10 || b == 10 || a + b == 10)
    return true;
  else
    return false;
}



public boolean nearHundred(int n) {
  
  return (Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10);
}



public boolean posNeg(int a, int b, boolean negative) {
  
  if (negative)
    return(a < 0 && b < 0);
  if ((a >= 0 && b >= 0) || (a < 0 && b < 0))
    return false;
  return true;
}



public String notString(String str) {
  if (str.startsWith("not"))
    return str; 
   return "not " + str;
}



public String missingChar(String str, int n) {
  
  String output = "";
  for(int loop = 0; loop <= str.length() - 1; loop++){
    if(n != loop)
    output += str.charAt(loop);
  }
  
  return output;
}



public String frontBack(String str) {
  if(str.length() != 0) {
    
  
    char char0 = str.charAt(0);
    char charEnd = str.charAt(str.length() - 1);
    
    return str.replaceFirst(String.valueOf(char0), String.valueOf(charEnd))
          .substring(0, str.length() - 1) + String.valueOf(char0);
  }
  return str;
}



public String front3(String str) {
  if(str.length() >= 3)
    return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
  return str + str + str;
}



public String backAround(String str) {
  if(str.length() != 0) {
    
    char charEnd = str.charAt(str.length() - 1);
    
    return String.valueOf(charEnd) + str + String.valueOf(charEnd);
  }
  return str;
}



public boolean or35(int n) {
  
  return ((n % 3 == 0) || (n % 5 == 0));
}



public String front22(String str) {
  if (str.length() < 2)
    return str + str + str;
  return str.substring(0, 2) + str + str.substring(0, 2);
}



public boolean startHi(String str) {
  if (str.startsWith("hi"))
    return true;
  return false;
}



public boolean icyHot(int temp1, int temp2) {
  if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100))
    return true;
  return false;
}



public boolean in1020(int a, int b) {
  
  if((10 <= a && a <= 20) || (10 <= b && b <= 20))
    return true;
  else
    return false;
}



public boolean hasTeen(int a, int b, int c) {
  return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
  
}


public boolean loneTeen(int a, int b) {
  // (13 <= a && a <= 19) ^ (13 <= b && b <= 19)
   if(((13 <= a && a <= 19) || (13 <= b && b <= 19)) && !((13 <= a && a <= 19) && (13 <= b && b <= 19)))
    return true;
  else
    return false;
}



public String delDel(String str) {
  if (str.length() >= 4)
  {
    if (str.startsWith("del", 1))
    {
      return str.substring(0,1) + str.substring(4, str.length());
    }
  } 
  return str;
}



public boolean mixStart(String str) {
  return (str.startsWith("ix", 1));
  
}



public String startOz(String str) {
  if(str.startsWith("oz"))
    return str.substring(0,2);
  if(str.startsWith("o"))
    return str.substring(0,1);
  if(str.startsWith("z", 1))
    return str.substring(1,2);
  return "";
}



public int intMax(int a, int b, int c) {
  int max = Math.max(a, b);
  max = Math.max(max, c);
  return max;
}



public int close10(int a, int b) {
    
  int diffA = Math.abs(a - 10);
  int diffB = Math.abs(b - 10);
  
  if(diffA == diffB)
    return 0;
  
  if(diffA < diffB)
    return a;
  else
    return b;
}



public boolean in3050(int a, int b) {
  if (between(30, 40, a) && between(30, 40, b))
    return true;
  else
    return between(40, 50, a) && between(40, 50, b);
}

public boolean between(int min, int max, int num){
  return(min <= num && num <= max);
}



public int max1020(int a, int b) {
  int answer;
  if(10 <= a  && a <= 20)
  {
    if(10 <= b && b <= 20)
      return answer = (a>b)? a : b;
    return a;
  }
  else if(10 <= b && b <= 20)
    return b;
  else 
    return 0;
}



public boolean stringE(String str) {
  int numE = 0;
  
  for(int i = 0; i < str.length();i++)
  {
    char strChar = str.charAt(i);
    if(strChar == 'e')
      numE++;
  }
  return (numE >= 1 && numE <= 3);
}



public boolean lastDigit(int a, int b) {
  return (a % 10 == b % 10);
}



public String endUp(String str) {
  if(str.length() > 3)
    return str.substring(0, str.length() - 3)  
    + str.substring(str.length() - 3).toUpperCase();
  else
    return str.toUpperCase();
}



public String everyNth(String str, int n) {
  String newString = "";
  for(int i = 0; i < str.length(); i += n)
  {
    newString = newString + str.charAt(i);
  }
  return newString;
}
