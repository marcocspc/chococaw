/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerFrontend;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;

/**
 *
 * @author marcocspc
 */
public class FTPConnection {
    
    private FTPClient ftp;

    public FTPConnection(String user, String pass, String serverURL) throws IOException {
        ftp = new FTPClient();
        ftp.connect(serverURL);
        ftp.login(user, pass);
    }

    public FTPClient getFtp() {
        return ftp;
    }

    public void setFtp(FTPClient ftp) {
        this.ftp = ftp;
    }
    
}
