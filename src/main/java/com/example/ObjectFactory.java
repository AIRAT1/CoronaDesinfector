package com.example;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config;

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
         config = new JavaConfig("com.example", new HashMap<>(Map.of(Policeman.class, AngryPoliceman.class)));
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();
        // todo
        for (Field field : implClass.getDeclaredFields()){
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);
            ClassLoader.getSystemClassLoader().getResource("application.properties")
            if (annotation != null) {
                if (annotation.value().isEmpty()) {

                }
            }
        }
        return t;
    }
}
