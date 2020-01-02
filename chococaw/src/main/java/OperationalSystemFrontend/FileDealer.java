/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationalSystemFrontend;

import Domain.ChocolateyInstall;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/**
 *
 * @author marcocspc
 */
public class FileDealer {

protected File f;

    public FileDealer(File f) {
        this.f = f;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public void saveText(String s) throws IOException {

        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(f.getPath()), "UTF-8"));
        try {
            out.write(s);
        } finally {
            out.close();
        }
    }

    public void copy(File destination)
            throws IOException {
        if (!this.f.exists()) {
            return;
        }
        if (!destination.exists()) {
            destination.createNewFile();
        }
        FileChannel source = null;
        FileChannel destChannel = null;
        source = new FileInputStream(this.f).getChannel();
        destChannel = new FileOutputStream(destination).getChannel();
        if (destChannel != null && source != null) {
            destChannel.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destChannel != null) {
            destChannel.close();
        }
    }

    public void delete() throws IOException {
        if (!this.f.isDirectory()) {
            f.delete();
        } else {
            throw new IOException("File is a directory!");
        }
    }

    public void rmdir() throws IOException {
        if (this.f.isDirectory()) {
            if (!(f.listFiles().length > 0)) {
                f.delete();
            } else {
                throw new IOException("Directory not empty!");
            }
        } else {
            throw new IOException("This is not a directory!");
        }
    }

    public void forceRmdir() throws IOException {
        if (this.f.isDirectory()) {
            FileDealer fd;
            for (File faux : f.listFiles()) {
                fd = new FileDealer(faux);
                if (faux.isDirectory()) {
                    fd.forceRmdir();
                } else {
                    fd.delete();
                }
            }
        } else {
            throw new IOException("This is not a directory!");
        }
    }

    public ArrayList read() throws IOException {
        ArrayList text = new ArrayList();
        FileInputStream fis = new FileInputStream(f);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            text.add(line);
        }

        br.close();

        return text;
    }

    public static String getCurrentPath () throws UnsupportedEncodingException {
        String path = (new ChocolateyInstall()).getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        
        path = URLDecoder.decode(path, "utf-8");
        
        path = path.substring(0, path.lastIndexOf("/"));
        return path;
    }
}
