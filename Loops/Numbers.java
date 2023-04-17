package Loops;

//Prints out numbers that are divisable by 5 up to 100
class Numbers {
    public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        // Add your code below
        if(i % 5 != 0 ){
          continue;
        }
        System.out.println(i);      
      }
    }
  }
      