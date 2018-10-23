package extra;

import org.omg.Messaging.SyncScopeHelper;

public class runningRace {

     static int nextBibNumber;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

runningRace (String name, int speed){
     this.name = name;
     this.speed = speed;
}
     public String getRaceStartTime() {
    	 return raceStartTime;
     }
     public void setRaceStartTime(String raceStartTime) {
    	 runningRace.raceStartTime=raceStartTime;
     }
     
     

public String getRaceLocation(){
	return raceLocation;
}
public void setRaceLocation() {
	this.raceLocation=raceLocation;

}
public String getName() {
	return name;
}
public void setBibNumber(int bibNumber) {
	this.bibNumber=bibNumber;
}

public int getBibNumber() {
	return bibNumber;
}

public static void main(String[] args) {
	

runningRace bob=new runningRace("bob", 50); 
runningRace obo=new runningRace("obo", 50);
System.out.println(bob.getName());
bob.setBibNumber(1);
obo.setBibNumber(2);
System.out.println(obo.getName());
System.out.println(bob.getBibNumber());
System.out.println(obo.getBibNumber());
System.out.println(bob.getRaceLocation());
System.out.println(obo.getRaceLocation());
System.out.println(bob.getRaceStartTime());
System.out.println(obo.getRaceStartTime());

}

}










