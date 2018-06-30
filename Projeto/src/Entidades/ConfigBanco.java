package Entidades;

import java.io.Serializable;

public class ConfigBanco implements Serializable{

    private String driverName;

    private String serverName;

    private String mydatabase;

    private String url;

    private String username;

    private String password;

    public ConfigBanco(String driverName, String serverName, String mydatabase, String url, String username, String password) {
        this.driverName = driverName;
        this.serverName = serverName;
        this.mydatabase = mydatabase;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public ConfigBanco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getMydatabase() {
        return mydatabase;
    }

    public void setMydatabase(String mydatabase) {
        this.mydatabase = mydatabase;
    }

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

}
