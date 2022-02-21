import java.time.*;
import java.util.*;

public class Strings3_7 {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2020,9,16);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.println(diff.getYears());
	 System.out.println(diff.getMonths());
	System.out.println(diff.getDays());	
  }
}
