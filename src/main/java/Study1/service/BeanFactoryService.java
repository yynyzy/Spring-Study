package Study1.service;

import Study1.Dao.BeanFactoryDao;
import org.springframework.beans.factory.InitializingBean;

public class BeanFactoryService implements InitializingBean {
    private BeanFactoryDao beanFactoryDao;

//    public BeanFactoryService() {
//        System.out.println("无参构造器");
//    }

// 构造方式实例化 Bean 分为有参构造和无参构造方法实例化，有参构造实例化 Bean 时，需要注入参数，通过 <constructor-arg> 标签注入。
        public BeanFactoryService(String name) {
        System.out.println("有参构造器");
    }
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

    @Override
    public void afterPropertiesSet() throws Exception {
        // 先于 init-method 配置的方法调用
        System.out.println("InitializingBean 调用");
    }
}
