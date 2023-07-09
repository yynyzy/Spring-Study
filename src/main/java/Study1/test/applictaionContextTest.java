package Study1.test;

import Study1.Dao.BeanFactoryDao;
import Study1.service.BeanFactoryService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class applictaionContextTest {
    public static void main(String[] args) {

        // 指定环境
//        System.setProperty("spring.profiles.active", "dev");


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

         // 配置bean （含有基本类型，引用类型，集合类型属性）
//        BeanFactoryService2 beanFactoryService2= (BeanFactoryService2)applicationContext.getBean("beanFactoryService2");
//        beanFactoryService2.onShow();
//        System.out.println(beanFactoryService2);

        // beans 的 profile(可以用于区分 dev 和 testing 不同 profile 的bean设置)

//        BeanFactoryDao profileDevBean= (BeanFactoryDao)applicationContext.getBean("profileDevBean");
//        System.out.println(profileDevBean);


        // import 标签引入其他 xml bean 配置
//        BeanFactoryDao importTestBean= (BeanFactoryDao)applicationContext.getBean("import-test");

        // 别名
        BeanFactoryDao aaa= (BeanFactoryDao)applicationContext.getBean("aaa");
        System.out.println(aaa);
    }
}
