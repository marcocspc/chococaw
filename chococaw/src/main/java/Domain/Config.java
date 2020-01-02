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

	public static String DEFAULT_EXAMPLE_TEXT_ID = "onlylowercaseallowed";
	public static String DEFAULT_EXAMPLE_TEXT_TITLE = "Example Title";
	public static String DEFAULT_EXAMPLE_TEXT_VERSION = "1.0";
	public static String DEFAULT_EXAMPLE_TEXT_AUTHORS = "Example Author";
	public static String DEFAULT_EXAMPLE_TEXT_OWNERS = "Example Owner";
	public static String DEFAULT_EXAMPLE_TEXT_SUMMARY = "A very long summary could be inserted.";
	public static String DEFAULT_EXAMPLE_TEXT_PROJECT_URL = "https://chocolatey.org/";
	public static String DEFAULT_EXAMPLE_TEXT_LICENSE_URL = "https://raw.githubusercontent.com/marcocspc/chococaw/master/LICENSE";
	public static String DEFAULT_EXAMPLE_TEXT_ICON_URL = "https://raw.githubusercontent.com/marcocspc/chococaw/master/LICENSE";
	public static String DEFAULT_EXAMPLE_TEXT_TAGS = "Tag1 Tag2 Tag3";
	public static String DEFAULT_EXAMPLE_TEXT_DEPENDENCIES = "Dependencies";
	public static String DEFAULT_EXAMPLE_TEXT_INSTALLER_TYPE = "exe";
	public static String DEFAULT_EXAMPLE_TEXT_UNATTENDED_ARGUMENTS = "/S";
	public static String DEFAULT_EXAMPLE_TEXT_INTALLER_X86 = "32-bit Installer";
	public static String DEFAULT_EXAMPLE_TEXT_INTALLER_X64 = "64-bit Installer";

	private static final String DEFAULT_FTP_SERVER_URL = "foo.example.com";
	private static final String DEFAULT_FTP_USER = "foo";
	private static final String DEFAULT_FTP_PASS = "foo123";
	private static final String DEFAULT_FTP_PACKAGES_PATH = "packages/";
	private static final String DEFAULT_FTP_EXECUTABLES_PATH = "exec/";
	private static final String DEFAULT_HTTP_SERVER_URL = DEFAULT_FTP_SERVER_URL;
	private static final String DEFAULT_HTTP_PACKAGES_PATH = DEFAULT_FTP_PACKAGES_PATH;

	private String ftpServerURL;
	private String ftpUser;
	private String ftpPass;
	private String ftpPackagesPath;
	private String ftpExecutablesPath;
	private String httpServerURL;
	private String httpPackagesPath;

	public Config() {
		this.ftpServerURL = DEFAULT_FTP_SERVER_URL;
		this.ftpUser = DEFAULT_FTP_USER;
		this.ftpPass = DEFAULT_FTP_PASS;
		this.ftpPackagesPath = DEFAULT_HTTP_PACKAGES_PATH;
		this.ftpExecutablesPath = DEFAULT_FTP_EXECUTABLES_PATH;
		this.httpServerURL = DEFAULT_HTTP_SERVER_URL;
		this.httpPackagesPath = DEFAULT_HTTP_PACKAGES_PATH;
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
