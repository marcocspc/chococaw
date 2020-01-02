/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.File;

/**
 *
 * @author MarcoAntonio
 */
public class Nupkg {
    private File dir;
    private File nupkg;

    public Nupkg() {
    }

    public Nupkg(File dir, File nupkg) {
        this.dir = dir;
        this.nupkg = nupkg;
    }
    

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    public File getNupkg() {
        return nupkg;
    }

    public void setNupkg(File nupkg) {
        this.nupkg = nupkg;
    }
    
    
}
