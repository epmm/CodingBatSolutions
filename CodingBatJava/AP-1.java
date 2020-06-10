public boolean scoresIncreasing(int[] scores) {
  for(int i = 0;i < scores.length-1; ++i){
    if(scores[i] > scores[i+1])
      return false;
  }
  return true;
}



public boolean scores100(int[] scores) {
  for(int i = 0; i < scores.length-1; ++i){
    if(scores[i] == 100 && scores[i+1] == 100)
      return true;
  }
  return false;
}



public boolean scoresClump(int[] scores) {
  for(int i = 0; i < scores.length-2; ++i){
    if(scores[i+2] - scores[i] < 3)
      return true;
  }
  return false;
}



public int scoresAverage(int[] scores) {
  int frontAv = average(scores, 0, scores.length/2-1);
  int backAv = average(scores, scores.length/2, scores.length-1);
  if(frontAv > backAv)
    return frontAv;
  return backAv;
}

public int average(int[] scores, int start, int end){
  int tot = 0;
  for(int i = start;i <= end;++i){
    tot += scores[i];
  }
  return tot/(end-start+1);
}



public int wordsCount(String[] words, int len) {
  int count = 0;
  for(String s:words){
    if(s.length() == len)
      ++count;
  }
  return count;
}



public String[] wordsFront(String[] words, int n) {
  String[] arrN = new String[n];
  for(int i = 0; i < n; ++i){
    arrN[i] = words[i];
  }
  return arrN;
}



public List wordsWithoutList(String[] words, int len) {
  List<String> daList = new ArrayList<String>();
  
  for(String el : words){
    if(el.length() != len)
      daList.add(el);
  }
  
  return daList;
}



public boolean hasOne(int n) {
  while(n > 0){
    if(n%10 == 1)
      return true;
    else
      n = n/10;
  }
  return false;
}



public boolean dividesSelf(int n) {
  int newN = n;
  while(newN > 0){
    if(n%10 == 0)
      return false;
    if(n%(newN%10) != 0)
      return false;
    else 
      newN = newN/10;
  }
  return true;
}



public int[] copyEvens(int[] nums, int count) {
  int[] evens = new int[count];
  int ind = 0;
  for(int i = 0; i < nums.length; ++i){
    if(ind == count)
      break;
    if(nums[i]%2 == 0){
      evens[ind] = nums[i];
      ++ind;
    }
  }
  return evens;
}



public int[] copyEndy(int[] nums, int count) {
  int[] endyArr = new int[count];
  int ind = 0;
  for(int i = 0; i < nums.length; ++i){
    if(isEndy(nums[i]) && ind < count){
      endyArr[ind] = nums[i];
      ++ind;
    }
  }
  return endyArr;
}

public boolean isEndy(int n){
  if(n >= 0 && n <= 10 || n >= 90 && n <= 100)
    return true;
  return false;
}



public int matchUp(String[] a, String[] b) {
  int count = 0;
  for(int i = 0; i < a.length; ++i){
    if(a[i].length() > 0 && b[i].length() > 0){
      if(a[i].charAt(0) == b[i].charAt(0))
        ++count;
    }
  }
  return count;
}



public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  for(int i = 0; i < key.length; ++i){
    if(key[i].equals(answers[i]))
      score += 4;
    else if(!answers[i].equals("?"))
      score -= 1;
  }
  return score;
}



public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for(String s:words){
    if(s.equals(target))
      ++count;
  }
  String[] noTarg = new String[words.length-count];
  int ind = 0;
  for(String s:words){
    if(s.equals(target))
      continue;
    noTarg[ind] = s;
    ++ind;
  }
  return noTarg;
}



public int scoresSpecial(int[] a, int[] b) {
  return special(a) + special(b);
}

public int special(int[] x){
  int bigSpec = 0;
  for(int i = 0; i < x.length; ++i){
    if(x[i]%10 == 0)
      bigSpec = Math.max(bigSpec,x[i]);
  }
  return bigSpec;
}



public int sumHeights(int[] heights, int start, int end) {
  int tot = 0;
  for(int i = start; i < end; ++i){
    tot += (Math.abs(heights[i]-heights[i+1]));
  }
  return tot;
}



public int sumHeights2(int[] heights, int start, int end) {
  int tot = 0;
  for(int i = start; i < end; ++i){
    if(heights[i+1] > heights[i])
      tot += (Math.abs(heights[i]-heights[i+1]))*2;
    else
      tot += (Math.abs(heights[i]-heights[i+1]));
  }
  return tot;
}



public int bigHeights(int[] heights, int start, int end) {
  int count = 0;
  for(int i = start; i < end; ++i){
    if(Math.abs(heights[i]-heights[i+1]) > 4)
      ++count;
  }
  return count;
}



public int userCompare(String aName, int aId, String bName, int bId) {
  if(aName.compareTo(bName) > 0)
    return 1;
  if(aName.compareTo(bName) < 0)
    return -1;
  if(aName.compareTo(bName) == 0){
    if(aId < bId)
      return -1;
    if(aId > bId)
      return 1;
    if(aId == bId)
      return 0;
  }
  return 0;
}



public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] comb = new String[n];
  int aInd = 0;
  int bInd = 0;
  int nInd = 0;
  while(nInd < n){
    if(a[aInd].compareTo(b[bInd]) < 0){
      comb[nInd] = a[aInd];
      ++aInd;
      ++nInd;
    }
    else if(a[aInd].compareTo(b[bInd]) > 0){
      comb[nInd] = b[bInd];
      ++bInd;
      ++nInd;
    }
    else if(a[aInd].compareTo(b[bInd]) == 0){
      comb[nInd] = b[bInd];
      ++bInd;
      ++nInd;
      ++aInd;
    }
  }
  return comb;
}

/*
  //these additions are meant to account for cases in mergeTwo when the 
  //given arrays are different sizes and/or the arrays have duplicates
    if(aInd >= a.length){
      comb[nInd] = b[bInd];
      ++bInd;
    }
    else if(bInd >= b.length){
      comb[nInd] = a[aInd];
      ++aInd;
    }
	  //these whiles are supposed to be nested in the 1st and 2nd ifs and replace ++bInd/++aInd
      while(a[aInd].compareTo(b[bInd]) <= 0){
        ++aInd;
        if(aInd >= a.length)
          break;
      }
      
      while(comb[nInd].compareTo(b[bInd]) >= 0){
        ++bInd;
        if(bInd >= b.length)
          break;
      }
*/



public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int ind = 0;
  boolean match = false;
  for(int i = 0; i < a.length; ++i){
    if(ind >= b.length)
      break;
    while(a[i].charAt(0) >= b[ind].charAt(0)){
      if(a[i].charAt(0) == b[ind].charAt(0) && a[i].equals(b[ind]) && !match){
        ++count;
        match = true;
        ++ind;
      }
      else
        ++ind;
      if(ind >= b.length)
        break;
    }
    match = false;
  }
  return count;
}
