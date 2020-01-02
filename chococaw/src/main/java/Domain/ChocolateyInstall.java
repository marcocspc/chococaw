/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import OperationalSystemFrontend.FileDealer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author MarcoAntonio
 */
public class ChocolateyInstall {

    private String packageId;
    private String installerType;
    private String unattendedArgs;
    private String url;
    private String url64;
    private String textoGerado;
    private boolean madeOfCacau;

    public ChocolateyInstall() {
    }

    public ChocolateyInstall(String packageId, String installerType, String unattendedArgs, String url) {
        this.packageId = packageId;
        this.installerType = installerType;
        this.unattendedArgs = unattendedArgs;
        this.url = url;
    }

    public ChocolateyInstall(String packageId, String installerType, String unattendedArgs, String url, String url64) {
        this.packageId = packageId;
        this.installerType = installerType;
        this.unattendedArgs = unattendedArgs;
        this.url = url;
        this.url64 = url64;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getInstallerType() {
        return installerType;
    }

    public void setInstallerType(String installerType) {
        this.installerType = installerType;
    }

    public String getUnattendedArgs() {
        return unattendedArgs;
    }

    public void setUnattendedArgs(String unattendedArgs) {
        this.unattendedArgs = unattendedArgs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl64() {
        return url64;
    }

    public void setUrl64(String url64) {
        this.url64 = url64;
    }

    public String getTextoGerado() {
        return textoGerado;
    }

    public void setTextoGerado(String textoGerado) {
        this.textoGerado = textoGerado;
    }

    public boolean isMadeOfCacau() {
        return madeOfCacau;
    }

    public void setMadeOfCacau(boolean madeOfCacau) {
        this.madeOfCacau = madeOfCacau;
    }
    
    

    public void generateText() {
        String texto = "#madeofcacau\n"
                + "$packageId = '" + packageId + "'\n"
                + "$installerType = '" + installerType + "'\n"
                + "$unattendedArgs = '" + unattendedArgs + "'\n"
                + "$url = '" + url + "'\n";

        if (url64 != null && !(url64.equals(""))) {
            texto += "$url64 = '" + url64 + "'\n\n";
        } else {
            texto += "$url64 = '" + url + "'\n\n";
        }

        texto += "Install-ChocolateyPackage $packageId $installerType $unattendedArgs $url $url64";
        textoGerado = texto;
    }

    public void applyFromFile(File chocolateyInstall) throws IOException {
        FileDealer fd = new FileDealer(chocolateyInstall);
        ArrayList<String> text = fd.read();
        String data;
        String tag;

        for (String line : text) {
            
            System.out.println("Line: " + line);
            
            tag = "Install-ChocolateyPackage";
            if (line.contains(tag)) {
                break;
            }
            
            tag = "packageId";
            if (line.contains(tag)) {
                int i = line.indexOf("$" + tag) + tag.length() + 5;
                data = line.substring(i);
                int i1 = data.length() - 1;
                data = data.substring(0, i1);
                 
                //System.out.println("Data: " + data);
                
                this.packageId = data;
            }
            
            tag = "installerType";
            if (line.contains(tag)) {
                int i = line.indexOf("$" + tag) + tag.length() + 5;
                data = line.substring(i);
                int i1 = data.length() - 1;
                data = data.substring(0, i1);
                
                //System.out.println("Data: " + data);
                
                this.installerType = data;
            }
            
            tag = "unattendedArgs";
            if (line.contains(tag)) {
                int i = line.indexOf("$" + tag) + tag.length() + 5;
                data = line.substring(i);
                int i1 = data.length() - 1;
                data = data.substring(0, i1);
                
                //System.out.println("Data: " + data);
                
                this.unattendedArgs = data;
            }

            tag = "url";
            if (line.contains(tag)) {
                int i = line.indexOf("$" + tag) + tag.length() + 7;
                data = line.substring(i);
                int i1 = data.length();
                data = data.substring(0, i1 - 1);
                
                //System.out.println("Data: " + data);
                
                this.url = data;
            }
            
            tag = "url64";
            if (line.contains(tag)) {
                int i = line.indexOf("$" + tag) + tag.length() + 5;
                data = line.substring(i);
                int i1 = data.length();
                data = data.substring(0, i1 - 1);
                
                //System.out.println("Data: " + data);
                
                this.url64 = data;
            }
            
            tag = "#madeofcacau";
            if (line.contains(tag)) {
                madeOfCacau = line.contains(tag);
                System.out.println(line);
            }
            
            
        }
    }
}
