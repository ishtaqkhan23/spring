package com.smart.hospital.model;

public class DBConfig {
    private String url;
    private String userName;
    private String password;

    public DBConfig(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
