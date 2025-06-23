package com.zcunsoft.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("loki")
public class LokiSetting {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return url != null && username != null && password != null && !url.isEmpty() && !username.isEmpty() && !password.isEmpty();
    }

}
