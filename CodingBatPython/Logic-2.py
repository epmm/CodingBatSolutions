def make_bricks(small, big, goal):
  if(goal/5 <= big and goal%5 <= small):
    return True
  if(goal-(big*5)-small <= 0 and goal/5 >= big):
    return True
  return False



def lone_sum(a, b, c):
  tot = 0
  if(a != b and a != c):
    tot += a
  if(b != a and b != c):
    tot += b;
  if(c != a and c != b):
    tot += c
  return tot
  
  
  
def lucky_sum(a, b, c):
  if(a == 13):
    return 0
  if(b == 13):
    return a
  if(c ==13):
    return a + b
  return a + b + c
  


def no_teen_sum(a, b, c):
  a = fix_teen(a)
  b = fix_teen(b)
  c = fix_teen(c)
  return a + b + c
  
def fix_teen(n):
  if(n >= 13 and n <= 19):
    if(n != 15 and n != 16):
      return 0
  return n



def round_sum(a, b, c):
  a = round10(a)
  b = round10(b)
  c = round10(c)
  return a + b + c
  
def round10(num):
  if(num%10 < 5):
    num = num - num%10
  if(num%10 >= 5):
    num = num +(10 - num%10)
  return num
  


def close_far(a, b, c):
  if(abs(a-b) < 2 and abs(a-c) >= 2 and abs(b-c) >= 2):
    return True
  if(abs(a-b) >= 2 and abs(a-c) < 2 and abs(b-c) >= 2):
    return True
  return False



def make_chocolate(small, big, goal):
  if(goal/5 >= big and big*5 + small >= goal):
    return goal-big*5
  if(goal/5 <= big and goal%5 <= small):
    return goal%5
  return -1
