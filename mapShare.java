public Map<String, String> mapShare(Map<String, String> map) 
{
 String aVal = map.get("a");
 
 if(aVal != null)
 {
   map.put("b", aVal);
 }
 
 map.remove("c");
 
 return map;
}