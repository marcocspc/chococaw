/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationalSystemFrontend;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author marcocspc
 */
public class ChocolateyDealer {

    private File chocolateyBinDir;

    public ChocolateyDealer() throws Exception {
        if (ChocolateyDealer.isChocolateyInstalled()) {
            this.chocolateyBinDir = new File(System.getenv("ChocolateyInstall"));
        } else {
            throw new IOException("Chocolatey not installed!");
        }
    }

    public static boolean isChocolateyInstalled() {
        return System.getenv("ChocolateyInstall") != null;
    }

    public void pack(File destinationDir, File sourceDir) throws IOException {
        File NugetPackage = null;
        Process p = Runtime.getRuntime().exec("cmd.exe /c start cpack.exe", null, sourceDir);

        int tryAgain = 0;
        int limit = 10;

        while (tryAgain < limit) {
            for (File aux : sourceDir.listFiles()) {
                if (aux.getName().contains("nupkg")) {
                    NugetPackage = aux;
                    tryAgain = limit;
                    break;
                }
            }

            if (NugetPackage == null) {
                try {
                    Thread.sleep(2000); //miliseconds
                    tryAgain++;
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        FileDealer fd = new FileDealer(sourceDir);
        if (NugetPackage != null) {
            destinationDir = new File(destinationDir.getPath() + "\\" + NugetPackage.getName());
            fd.setF(NugetPackage);
            fd.copy(destinationDir);
        } else {
            fd.forceRmdir();
        }
        fd.forceRmdir();

    }
}
