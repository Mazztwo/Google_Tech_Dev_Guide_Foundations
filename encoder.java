public String[] encoder(String[] raw, String[] code_words) 
{
    ArrayList<String> encoding = new ArrayList<String>();
    ArrayList<String> raw_key = new ArrayList<String>();
    ArrayList<String> code_value = new ArrayList<String>();
    int codeIndex = 0;
    
    for (String word: raw)
    {
      if (!raw_key.contains(word))
      {
        if (codeIndex < code_words.length - 1)
        {
          raw_key.add(word);     
          code_value.add(code_words[codeIndex]);
          codeIndex++;
        }
      }
    }
    
    String key[] = raw_key.toArray(new String[raw_key.size()]);
    String value[] = code_value.toArray(new String[code_value.size()]);
    
    for (String word: raw)
    {
      for (int i = 0; i < key.length; i++)
      {
        if (key[i] == word)
        {
          encoding.add(value[i]);
        }
      }
    }
    
    return encoding.toArray(new String[encoding.size()]);
}