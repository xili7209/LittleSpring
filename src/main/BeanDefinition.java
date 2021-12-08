package main;

import test.bean.UserService;

/**
 * @description:
 * @author：lee
 * @date: 2021/12/8
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
