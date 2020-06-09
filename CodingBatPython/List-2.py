def count_evens(nums):
  countEve = 0
  for i in range(len(nums)):
    if(nums[i]%2 == 0):
      countEve = countEve + 1
  return countEve



def big_diff(nums):
  larg = 0
  smol = nums[0]
  for i in range(len(nums)):
    larg = max(larg, nums[i])
    smol = min(smol, nums[i])
  return larg - smol



def centered_average(nums):
  smol = nums[0]
  big = 0
  for i in range(len(nums)):
    smol = min(smol, nums[i])
    big = max(big, nums[i])
  return (sum(nums)-smol-big)/(len(nums)-2)



def sum13(nums):
  tot = 0
  for i in range(len(nums)):
    if(nums[i] != 13):
      if(i > 0 and nums[i-1] != 13):
        tot = tot + nums[i]
      elif(i == 0):
        tot = tot + nums[i]
  return tot
  
  
  
def sum67(nums):
  in67 = 0
  tot = 0
  for i in range(len(nums)):
    if(nums[i] == 6):
      in67 = 1
    elif(in67 == 0):
      tot = tot + nums[i]
    elif(nums[i] == 7):
      in67 = 0
    
  return tot



def has22(nums):
  for i in range(len(nums)-1):
    if(nums[i] == 2 and nums[i+1] == 2):
      return True
  return False



