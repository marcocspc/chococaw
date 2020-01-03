/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author MarcoAntonio
 */
public class Nupkg {

	private File dir;
	private File nupkg;

	private Nuspec nuspec;
	private ChocolateyInstall chocolateyInstall;

	public Nupkg() {
		this.chocolateyInstall = new ChocolateyInstall("", "", "", "", "");
		this.nuspec = new Nuspec("", "", "", "", "", "", "", "", "", "", false, "", "", new ArrayList());
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

	public Nuspec getNuspec() {
		return nuspec;
	}

	public void setNuspec(Nuspec nuspec) {
		this.nuspec = nuspec;
	}

	public ChocolateyInstall getChocolateyInstall() {
		return chocolateyInstall;
	}

	public void setChocolateyInstall(ChocolateyInstall chocolateyInstall) {
		this.chocolateyInstall = chocolateyInstall;
	}

}
