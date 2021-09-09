abstract class Vehicle
{
  abstract void bike(String name);
  abstract void driveBike(); 
}
class AbstractDemo extends Vehicle
{
  void bike(String n)
   {
    System.out.println("  My bike name is "+n);
   }
  void driveBike()
   {
     System.out.println("  I am driving bike in pune.");
   }
  
   public static void main(String args[])
    {
	  AbstractDemo a=new AbstractDemo();
	  a.bike("Duke");
	  a.driveBike();
	}
}