public boolean cigarParty(int cigars, boolean isWeekend) {
  if(cigars >= 40 && cigars <= 60)
    return true;
  else if(cigars >= 61 && isWeekend)
    return true;
  else 
    return false;
}



public int dateFashion(int you, int date) {
  if(you < 3 || date < 3)
    return 0;
  else if(you > 7 || date > 7)
    return 2;
  else
    return 1;
}



public boolean squirrelPlay(int temp, boolean isSummer) {
  if(temp>=60 && temp<=90)
    return true;
  if(temp>=60 && temp<=100 && isSummer)
    return true;
  return false;
}



public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday)
    speed -= 5;
  if(speed > 80)
    return 2;
  if(speed <= 60)
    return 0;
  return 1;
}



public int sortaSum(int a, int b) {
  if(a+b <= 19 && a+b >= 10)
    return 20;
  return a+b;
}



public String alarmClock(int day, boolean vacation) {
  if(vacation && (day == 6 || day == 0))
    return "off";
  if(vacation || day == 6 || day == 0)
    return "10:00";
  return "7:00";
}



public boolean love6(int a, int b) {
  return (a == 6 || b == 6 || a+b == 6 || Math.abs(a-b) == 6);
}



public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode)
    return n <= 1 || n >= 10;
  return n >= 1 && n <= 10;
}



public boolean specialEleven(int n) {
  if(n%11 == 0 || n%11 == 1)
    return true;
  return false;
}



public boolean more20(int n) {
  if(n%20 == 1 || n%20 == 2)
    return true;
  return false;
}



public boolean old35(int n) {
  if(n%5 == 0 ^ n%3 == 0)
    return true;
  return false;
}



public boolean less20(int n) {
  if(n%20 == 19 || n%20 == 18)
    return true;
  return false;

}



public boolean nearTen(int num) {
  if(num%10 <= 2 || num%10 >= 8)
    return true;
  return false;
}



public int teenSum(int a, int b) {
  if((a > 12 && a < 20) || (b > 12 && b < 20))
    return 19;
  return a + b;
}



public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep)
    return false;
  if(isMorning && isMom)
    return true;
  if(isMorning)
    return false;
  return true;
}



public int teaParty(int tea, int candy) {
  if(tea < 5 || candy < 5)
    return 0;
  else if(tea >= 2*candy || candy >= 2*tea)
    return 2;
  else
    return 1;
}



public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b"))
    return "FizzBuzz";
  else if(str.startsWith("f"))
    return "Fizz";
  else if(str.endsWith("b"))
    return "Buzz";
  else
    return str;
}



public String fizzString2(int n) {
  if(n%3 == 0 && n%5 == 0)
    return "FizzBuzz!";
  if(n%3 == 0)
    return "Fizz!";
  if(n%5 == 0)
    return "Buzz!"; 
  return String.valueOf(n) + "!";
}



public boolean twoAsOne(int a, int b, int c) {
  if(a+b == c || a + c == b || c + b == a)
    return true;
  return false;
}



public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk && c > b)
    return true;
  if(b> a && c > b)
    return true;
  return false;
}



public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk && a <= b && b <= c)
    return true;
  return (a < b && b < c);
}



public boolean lastDigit(int a, int b, int c) {
  if(a%10 == b%10 || a%10 == c%10 || b%10 == c%10)
    return true;
  else
    return false;
}



public boolean lessBy10(int a, int b, int c) {
  if(Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10 || Math.abs(c-b) >= 10)
    return true;
  return false;
}



public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles && die1 == die2)
    ++die1;
  if(die1 == 7)
    die1 = 1;
  return die1 + die2;
}



public int maxMod5(int a, int b) {
  if(a == b)
    return 0;
  else if(a%5 == b%5)
    return Math.min(a, b);
  else
    return Math.max(a,b);
}



public int redTicket(int a, int b, int c) {
  boolean ab = a == b;
  boolean bc = b == c;
  boolean ac = a == c;
  if(ab && bc){
    if(a == 2)
      return 10;
    else
      return 5;
  }
  else if(!ac && !ab)
    return 1;
  else 
    return 0;
}



public int greenTicket(int a, int b, int c) {
  if(a == b && b == c)
    return 20;
  if(a == b || b == c || a == c)
    return 10;
  return 0;
}



public int blueTicket(int a, int b, int c) {
  if(a+b == 10 || a+c == 10 || c+b == 10)
    return 10;
  else if(a+b - (a+c) == 10 || a+b - (b+c) == 10)
    return 5;
  else
    return 0;
}



public boolean shareDigit(int a, int b) {
  int a1, a2, b1, b2;
  a1 = a/10;
  a2 = a%10;
  b1 = b/10;
  b2 = b%10;
  if(a1 == b1 || a1 == b2)
    return true;
  if(a2 == b1 || a2 == b2)
    return true;
  return false;
}



public int sumLimit(int a, int b) {
  if(String.valueOf(a + b).length() > String.valueOf(a).length())
    return a;
  return a + b;
}



