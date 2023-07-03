package Study1.factory;

import Study1.Dao.BeanFactoryDao;

public class BeanFactory2 {
    public BeanFactoryDao setBeanFactoryDao() {
        System.out.println("实例工厂方式创建 bean ...");
        return new BeanFactoryDao();
    }
}
