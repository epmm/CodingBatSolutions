public boolean makeBricks(int small, int big, int goal) {
  if(goal/5<=big)
    return (goal%5<=small);
  else 
    return (goal-5*big<=small);
}  
 
 
 
public int loneSum(int a, int b, int c) {
  int tot = 0;
  if(a != b && a != c)
    tot += a;
  if(b != a && b != c)
    tot += b;
  if(c != a && c != b)
    tot += c;
  return tot;
  
}



public int luckySum(int a, int b, int c) {
  if(a == 13)
    return 0;
  if(b == 13)
    return a;
  if(c ==13)
    return a + b;
  return a + b + c;
}



public int noTeenSum(int a, int b, int c) {
  a = fix_teen(a);
  b = fix_teen(b);
  c = fix_teen(c);
  return a + b + c;
}

public int fix_teen(int n){
  if(n >= 13 && n <= 19){
    if(n != 15 && n != 16)
      return 0;
  }
  return n;
}



public int roundSum(int a, int b, int c) {
  a = round10(a);
  b = round10(b);
  c = round10(c);
  return a + b + c;
}

public int round10(int num){
  if(num%10 < 5)
    num = num - num%10;
  if(num%10 >= 5)
    num = num +(10 - num%10);
  return num;
}



public boolean closeFar(int a, int b, int c) {
  if(Math.abs(a-b) < 2 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2)
    return true;
  if(Math.abs(a-b) >= 2 && Math.abs(a-c) < 2 && Math.abs(b-c) >= 2)
    return true;
  return false;
}



public int blackjack(int a, int b) {
  if(a > 21 && b > 21)
    return 0;
  if(a > 21)
    return b;
  if(b > 21)
    return a;
  return Math.max(a,b);
}



public boolean evenlySpaced(int a, int b, int c) {
  int small = Math.min(a,b);
  small = Math.min(small,c);
  int large = Math.max(a,b);
  large = Math.max(large,c);
  int medium = 0;
  if((a==small || a ==large) && (b==large || b==small))
    medium = c;
  if((b==small || b ==large) && (c==large || c==small))
    medium = a;
  if((a==small || a ==large) && (c==large || c==small))
    medium = b;
  if(medium - small == large - medium)
    return true;
  return false;
}



public int makeChocolate(int small, int big, int goal) {
  if(goal/5 >= big && big*5 + small >= goal)
    return goal-big*5;
  if(goal/5 <= big && goal%5 <= small)
    return goal%5;
  return -1;
}



