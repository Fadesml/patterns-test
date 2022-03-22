package ru.fadesml.patterns.factory_proxy;

import java.lang.reflect.Proxy;

public class DeveloperProxy {
    @SuppressWarnings("unchecked")
    public static IDeveloper of(IDeveloper developer) {
        return (IDeveloper) Proxy.newProxyInstance(
                DeveloperProxy.class.getClassLoader(),
                new Class[] { IDeveloper.class },
                (proxy, method, args) -> {
                    if (method.getName().equals("toString")) {
                        return "ВЫЗВАН TO STRING У ПРОКСИ: " + developer.toString();
                    } else {
                        return method.invoke(developer, args);
                    }
                });
    }
}
