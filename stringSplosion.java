public String stringSplosion(String str) 
{
  String ret = "";
  
  for (int i = 0; i < str.length() ; i++)
  {
    ret = ret + str.substring(0, i+1);
  }
  
  return ret;
}