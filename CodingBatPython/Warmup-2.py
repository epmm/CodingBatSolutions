def string_times(str, n):
  nStr = ""
  for i in range(n):
    nStr += str
  return nStr



def front_times(str, n):
  nFront = ""
  if(len(str) >2):
    front = str[:3]
  else:
    front = str
  for i in range(n):
    nFront += front
  return nFront



def string_bits(str):
  bits = ""
  x = len(str)
  for i in range(x):
    if(i % 2 == 0):
      bits += str[i]
  return bits



def string_splosion(str):
  splosion = ""
  for i in range(len(str)):
    splosion += str[:i+1]
  return splosion



def last2(str):
  count = 0
  for i in range(len(str) - 2):
    if(str[i:i+2] == str[-2:]):
      count += 1
  return count



def array_count9(nums):
  count = 0
  for i in range(len(nums)):
    if(nums[i] == 9):
      count += 1
  return count



def array_front9(nums):
  for i in range(len(nums)):
    if(nums[i] == 9 and i < 4):
      return True
  return False



def array123(nums):
  for i in range(len(nums)-2):
    if(nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3):
      return True
  return False
  
  
  
def string_match(a, b):
  count = 0
  for i in range(len(a)-1):
    if(a[i:i+2] == b[i:i+2]):
      count += 1
  return count




