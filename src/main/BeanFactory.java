package main;

import java.util.HashMap;

/**
 * @description:
 * @author：lee
 * @date: 2021/12/8
 */
public class BeanFactory {
    private HashMap<String, BeanDefinition> beanDefinitionHashMap = new HashMap<>();

    public Object getBean(String name) {
        return beanDefinitionHashMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionHashMap.put(name, beanDefinition);
    }
}
