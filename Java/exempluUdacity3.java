public class exempluUdacity3{

 public static void main(String[] args)
 {
  int price = 10; 
  boolean student = false;
  int age = 18;
  boolean retiredMan = false;
  
  if (student) 
  {
	  System.out.println("Tiket price is:"+price/2);
  }
    else if(age < 15 ){
		System.out.println("Tiket price is:"+price/2);
	}
    else if(retiredMan){
		System.out.println("Tiket price is:"+price/2);
	}
	else {
		System.out.println("Tiket price is:"+price);
	}
}
}