package Study1.test;

import Study1.Dao.BeanFactoryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class applictaionContextTest {
    public static void main(String[] args) {
//        Spring 容器触发销毁需要使用 ClassPathXmlApplicationContext 类接受使用close()
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactoryDao beanFactoryDao = (BeanFactoryDao) applicationContext.getBean("beanFactoryDao");
        System.out.println(beanFactoryDao);
        applicationContext.close();
    }
}
