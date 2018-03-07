public class exempluSwitchCaseBreak{
	public static void main (String [] args){
		String schedule;
		int dayOfWeek = 5;
		switch (dayOfWeek) {
			case 1 : schedule = "rogram de luni" ;
			break;
			case 2 : schedule = "rogram de marti";
			break;
			case 3 : schedule ="Program de miercuri";
			break;
			case 4 : schedule = "Program de joi";
			break;
			case 5 : schedule = "Program de vineri";
			break;
			case 6 : schedule = "Program de sambata";
			break;
			case 7 : schedule = " Program de duminica";
			break;
			default : schedule = "Zi inexistenta";
			break;
		}
		System.out.println(schedule);
	}
}