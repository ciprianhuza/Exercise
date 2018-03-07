public class exempluUdacity6 {
  public static void main(String [] args){
   int dayOfTheWeek=0;
   boolean holiday = false;
    if ( dayOfTheWeek > 5 && dayOfTheWeek<=7){
	  System.out.println("Sleep on");
	}
	else if (dayOfTheWeek < 5 && dayOfTheWeek >=1){
		System.out.println("Wake up at 7:00");
	}
	else {
		System.out.println("Error");
	}
  

}
}
