public boolean canBalance(int[] nums) 
{
  int sum = 0, sumLeft = 0, sumRight = 0;
  
  for(int i = 0; i < nums.length; i++)
  {
    sum += nums[i];
  }
  
  sumRight = sum;
  
  for ( int j = 0; j < nums.length; j++)
  {
    sumLeft += nums[j];
    sumRight -= nums[j];
    
    if(sumRight == sumLeft)
    {
      return true;
    }
  }
  
  return false;
}