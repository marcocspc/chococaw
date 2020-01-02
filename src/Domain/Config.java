/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author marcocspc
 */
public class Config {
    
    private static final String defaultFTPServerURL = "foo.example.com";
    private static final String defaultFTPUser = "foo";
    private static final String defaultFTPPass = "foo123";
    private static final String defaultFTPPackagesPath = "packages/";
    private static final String defaultFTPExecutablesPath = "exec/";
    private static final String defaultHTTPServerURL = defaultFTPServerURL;
    private static final String defaultHTTPPackagesPath = defaultFTPPackagesPath;
    
    private String ftpServerURL;
    private String ftpUser;
    private String ftpPass;
    private String ftpPackagesPath;
    private String ftpExecutablesPath;
    private String httpServerURL;
    private String httpPackagesPath;

    public Config(){
        this.ftpServerURL = defaultFTPServerURL;
        this.ftpUser = defaultFTPUser;
        this.ftpPass = defaultFTPPass;
        this.ftpPackagesPath = defaultHTTPPackagesPath;
        this.ftpExecutablesPath = defaultFTPExecutablesPath;
        this.httpServerURL = defaultHTTPServerURL;
        this.httpPackagesPath = defaultHTTPPackagesPath;
    }

    public String getFtpServerURL() {
        return ftpServerURL;
    }

    public void setFtpServerURL(String ftpServerURL) {
        this.ftpServerURL = ftpServerURL;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public String getFtpPass() {
        return ftpPass;
    }

    public void setFtpPass(String ftpPass) {
        this.ftpPass = ftpPass;
    }

    public String getFtpPackagesPath() {
        return ftpPackagesPath;
    }

    public void setFtpPackagesPath(String ftpPackagesPath) {
        this.ftpPackagesPath = ftpPackagesPath;
    }

    public String getFtpExecutablesPath() {
        return ftpExecutablesPath;
    }

    public void setFtpExecutablesPath(String ftpExecutablesPath) {
        this.ftpExecutablesPath = ftpExecutablesPath;
    }

    public String getHttpServerURL() {
        return httpServerURL;
    }

    public void setHttpServerURL(String httpServerURL) {
        this.httpServerURL = httpServerURL;
    }

    public String getHttpPackagesPath() {
        return httpPackagesPath;
    }

    public void setHttpPackagesPath(String httpPackagesPath) {
        this.httpPackagesPath = httpPackagesPath;
    }
    
    
    
    
    
    
    
}
