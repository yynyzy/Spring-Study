package Study1.factory;

import Study1.Dao.BeanFactoryDao;
import org.springframework.beans.factory.FactoryBean;

public class FactoryBean3 implements FactoryBean<BeanFactoryDao> {
    @Override
    public BeanFactoryDao getObject() throws Exception {
        System.out.println("FactoryBean 方式规范化创建 bean");
        return new BeanFactoryDao();
    }

    @Override
    public Class<?> getObjectType() {
        return BeanFactoryDao.class;
    }
}
