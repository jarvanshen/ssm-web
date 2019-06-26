package com.test.web.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import util.AESEncryptUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static Map<String, String> ctxPropMap = new HashMap<String, String>();

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {

        String salt = props.getProperty("webtest.private.material");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");
        String user = AESEncryptUtil.decrypt(username,salt);
        String pwd = AESEncryptUtil.decrypt(password,salt);

        props.setProperty("db.username",user);
        props.setProperty("db.password",pwd);

        AESEncryptUtil.decrypt(password,salt);
        for (Object key : props.keySet()) {
            props.getProperty("");
            String keyStr = key.toString();
            String value = String.valueOf(props.get(keyStr));
            ctxPropMap.put(keyStr, value);
        }
        super.processProperties(beanFactoryToProcess, props);
    }


    public static Map<String, String> getCtxPropMap() {
        return ctxPropMap;
    }




}
