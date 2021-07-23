import DigitalTwin.Service.DemoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {


    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    DemoService demoService = (DemoService) context.getBean("DemoService");

    @Test
    public void test(){
        System.out.println(demoService.queryDataByIndex(1));
    }

}
