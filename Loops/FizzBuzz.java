package Loops;

/*If I divisible by 3 and 5 FizzBuzz 
 If I divisible by 3 only Fizz
 If I divisible by 5 only Buzz
 */

class FizzBuzz{

    public static void main(String[] args){
  
      for(int i = 1; i <= 100; i++){
        if (i%3 == 0 && i%5 == 0){
          System.out.println("FizzBuzz");
        }
        else if(i % 3 == 0){
          System.out.println("Fizz");
        }
         else if(i % 5 == 0){
          System.out.println("Buzz");
        }
        else{
          System.out.println(i);
        }
      }
  
    }
  }