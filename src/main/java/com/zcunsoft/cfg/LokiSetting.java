package com.zcunsoft.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("loki")
@Data
public class LokiSetting {
    private String url;
    private String username;
    private String password;

    public boolean isEnabled() {
        return url != null && username != null && password != null && !url.isEmpty() && !username.isEmpty() && !password.isEmpty();
    }
}
