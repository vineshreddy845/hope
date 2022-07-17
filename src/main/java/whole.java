import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class whole {
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        family num = context.getBean("fam",family.class);
        num.sur();
    }
}
