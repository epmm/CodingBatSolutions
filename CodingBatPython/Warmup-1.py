def sleep_in(weekday, vacation):
  return not weekday or vacation



def monkey_trouble(a_smile, b_smile):
  if(a_smile and b_smile):
    return True
  elif(not(a_smile or b_smile)):
    return True
  else:
    return False



def sum_double(a, b):
  if(a == b):
    return 4*a
  else:
    return a + b



def diff21(n):
  if(n > 21):
    return abs(n-21)*2
  else:
    return abs(n-21)



def parrot_trouble(talking, hour):
  return (talking and (hour < 7 or hour > 20))



def makes10(a, b):
  return (is10(a) or is10(b) or is10(a+b))
  
def is10(a):
  if(a == 10):
    return True
  else:
    return False



def near_hundred(n):
  return (abs(n-100) <= 10 or abs(n-200) <= 10)




def pos_neg(a, b, negative):
  if(not negative):
    return (bool(a < 0) ^ bool(b < 0))
  else:
    return (a < 0 and b < 0)



def not_string(str):
  if(len(str) >= 3):
    if(str[0:3] == "not"):
      return str
    else:
      return "not " + str
  else:
    return "not " + str



def missing_char(str, n):
  return str[:n] + str[n+1:]



def front_back(str):
  swapEnds = ""
  if(len(str) <= 1):
    return str
  
  mid = str[1:-1]
  return str[len(str)-1] + mid + str[0]



def front3(str):
  if(len(str) < 4):
    return str + str + str
  return str[0:3] + str[0:3] + str[0:3]



