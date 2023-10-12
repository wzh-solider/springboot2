package com.atguigu.boot.indicator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * 自定义Info监控指标
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 17:17
 * @since 1.0
 */
@Component
public class AppInfoInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app.name", "atguigu-boot")
                .withDetail("app.version", "1.0.0")
                .withDetail("app.author.name", "Solider");
    }
}
