package sprdemo.SpringShape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello world");
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("bean.xml");
        
        Performer spl=(Performer)springContainer.getBean("kiran");
        spl.perform();
        
    }
}
