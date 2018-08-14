int[] sort(int[] a) 
{
  ArrayList lst = new ArrayList(Arrays.asList(a));
  
  if(a.length == 0 || a.length == 1) { return a; }
  
  int last = lst.get(0), curr;
  
  for(int i = 1; i < lst.size(); i++)
  {
    curr = lst.get(i);
    
    if(curr == last)
    {
      lst.remove(i);
      
    }
    
  }
  
  return lst.toArray();
}
