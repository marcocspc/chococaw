/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationalSystemFrontend;

import java.io.File;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;

/**
 *
 * @author MarcoAntonio
 */
public class ZipDealer extends FileDealer {
    
    public ZipDealer(File f) {
        super(f);
    }
    
    public void unzip(String destinationDir) {
        try {
            ZipFile zipFile = new ZipFile(super.f.getPath());
            zipFile.extractAll(destinationDir);
        } catch (ZipException e) {
            System.err.println("Error! " + e.getMessage());
        }
    }

    
}
