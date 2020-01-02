/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import OperationalSystemFrontend.FileDealer;
import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author marcocspc
 */
public class ConfigFactory {

    private static Config conf = null;

    public static Config getConfig() throws UnsupportedEncodingException {
        if (conf == null) {

            //Check if config.dat exists in current directory
            File config = new File(FileDealer.getCurrentPath() + File.pathSeparator + "config.dat");
            if (config.exists()) {
                //load config from file
            } else {
                //load config default values
                conf = new Config();
            }
        }

        return conf;
    }

}
