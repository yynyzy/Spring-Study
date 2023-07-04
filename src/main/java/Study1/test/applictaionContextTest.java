package Study1.test;

import Study1.Dao.BeanFactoryDao;
import Study1.service.BeanFactoryService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class applictaionContextTest {
    public static void main(String[] args) {
//        Spring 容器触发销毁需要使用 ClassPathXmlApplicationContext 类接受使用close()
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BeanFactoryDao beanFactoryDao = (BeanFactoryDao) applicationContext.getBean("beanFactoryDao");
//        System.out.println(beanFactoryDao);
//        applicationContext.close();

// 静态工厂方式创建 bean
//        BeanFactoryDao beanFactoryDao1= (BeanFactoryDao) applicationContext.getBean("beanFactory1");
//        System.out.println(beanFactoryDao1);

// 实例工厂方式创建 bean
//        BeanFactoryDao beanFactoryDao2= (BeanFactoryDao) applicationContext.getBean("beanFactoryDao2");
//        System.out.println(beanFactoryDao2);

        // FactoryBean 方式规范化创建 bean
//        Object beanFactory3= applicationContext.getBean("beanFactory3");
//        System.out.println(beanFactory3);

        BeanFactoryService2 beanFactoryService2= (BeanFactoryService2)applicationContext.getBean("beanFactoryService2");
        beanFactoryService2.onShow();
//        System.out.println(beanFactoryService2);
    }
}
