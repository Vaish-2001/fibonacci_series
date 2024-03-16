class fibonacci_sequence
 {
  /*The Fibonacci sequence is a type series where
   each number is the sum of the two that precede it.
  */
  public static void main(String[]args)
    {
     int first_num=0;
     int second_num=1;
     int  result=0;
     int count=0;
    
  for(int i=1;i<10;i++)
      {
        result=first_num+second_num;
      
       first_num=second_num;
       second_num=result;
       System.out.println("fibonacci sequenceis = " result);
      }
     
    }
 }//1,2,3,5,8,13,21,34,55