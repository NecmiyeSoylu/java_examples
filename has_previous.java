import java.util.*;
public class has_previous 
{
    public static void main(String[] Soylu)
    {
        ArrayList<String> list=new ArrayList<>();
        
        list.add("sheggy");
        list.add("velma");
        list.add("scooby");

        ListIterator <String> itr=list.listIterator(3);// içine index yazdığımızda bu indexteki elemana gider direkt
        
        System.out.println(itr.previousIndex());

        while(itr.hasPrevious())
            System.out.println(itr.previous());
        
        System.out.print(itr.nextIndex());
    }    
}
/* Output
    2
    scooby
    velma
    sheggy
    0 
*/
