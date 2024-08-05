package com.bopipi.aidada.config;

import com.zhipu.oapi.ClientV4;
import lombok.Data;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bopipi
 * @date 2024-08-02
 */
@Configuration
@ConfigurationProperties(prefix = "ai")
@Data
public class AiConfig {

    private String key;

    @Bean
    public ClientV4 getClientV4() {
        return new ClientV4.Builder(key).build();
    }

}
