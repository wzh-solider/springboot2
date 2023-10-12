package com.atguigu.boot.indicator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义Health监控指标
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 16:38
 * @since 1.0
 */
@Component
public class MyHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder)
            throws Exception {
        Map<String, Object> map = new HashMap<>();

        if (true) {
            // builder.up(); // 健康
            builder.status(Status.UP);
            map.put("count", 1);
            map.put("ms", 100);
        } else {
            // builder.down(); // 不健康
            builder.status(Status.OUT_OF_SERVICE);
            map.put("msg", "连接超时");
            map.put("errCode", "404");
        }

        // 详细信息
        builder.withDetail("code", 1)
                .withDetails(map);
    }
}
