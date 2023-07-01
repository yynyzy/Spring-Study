package Study1.test;

import Study1.Dao.BeanFactoryDao;
import Study1.service.BeanFactoryService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class beanFactoryTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        reader.loadBeanDefinitions("beans.xml");
        BeanFactoryService beanFactoryService = (BeanFactoryService) defaultListableBeanFactory.getBean("beanFactoryService");
//        System.out.println(beanFactoryService);
        BeanFactoryDao beanFactoryDao = (BeanFactoryDao) defaultListableBeanFactory.getBean("beanFactoryDao");
//        System.out.println(beanFactoryDao);
    }
}
