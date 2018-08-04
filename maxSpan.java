public int maxSpan(int[] nums) 
{

  int lastOccurance, curr, span = 0, maxSpan = 0;
  
  for (int i = 0; i < nums.length; i++)
  {
    // Go through array from left to right
    curr = nums[i];
    lastOccurance = i;
    
    for (int j = i; j < nums.length; j++)
    {
      // Go through and find last occurance
      
      if (nums[j] == curr)
      {
        lastOccurance = j;
      }
      
    }
    
    // Calculate span
    span = lastOccurance - i + 1;
    
    // Update span if curr span is larger than the max span
    
    if ( span > maxSpan){
      maxSpan = span;
    }
    
  }

  return maxSpan;
  
}