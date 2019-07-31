import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListEg {
        public static void main(String arg[]){
            List list = new ArrayList();
            list.add("first");
            list.add("second");
            list.add("third");
            Iterator iterator = list.iterator(); while(iterator.hasNext()) {
                Object next = iterator.next();
                System.out.println(next);
            }
       }
}
