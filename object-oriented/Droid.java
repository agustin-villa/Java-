public class Droid{

    String name;
    int batteryLevel;
    
    //Object of type Droid 
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    //To String method 
    public String toString(){
      return "Hello, I'm the droid: " + name;
    }

    //Method to perform tasks, subtracts 10 from batteryLevel 
    public void performTask(String task){
      batteryLevel -= 10;
      System.out.println(name + " is performing task: " + task);
    }
  
    //Method that takes in the name of a Droid and returns their current battery level
    public void energyReport(Droid name){
      System.out.println("Battery Level For " + name.name + ":" + name.batteryLevel + "%");
    }
  
    //Method that takes 2 droid names and amount to transfer, add transfer amount to droid1 and subtracts that same amount from droid2
    public void energyTransfer(Droid name, Droid name2, int transfer){
  
      name.batteryLevel += transfer;
      name2.batteryLevel -= transfer;
  
    }
  
    public static void main(String[] args){
  
      Droid codey = new Droid("Codey");
      Droid tyler = new Droid("Tyler");
     
      System.out.println(codey);
      codey.performTask("Run");
  
  
      tyler.performTask("Run");
      tyler.performTask("Run");
  
      codey.energyReport(codey);
      tyler.energyReport(tyler);
  
      codey.energyTransfer(codey, tyler, 15);
      codey.energyReport(codey);
    }
  
  }
  