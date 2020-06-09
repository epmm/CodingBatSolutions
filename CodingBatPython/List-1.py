def first_last6(nums):
  if(nums[0] == 6 or nums[-1] == 6):
    return True
  return False



def same_first_last(nums):
  if(len(nums) > 0 and nums[0] == nums[-1]):
    return True
  return False



def make_pi():
  pi = [3,1,4]
  return pi



def common_end(a, b):
  if(a[0] == b[0] or a[-1] == b[-1]):
    return True
  return False



def sum3(nums):
  return sum(nums)



def rotate_left3(nums):
  lefted = [nums[1], nums[2], nums[0]]
  return lefted



def reverse3(nums):
  rev = [nums[-1],nums[-2],nums[-3]]
  return rev



def max_end3(nums):
  bigNum = max(nums[0], nums[-1])
  nums[0] = bigNum
  nums[1] = bigNum
  nums[2] = bigNum
  return nums



def sum2(nums):
  if(len(nums) == 0):
    return 0
  elif(len(nums) > 1):
    return nums[0] + nums[1]
  return sum(nums)



def middle_way(a, b):
  mids = [a[1], b[1]]
  return mids



def make_ends(nums):
  ends = [nums[0], nums[-1]]
  return ends



def has23(nums):
  if(nums[0] == 2 or nums[0] == 3 or nums[1] == 2 or nums[1] == 3):
    return True
  return False



