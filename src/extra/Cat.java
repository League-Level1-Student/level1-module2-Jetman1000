/*
 * 1. Write a Constructor for a Cat object that sets its name and number of naps. (3)


public class Cat {

       private String name;
       private int napsPerDay;


public Cat(String name. int napsPerDay){
this.name=name;
this.napsPerDay=napsPerDay;
}










}


2. Name three JComponents. (3)

      JPanel

      JLabel

      Jframe

3. Write a method that takes a person’s name as a parameter. If it’s your name, return “awesome”, otherwise return “lame”. (3)

public void getName(String name){
if(name.equals( "Connor")){
System.out.println("awesome");
	}else{
System.out.println("lame");
}










4. Create variables for the following: (4)

      The number of shoes you have

      The name of your favorite ice cream

      Whether you are going to the dance

      A JButton

      A Cat called Felix

1.) int shoes=10;

2.)String favIceCream="Vanilla"

3.)boolean dance=true;
   

4.)JButton button=new JButton();

5.)Cat Felix=new Cat("Felix", 30);



5. Write code to create strawberry jam and spread it on toast. (7)

public class Jam {

      String flavor;

       Jam(String flavor) {

              this.flavor = flavor;
       }

       void spreadOnToast() {

              System.out.println("Spreading "+flavor+“ jam on toast”);
      }
     
} 
 * 
 * 
 * **/


Jam j=new Jam("blueberry");
j.spreadonToast();

