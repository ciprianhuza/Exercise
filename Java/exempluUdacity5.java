public class exempluUdacity5{
  public static void main (String [] args){
   double time = 2;
   String timeOfDay;
   if (time >=5 && time<15)
   {
      timeOfDay = "Morning";
	  }
	  else if (time >=12 && time <20){
	    timeOfDay = "Daytime";
	  }
	  else {
	    timeOfDay = "Night";
	  }
	  System.out.println(timeOfDay);
  }
}