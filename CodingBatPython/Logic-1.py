def cigar_party(cigars, is_weekend):
  if(cigars >= 40 and cigars <= 60):
    return True
  elif(is_weekend and cigars >= 40):
    return True
  return False
  
  
  
def date_fashion(you, date):
  if(you < 3 or date < 3):
    return 0
  elif(you > 7 or date > 7):
    return 2
  return 1



def squirrel_play(temp, is_summer):
  if(temp >= 60 and temp <= 90):
    return True
  elif(is_summer and temp >= 60 and temp <= 100):
    return True
  return False



def caught_speeding(speed, is_birthday):
  if(is_birthday):
    speed -= 5
  if(speed <= 60):
    return 0
  elif(speed <= 80):
    return 1
  return 2



def sorta_sum(a, b):
  if(a + b >= 10 and a + b <= 19):
    return 20
  return a + b



def alarm_clock(day, vacation):
  if(vacation and (day == 6 or day == 0)):
    return "off"
  elif(vacation or day == 6 or day == 0):
    return "10:00"
  return "7:00"



def love6(a, b):
  if(is6(a) or is6(b) or is6(a+b) or is6(abs(a-b))):
    return True
  else:
    return False
  
def is6(x):
  if(x == 6):
    return True
  return False



def in1to10(n, outside_mode):
  if(outside_mode):
    if(n <= 1 or n >= 10):
      return True
    else:
      return False
  else:
    if(n >= 1 and n <= 10):
      return True
    else:
      return False



def near_ten(num):
  return num%10 < 3 or num%10 > 7  



