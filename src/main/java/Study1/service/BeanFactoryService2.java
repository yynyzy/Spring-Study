package Study1.service;

import Study1.Dao.BeanFactoryDao;

import java.util.List;

public class BeanFactoryService2{

    private String name;
    private BeanFactoryDao bean4;
    private List<BeanFactoryDao> beanFactoryDaoList;
    private List<?> beanFactoryDaoList2;

    public void setBean4(BeanFactoryDao bean4) {
        this.bean4 = bean4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeanFactoryDaoList(List<BeanFactoryDao> beanFactoryDaoList) {
        this.beanFactoryDaoList = beanFactoryDaoList;
    }

    public void setBeanFactoryDaoList2(List<?> beanFactoryDaoList2) {
        this.beanFactoryDaoList2 = beanFactoryDaoList2;
    }

    public void onShow() {
        System.out.println(name);
        System.out.println(bean4);
        System.out.println(beanFactoryDaoList);
        System.out.println(beanFactoryDaoList2);
    }
}
