package Loops;

import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
    //Removes any element within LunchBox arrayList with the string ant
   int counter = 0;
   while (counter < lunchBox.size()){
     if (lunchBox.get(counter) == "ant"){
       lunchBox.remove(counter);
     }
     else{
       counter++;
     }

   }
    return lunchBox;
  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}