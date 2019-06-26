package com.test.web.init;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

public class WebtestContextListener extends ContextLoaderListener {

    public void contextInitialized(ServletContextEvent event) {

//        WebtestPropertiesConfigure.loadProps();

    }

    public void contextDestroyed(ServletContextEvent event) {

    }
}
