
/*
Given a DNA sequence this program will determine if there is a protein included.

A protein has the following qualities:

    It begins with a “start codon”: ATG.
    It ends with a “stop codon”: TGA.
    In between, each additional codon is a sequence of three nucleotides.

*/

public class DNA{
    public static void main(String[] args){
  
      //Three Example DNA Strands 
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      //Generic String used for storage 
      String dna = dna3;
  
      //Lengths of the DNA String 
      System.out.println(dna1.length());
      System.out.println(dna2.length());
      System.out.println(dna3.length());
  
      int start = dna.indexOf("ATG");
      System.out.println("Start of ATG: " + start);
  
      int end = dna.indexOf("TGA");
      System.out.println("End of TGA: " + end);
  
      if(start != -1 && end !=-1 && (start - end) % 3==0){
          String protein = dna.substring(start, end+3); 
          System.out.println("Protein: " + protein);
      }
      else{
        System.out.println("No Protein");
      }
  
  
      /*
      if(dna.indexOf("ATG") != -1 && dna.length() % 3 == 0 && dna.indexOf("TGA") == dna.length()-3){
        System.out.println("This DNA Sequence contains a protein");
      }
      else{
        System.out.println("This DNA Sequence does not conain a protein");
      }
      */
    }
  }