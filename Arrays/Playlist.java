package Arrays;

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    //Creating arrayList of Type String 
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    //Adding Strings to ArrayList 
    desertIslandPlaylist.add("Song1");
    desertIslandPlaylist.add("Song2");
    desertIslandPlaylist.add("Song3");
    desertIslandPlaylist.add("Song4");
    desertIslandPlaylist.add("Song5");
    desertIslandPlaylist.add("Song6");

    //Test Print out 
    //System.out.println(desertIslandPlaylist);

    //Checking Size of ArrayList 
    System.out.println("Size of arrayList: " + desertIslandPlaylist.size());

    //Removing 1 song from playlist 
    desertIslandPlaylist.remove(2);

    //Swithing positions of 2 songs within ArrayList using temporary variable 
    int songA = desertIslandPlaylist.indexOf("Song1");
    int songB = desertIslandPlaylist.indexOf("Song2");
    System.out.println("Index of Song1: " + songA );
    System.out.println("Index of Song2: " + songB );

    String tempA = desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(songA,desertIslandPlaylist.get(songB));
    desertIslandPlaylist.set(songB, tempA);

    System.out.println(desertIslandPlaylist);

    
  }
  
}