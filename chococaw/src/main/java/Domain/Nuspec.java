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

/**
 *
 * @author MarcoAntonio
 */
public class Nuspec {

    private String id;
    private String title;
    private String version;
    private String authors;
    private String owners;
    private String summary;
    private String description;
    private String projectURL;
    private String tags;
    private String licenseURL;
    private boolean requireLicenseAcceptance;
    private String iconURL;
    private String textoFormado;
    private ArrayList dependencies;

    public Nuspec() {
    }

    public Nuspec(String id, String version) {
        this.id = id;
        this.version = version;
    }

    public Nuspec(String id, String title, String version, String authors, String owners, String summary, String description, String projectURL, String tags, String licenseURL, boolean requireLicenseAcceptance, String iconURL) {
        this.id = id;
        this.title = title;
        this.version = version;
        this.authors = authors;
        this.owners = owners;
        this.summary = summary;
        this.description = description;
        this.projectURL = projectURL;
        this.tags = tags;
        this.licenseURL = licenseURL;
        this.requireLicenseAcceptance = requireLicenseAcceptance;
        this.iconURL = iconURL;
    }

    public Nuspec(String id, String title, String version, String authors, String owners, String summary, String description, String projectURL, String tags, String licenseURL, boolean requireLicenseAcceptance, String iconURL, String textoFormado, ArrayList dependencies) {
        this.id = id;
        this.title = title;
        this.version = version;
        this.authors = authors;
        this.owners = owners;
        this.summary = summary;
        this.description = description;
        this.projectURL = projectURL;
        this.tags = tags;
        this.licenseURL = licenseURL;
        this.requireLicenseAcceptance = requireLicenseAcceptance;
        this.iconURL = iconURL;
        this.textoFormado = textoFormado;
        this.dependencies = dependencies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public void setProjectURL(String projectURL) {
        this.projectURL = projectURL;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLicenseURL() {
        return licenseURL;
    }

    public void setLicenseURL(String licenseURL) {
        this.licenseURL = licenseURL;
    }

    public boolean isRequireLicenseAcceptance() {
        return requireLicenseAcceptance;
    }

    public void setRequireLicenseAcceptance(boolean requireLicenseAcceptance) {
        this.requireLicenseAcceptance = requireLicenseAcceptance;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getTextoFormado() {
        return textoFormado;
    }

    public ArrayList getDependencies() {
        return dependencies;
    }

    public void setDependencies(ArrayList dependencies) {
        this.dependencies = dependencies;
    }

    public void generateXML() {
        String texto = "<?xml version=\"1.0\"?>\n"
                + "<package xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n"
                + "  <metadata>\n"
                + "    <id>" + id + "</id>\n"
                + "    <title>" + title + "</title>\n"
                + "    <version>" + version + "</version>\n"
                + "    <authors>" + authors + "</authors>\n"
                + "    <owners>" + owners + "</owners>\n"
                + "    <summary>" + summary + "</summary>\n"
                + "    <description>" + description + "</description>\n"
                + "    <projectUrl>" + projectURL + "</projectUrl>\n"
                + "    <tags>" + tags + "</tags>\n"
                + "    <licenseUrl>" + licenseURL + "</licenseUrl>\n"
                + "    <requireLicenseAcceptance>" + requireLicenseAcceptance + "</requireLicenseAcceptance>\n"
                + "    <iconUrl>" + iconURL + "</iconUrl>\n"
                + "    <dependencies>\n";

        if (dependencies != null) {
            for (int x = 0; x < dependencies.size(); x++) {
                texto += "      <dependency id=\"" + dependencies.get(x).toString() + "\" />\n"; //não é obrigatório que as dependências tenham a versão listada
            }
        }

        texto += "    </dependencies>\n"
                + "  </metadata>\n"
                + "</package>";

        textoFormado = texto;

        //TODO adicao de dependencias
    }

    public void applyFromFile(File nuspec) throws IOException {
        FileDealer fd = new FileDealer(nuspec);
        ArrayList<String> text = fd.read();
        String data;
        String tag;

        this.dependencies = new ArrayList();

        for (String line : text) {
            //System.out.println("Linha atual: " + line);

            tag = "id";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.id = data;
            }

            tag = "title";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);

                this.title = data;
            }

            tag = "version";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.version = data;
            }

            tag = "authors";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.authors = data;
            }

            tag = "owners";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.owners = data;
            }

            tag = "summary";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.summary = data;
            }

            tag = "description";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.description = data;
            }

            tag = "projectUrl";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.projectURL = data;
            }

            tag = "tags";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.tags = data;
            }

            tag = "licenseUrl";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.licenseURL = data;
            }

            tag = "requireLicenseAcceptance";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                if (data.equals("true")) {
                    this.requireLicenseAcceptance = true;
                } else {
                    this.requireLicenseAcceptance = false;
                }
            }

            tag = "iconUrl";
            if (line.contains("<" + tag + ">")) {
                int i = line.indexOf("<" + tag + ">") + tag.length() + 2;
                int i1 = line.indexOf("</" + tag + ">");
                data = line.substring(i, i1);
                ////System.out.println("Data: " + data);
                this.iconURL = data;
            }

            tag = "dependency";
            if (line.contains(tag)) {
                int i = line.indexOf("id") + 4;
                data = line.substring(i);
                int i1 = data.indexOf("\"");
                data = data.substring(0, i1);
                //System.out.println("Data: " + data);
                this.dependencies.add(data);
            }

        }

    }

}
