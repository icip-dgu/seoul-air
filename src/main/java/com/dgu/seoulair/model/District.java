package com.dgu.seoulair.model;

public class District {
    public String MSRDATE;
    private String MSRADMCODE;
    private String MSRSTENAME;
    private String MAXINDEX;
    private String GRADE;
    private String POLLUTANT;
    private String NITROGEN;
    private String OZONE;
    private String CARBON;
    private String SULFUROUS;
    private String PM10;
    private String PM20;

    public District(String MSRDATE, String MSRADMCODE, String MSRSTENAME, String MAXINDEX,
                    String GRADE, String POLLUTANT, String NITROGEN, String OZONE, String CARBON, String SULFUROUS, String PM10, String PM20) {
        this.MSRDATE = MSRDATE;
        this.MSRADMCODE = MSRADMCODE;
        this.MSRSTENAME = MSRSTENAME;
        this.MAXINDEX = MAXINDEX;
        this.GRADE = GRADE;
        this.POLLUTANT = POLLUTANT;
        this.NITROGEN = NITROGEN;
        this.OZONE = OZONE;
        this.CARBON = CARBON;
        this.SULFUROUS = SULFUROUS;
        this.PM10 = PM10;
        this.PM20 = PM20;
    }

    public String getMSRDATE() {
        return MSRDATE;
    }

    public void setMSRDATE(String MSRDATE) {
        this.MSRDATE = MSRDATE;
    }

    public String getMSRADMCODE() {
        return MSRADMCODE;
    }

    public void setMSRADMCODE(String MSRADMCODE) {
        this.MSRADMCODE = MSRADMCODE;
    }

    public String getMSRSTENAME() {
        return MSRSTENAME;
    }

    public void setMSRSTENAME(String MSRSTENAME) {
        this.MSRSTENAME = MSRSTENAME;
    }

    public String getMAXINDEX() {
        return MAXINDEX;
    }

    public void setMAXINDEX(String MAXINDEX) {
        this.MAXINDEX = MAXINDEX;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public String getPOLLUTANT() {
        return POLLUTANT;
    }

    public void setPOLLUTANT(String POLLUTANT) {
        this.POLLUTANT = POLLUTANT;
    }

    public String getNITROGEN() {
        return NITROGEN;
    }

    public void setNITROGEN(String NITROGEN) {
        this.NITROGEN = NITROGEN;
    }

    public String getOZONE() {
        return OZONE;
    }

    public void setOZONE(String OZONE) {
        this.OZONE = OZONE;
    }

    public String getCARBON() {
        return CARBON;
    }

    public void setCARBON(String CARBON) {
        this.CARBON = CARBON;
    }

    public String getSULFUROUS() {
        return SULFUROUS;
    }

    public void setSULFUROUS(String SULFUROUS) {
        this.SULFUROUS = SULFUROUS;
    }

    public String getPM10() {
        return PM10;
    }

    public void setPM10(String PM10) {
        this.PM10 = PM10;
    }

    public String getPM20() {
        return PM20;
    }

    public void setPM20(String PM20) {
        this.PM20 = PM20;
    }

    @Override
    public String toString() {
        return "District{" +
                "MSRDATE='" + MSRDATE + '\'' +
                ", MSRADMCODE='" + MSRADMCODE + '\'' +
                ", MSRSTENAME='" + MSRSTENAME + '\'' +
                ", MAXINDEX='" + MAXINDEX + '\'' +
                ", GRADE='" + GRADE + '\'' +
                ", POLLUTANT='" + POLLUTANT + '\'' +
                ", NITROGEN='" + NITROGEN + '\'' +
                ", OZONE='" + OZONE + '\'' +
                ", CARBON='" + CARBON + '\'' +
                ", SULFUROUS='" + SULFUROUS + '\'' +
                ", PM10='" + PM10 + '\'' +
                ", PM20='" + PM20 + '\'' +
                '}';
    }
}
