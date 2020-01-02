/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerFrontend;

import Domain.Config;
import Domain.ConfigFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author marcocspc
 */
public class FTPConnectionFactory {
    
    private static FTPConnection conn = null;
    
    public static FTPConnection getConnection () throws UnsupportedEncodingException, IOException {
        if (conn == null) {
            Config c = ConfigFactory.getConfig();
            conn = new FTPConnection(c.getFtpUser(), c.getFtpPass(), c.getFtpServerURL());
        }
        
        return conn;
    }
}
