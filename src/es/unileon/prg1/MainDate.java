package es.unileon.prg1;
public class MainDate{
    public static void main(String args[])throws DateException{
        Date today,tomorrow;
        today= new Date(4,4,2016);
        tomorrow = new Date(5,4,2016);
        today.isSame(tomorrow);
        System.out.println(today.getMonthName());
        System.out.println(today.getSeasonName());
	System.out.println(today.getRestOfMonths());
	System.out.println(today.correctDay());
    }
}
