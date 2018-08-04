public Map<String, Integer> word0(String[] strings) 
{
  boolean keepGoing = true;
  Map<String, Integer> theMap = new HashMap<String, Integer>();
  int currIndex = 0;
  
  while ( keepGoing )
  {
    if ( strings.length > 0 && !theMap.containsKey(strings[currIndex]) )
    {
       theMap.put(strings[currIndex], 0);
    }
    
    if ( currIndex < strings.length-1 )
    {
      currIndex++;
    }
    else
    {
      keepGoing = false;
    }
  }
  
  return theMap;
}