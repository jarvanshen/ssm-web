package com.test.web.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class WebtestPropertiesConfigure {

    private static String path = "config/jdbc.properties";

    public static void loadProps() {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
        Properties p = new Properties();
        try {
            p.load(in);
            System.setProperties(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProps(String key1){
        Properties properties = System.getProperties();
        Iterator<Map.Entry<Object, Object>> it = properties.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();

        }
        return null;
    }

    public static void main(String[] args) {
        WebtestPropertiesConfigure w = new WebtestPropertiesConfigure();
        loadProps();
        System.out.println(System.getProperty("username"));
    }
}
