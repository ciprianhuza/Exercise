
public class MaximDigit{
public static void main(String[]args){
    int getGreatestDigit(int num , int greater);
    if(num != 0){
        if(num %10 > greater){
           greater = num%10;
           num = num/10;
           return getGreatestDigit(num , greater);
        }else{
           num = num/10;
           return getGreatestDigit(num , greater);
        }
    }
    return greater;
}
}