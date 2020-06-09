def double_char(str):
  dubStr = ""
  for i in range(len(str)):
    dubStr += str[i] 
    dubStr += str[i] 
  return dubStr



def count_hi(str):
  count = 0
  for i in range(len(str)):
    if(str[i:i+2] == 'hi'):
      count = count + 1
  return count



def cat_dog(str):
  dcount = 0
  ccount = 0
  for i in range(len(str)):
    if(str[i:i+3] == 'cat'):
      ccount = ccount + 1
    if(str[i:i+3] == 'dog'):
      dcount = dcount + 1
  return ccount == dcount
  
  

def count_code(str):
  count = 0
  for i in range(len(str)-3):
    if(str[i:i+2] == 'co' and str[i+3] == 'e'):
      count = count + 1
  return count



def end_other(a, b):
  c = ""
  if(len(a) > len(b)):
    return b.lower() == a[-len(b):].lower()
  else:
     return a.lower() == b[-len(a):].lower()
  



def xyz_there(str):
  for i in range(len(str)-2):
    if(str[i:i+3] == "xyz" and str[i-1] != "."): 
      return True
  return False
#doesn't account for case when str[-1] is "." 



