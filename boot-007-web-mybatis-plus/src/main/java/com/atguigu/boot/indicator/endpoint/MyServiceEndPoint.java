package com.atguigu.boot.indicator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * 自定义端点
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 17:30
 * @since 1.0
 */
@Component
@Endpoint(id = "myservice")
public class MyServiceEndPoint {

    @ReadOperation
    public Map<String, String> getDockerInfo() {
        return Collections.singletonMap("docker", "docker start...");
    }

    @WriteOperation
    public void stopDocker() {
        System.out.println("docker stop...");
    }
}
