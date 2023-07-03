package Study1.beanFactory;

import Study1.Dao.BeanFactoryDao;

public class StaticBeanFactory {
    public static BeanFactoryDao setStaticBeanFactory() {
        System.out.println("静态工厂方式创建 bean...");
        return new BeanFactoryDao();
    }
}
