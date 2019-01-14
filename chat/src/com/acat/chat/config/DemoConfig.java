package com.acat.chat.config;

import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

/**
 * ServerApplicationConfig这个接口的实现类，会在项目启动时自动执行
 * @author rocky
 *
 */

public class DemoConfig implements ServerApplicationConfig{

	/*注解方式的启动*/
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scaned) {
		System.out.println("Config......"+scaned.size());
		return scaned;
	}

	/*接口方式得启动*/
	public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
