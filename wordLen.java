public Map<String, Integer> wordLen(String[] strings) 
{
  Map<String, Integer> newMap = new HashMap<String, Integer>();
  String currString = "";

  for ( int i = 0; i < strings.length; i++ )
  {
    
    currString = strings[i];
    
    if ( !newMap.containsKey(currString) )
    {
      newMap.put(currString, currString.length());
    }
  }
  
  
  return newMap;
}