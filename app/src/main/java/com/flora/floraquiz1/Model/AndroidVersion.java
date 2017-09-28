package com.flora.floraquiz1.Model;

/**
 * Created by Robertson on 14/09/2017.
 */

public class AndroidVersion {
    int logo;
    String codename, version, api, date;

    public AndroidVersion(int logo, String codename) {
        this.logo = logo;
        this.codename = codename;
       }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }
}
