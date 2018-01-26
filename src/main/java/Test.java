import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Date());
        TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");TimeZone.setDefault(tz);
        System.out.println(tz);
        Properties props=System.getProperties();
        Iterator iter=props.keySet().iterator();
        while(iter.hasNext())
        {
            String key=(String)iter.next();
            System.out.println(key+" = "+ props.get(key));
        }
    }
}
