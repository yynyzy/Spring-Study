package Study1.test;

import Study1.Dao.BeanFactoryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class applictaionContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactoryDao beanFactoryDao = (BeanFactoryDao) applicationContext.getBean("beanFactoryDao");
    }
}
