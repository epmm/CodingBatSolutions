public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    map.put(s, 0);
  }
  return map;
}



public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    map.put(s, s.length());
  }
  return map;
}



public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap();
  for (String s:strings) {
    map.put("" + s.charAt(0), "" + s.charAt(s.length()-1));
  }
  return map;
}



public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(String s:strings){
    if(map.containsKey(s))
      map.put(s,map.get(s) + 1);
    else
      map.put(s,1);
  }
  return map;
}



public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String s:strings){
    if(map.containsKey(""+s.charAt(0)))
      map.put(""+s.charAt(0),map.get(""+s.charAt(0)) + s);
    else
      map.put(""+s.charAt(0), s);
  }
  return map;
}



public String wordAppend(String[] strings) {
  String wurd = "";
  Map<String, Integer> map = new HashMap();
  for(String s:strings){
    if(map.containsKey(s)){
      map.put(s,map.get(s) + 1);
      if(map.get(s)%2 == 0)
        wurd += s;
    }
    else
      map.put(s,1);
  }
  return wurd;
}



public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> strBoo = new HashMap();
  for(String el : strings){
    if(strBoo.containsKey(el))
      strBoo.put(el, true);
    else
      strBoo.put(el, false);
  }
  return strBoo;
}



public String[] allSwap(String[] strings) {
  String[] olSwop = new String[strings.length];
  Map<String, Integer> map = new HashMap();
  String holder = "";
  int i = 0;
  for(String s:strings){
    if(map.containsKey(""+s.charAt(0))){
      holder = olSwop[map.get(""+s.charAt(0))];
      olSwop[i] = holder;
      olSwop[map.get(""+s.charAt(0))] = s;
      map.remove(""+s.charAt(0));
    }
    else{
      map.put(""+s.charAt(0), i);
      olSwop[i] = s;
    }
    ++i;
  }
  return olSwop;
}



public String[] firstSwap(String[] strings) {
  String[] olSwop = new String[strings.length];
  Map<String, Integer> map = new HashMap();
  String holder = "";
  int i = 0;
  for(String s:strings){
    if(map.get(""+s.charAt(0)) != null && map.get(""+s.charAt(0)) != -1){
      holder = olSwop[map.get(""+s.charAt(0))];
      olSwop[i] = holder;
      olSwop[map.get(""+s.charAt(0))] = s;
      map.put(""+s.charAt(0),-1);
    }
    else if(map.get(""+s.charAt(0)) != null && map.get(""+s.charAt(0)) == -1){
      olSwop[i] = s;
    }
    else{
      map.put(""+s.charAt(0), i);
      olSwop[i] = s;
    }
    ++i;
  }
  return olSwop;
}


