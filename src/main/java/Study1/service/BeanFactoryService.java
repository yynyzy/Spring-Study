package Study1.service;

import Study1.Dao.BeanFactoryDao;

public class BeanFactoryService{
    private BeanFactoryDao beanFactoryDao;

    public void init() {
        System.out.println("初始化");
    }
    public void destroy() {
        System.out.println("销毁化");
    }

    public void setBeanFactoryDao(BeanFactoryDao beanFactoryDao) {
        this.beanFactoryDao = beanFactoryDao;
        System.out.println("BeanFactory 调用方法设置 beanFactoryDao" + beanFactoryDao);
    }
}
