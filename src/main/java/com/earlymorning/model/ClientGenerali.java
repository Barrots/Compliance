package com.earlymorning.model;

import org.joda.time.DateTime;

/**
 * Created by root on 16/08/16.
 */
public class ClientGenerali {

    private String l_GlobalCompanyKey;
    private String sGUNSNumber;
    private String lDNBCompanyKey;
    private String sCompanyName;
    private String sCompanyAddress1;
    private String sCompanyAddress2;
    private String sCompanyAddress3;
    private String sCompanyTownCity;
    private String sCompanyCounty;
    private String sCompanyStateCode;
    private String sCompanyState;
    private String sCompanyZipPostcode;
    private String sCompanyCountry;
    private String lImmediateParentGlobalCompanyKey;
    private String lUltimateParentGlobalCompanyKey;
    private String lDomesticParentGlobalCompanyKey;
    private String sCompanySICCode;
    private String dtLoaded;
    private String dtUpdated;
    private String bExternalValidationRequested;
    private String bWillNeverBeExternallyValidated;
    private String bAwaitingCleansing;
    private String lCR_CompanyKey;
    private String sSourceSystem;
    private String sExternalKey;
    private String bIsBroker;
    private String bIsInsured;
    private String bIsCedant;
    private String bIsReinsurer;
    private String bIsCandC;
    private String bIsGEB;
    private String bIsEA;
    private String bIsEAGCS;
    private String bIsEAIBD;
    private String bIsAgency;
    private String bDoNotSendToCRM;
    private String sSearchAddress;
    private String sUpdateBy;
    private String sDomesticParentGUNSNumber;
    private String sDomesticParentName;
    private String sUltimateParentGUNSNumber;
    private String sUltimateParentName;


    public ClientGenerali(String rowOfFile, String splitRegex){
        String[] rowSplitted= rowOfFile.split(splitRegex, 42);

        this.l_GlobalCompanyKey = rowSplitted[0];
        this.sGUNSNumber = rowSplitted[1];
        this.lDNBCompanyKey = rowSplitted[2];
        this.sCompanyName = rowSplitted[3];
        this.sCompanyAddress1 = rowSplitted[4];
        this.sCompanyAddress2 = rowSplitted[5];
        this.sCompanyAddress3 = rowSplitted[6];
        this.sCompanyTownCity = rowSplitted[7];
        this.sCompanyCounty = rowSplitted[8];
        this.sCompanyStateCode = rowSplitted[9];
        this.sCompanyState = rowSplitted[10];
        this.sCompanyZipPostcode = rowSplitted[11];
        this.sCompanyCountry = rowSplitted[12];
        this.lImmediateParentGlobalCompanyKey = rowSplitted[13];
        this.lUltimateParentGlobalCompanyKey = rowSplitted[14];
        this.lDomesticParentGlobalCompanyKey = rowSplitted[15];
        this.sCompanySICCode = rowSplitted[16];
        this.dtLoaded = rowSplitted[17];
        this.dtUpdated = rowSplitted[18];
        this.bExternalValidationRequested = rowSplitted[19];
        this.bWillNeverBeExternallyValidated = rowSplitted[20];
        this.bAwaitingCleansing = rowSplitted[21];
        this.lCR_CompanyKey = rowSplitted[22];
        this.sSourceSystem = rowSplitted[23];
        this.sExternalKey = rowSplitted[24];
        this.bIsBroker = rowSplitted[25];
        this.bIsInsured = rowSplitted[26];
        this.bIsCedant = rowSplitted[27];
        this.bIsReinsurer = rowSplitted[28];
        this.bIsCandC = rowSplitted[29];
        this.bIsGEB = rowSplitted[30];
        this.bIsEA = rowSplitted[31];
        this.bIsEAGCS = rowSplitted[32];
        this.bIsEAIBD = rowSplitted[33];
        this.bIsAgency = rowSplitted[34];
        this.bDoNotSendToCRM = rowSplitted[35];
        this.sSearchAddress = rowSplitted[36];
        this.sUpdateBy = rowSplitted[37];
        this.sDomesticParentGUNSNumber = rowSplitted[38];
        this.sDomesticParentName = rowSplitted[39];
        this.sUltimateParentGUNSNumber = rowSplitted[40];
        this.sUltimateParentName = rowSplitted[41];
    }

    public ClientGenerali(String l_GlobalCompanyKey, String sGUNSNumber, String lDNBCompanyKey, String sCompanyName, String sCompanyAddress1, String sCompanyAddress2, String sCompanyAddress3, String sCompanyTownCity, String sCompanyCounty, String sCompanyStateCode, String sCompanyState, String sCompanyZipPostcode, String sCompanyCountry, String lImmediateParentGlobalCompanyKey, String lUltimateParentGlobalCompanyKey, String lDomesticParentGlobalCompanyKey, String sCompanySICCode, String dtLoaded, String dtUpdated, String bExternalValidationRequested, String bWillNeverBeExternallyValidated, String bAwaitingCleansing, String lCR_CompanyKey, String sSourceSystem, String sExternalKey, String bIsBroker, String bIsInsured, String bIsCedant, String bIsReinsurer, String bIsCandC, String bIsGEB, String bIsEA, String bIsEAGCS, String bIsEAIBD, String bIsAgency, String bDoNotSendToCRM, String sSearchAddress, String sUpdateBy, String sDomesticParentGUNSNumber, String sDomesticParentName, String sUltimateParentGUNSNumber, String sUltimateParentName) {
        this.l_GlobalCompanyKey = l_GlobalCompanyKey;
        this.sGUNSNumber = sGUNSNumber;
        this.lDNBCompanyKey = lDNBCompanyKey;
        this.sCompanyName = sCompanyName;
        this.sCompanyAddress1 = sCompanyAddress1;
        this.sCompanyAddress2 = sCompanyAddress2;
        this.sCompanyAddress3 = sCompanyAddress3;
        this.sCompanyTownCity = sCompanyTownCity;
        this.sCompanyCounty = sCompanyCounty;
        this.sCompanyStateCode = sCompanyStateCode;
        this.sCompanyState = sCompanyState;
        this.sCompanyZipPostcode = sCompanyZipPostcode;
        this.sCompanyCountry = sCompanyCountry;
        this.lImmediateParentGlobalCompanyKey = lImmediateParentGlobalCompanyKey;
        this.lUltimateParentGlobalCompanyKey = lUltimateParentGlobalCompanyKey;
        this.lDomesticParentGlobalCompanyKey = lDomesticParentGlobalCompanyKey;
        this.sCompanySICCode = sCompanySICCode;
        this.dtLoaded = dtLoaded;
        this.dtUpdated = dtUpdated;
        this.bExternalValidationRequested = bExternalValidationRequested;
        this.bWillNeverBeExternallyValidated = bWillNeverBeExternallyValidated;
        this.bAwaitingCleansing = bAwaitingCleansing;
        this.lCR_CompanyKey = lCR_CompanyKey;
        this.sSourceSystem = sSourceSystem;
        this.sExternalKey = sExternalKey;
        this.bIsBroker = bIsBroker;
        this.bIsInsured = bIsInsured;
        this.bIsCedant = bIsCedant;
        this.bIsReinsurer = bIsReinsurer;
        this.bIsCandC = bIsCandC;
        this.bIsGEB = bIsGEB;
        this.bIsEA = bIsEA;
        this.bIsEAGCS = bIsEAGCS;
        this.bIsEAIBD = bIsEAIBD;
        this.bIsAgency = bIsAgency;
        this.bDoNotSendToCRM = bDoNotSendToCRM;
        this.sSearchAddress = sSearchAddress;
        this.sUpdateBy = sUpdateBy;
        this.sDomesticParentGUNSNumber = sDomesticParentGUNSNumber;
        this.sDomesticParentName = sDomesticParentName;
        this.sUltimateParentGUNSNumber = sUltimateParentGUNSNumber;
        this.sUltimateParentName = sUltimateParentName;
    }

    public String getL_GlobalCompanyKey() {
        return l_GlobalCompanyKey;
    }

    public void setL_GlobalCompanyKey(String l_GlobalCompanyKey) {
        this.l_GlobalCompanyKey = l_GlobalCompanyKey;
    }

    public String getsGUNSNumber() {
        return sGUNSNumber;
    }

    public void setsGUNSNumber(String sGUNSNumber) {
        this.sGUNSNumber = sGUNSNumber;
    }

    public String getlDNBCompanyKey() {
        return lDNBCompanyKey;
    }

    public void setlDNBCompanyKey(String lDNBCompanyKey) {
        this.lDNBCompanyKey = lDNBCompanyKey;
    }

    public String getsCompanyName() {
        return sCompanyName;
    }

    public void setsCompanyName(String sCompanyName) {
        this.sCompanyName = sCompanyName;
    }

    public String getsCompanyAddress1() {
        return sCompanyAddress1;
    }

    public void setsCompanyAddress1(String sCompanyAddress1) {
        this.sCompanyAddress1 = sCompanyAddress1;
    }

    public String getsCompanyAddress2() {
        return sCompanyAddress2;
    }

    public void setsCompanyAddress2(String sCompanyAddress2) {
        this.sCompanyAddress2 = sCompanyAddress2;
    }

    public String getsCompanyAddress3() {
        return sCompanyAddress3;
    }

    public void setsCompanyAddress3(String sCompanyAddress3) {
        this.sCompanyAddress3 = sCompanyAddress3;
    }

    public String getsCompanyTownCity() {
        return sCompanyTownCity;
    }

    public void setsCompanyTownCity(String sCompanyTownCity) {
        this.sCompanyTownCity = sCompanyTownCity;
    }

    public String getsCompanyCounty() {
        return sCompanyCounty;
    }

    public void setsCompanyCounty(String sCompanyCounty) {
        this.sCompanyCounty = sCompanyCounty;
    }

    public String getsCompanyStateCode() {
        return sCompanyStateCode;
    }

    public void setsCompanyStateCode(String sCompanyStateCode) {
        this.sCompanyStateCode = sCompanyStateCode;
    }

    public String getsCompanyState() {
        return sCompanyState;
    }

    public void setsCompanyState(String sCompanyState) {
        this.sCompanyState = sCompanyState;
    }

    public String getsCompanyZipPostcode() {
        return sCompanyZipPostcode;
    }

    public void setsCompanyZipPostcode(String sCompanyZipPostcode) {
        this.sCompanyZipPostcode = sCompanyZipPostcode;
    }

    public String getsCompanyCountry() {
        return sCompanyCountry;
    }

    public void setsCompanyCountry(String sCompanyCountry) {
        this.sCompanyCountry = sCompanyCountry;
    }

    public String getlImmediateParentGlobalCompanyKey() {
        return lImmediateParentGlobalCompanyKey;
    }

    public void setlImmediateParentGlobalCompanyKey(String lImmediateParentGlobalCompanyKey) {
        this.lImmediateParentGlobalCompanyKey = lImmediateParentGlobalCompanyKey;
    }

    public String getlUltimateParentGlobalCompanyKey() {
        return lUltimateParentGlobalCompanyKey;
    }

    public void setlUltimateParentGlobalCompanyKey(String lUltimateParentGlobalCompanyKey) {
        this.lUltimateParentGlobalCompanyKey = lUltimateParentGlobalCompanyKey;
    }

    public String getlDomesticParentGlobalCompanyKey() {
        return lDomesticParentGlobalCompanyKey;
    }

    public void setlDomesticParentGlobalCompanyKey(String lDomesticParentGlobalCompanyKey) {
        this.lDomesticParentGlobalCompanyKey = lDomesticParentGlobalCompanyKey;
    }

    public String getsCompanySICCode() {
        return sCompanySICCode;
    }

    public void setsCompanySICCode(String sCompanySICCode) {
        this.sCompanySICCode = sCompanySICCode;
    }

    public String getDtLoaded() {
        return dtLoaded;
    }

    public void setDtLoaded(String dtLoaded) {
        this.dtLoaded = dtLoaded;
    }

    public String getDtUpdated() {
        return dtUpdated;
    }

    public void setDtUpdated(String dtUpdated) {
        this.dtUpdated = dtUpdated;
    }

    public String getbExternalValidationRequested() {
        return bExternalValidationRequested;
    }

    public void setbExternalValidationRequested(String bExternalValidationRequested) {
        this.bExternalValidationRequested = bExternalValidationRequested;
    }

    public String getbWillNeverBeExternallyValidated() {
        return bWillNeverBeExternallyValidated;
    }

    public void setbWillNeverBeExternallyValidated(String bWillNeverBeExternallyValidated) {
        this.bWillNeverBeExternallyValidated = bWillNeverBeExternallyValidated;
    }

    public String getbAwaitingCleansing() {
        return bAwaitingCleansing;
    }

    public void setbAwaitingCleansing(String bAwaitingCleansing) {
        this.bAwaitingCleansing = bAwaitingCleansing;
    }

    public String getlCR_CompanyKey() {
        return lCR_CompanyKey;
    }

    public void setlCR_CompanyKey(String lCR_CompanyKey) {
        this.lCR_CompanyKey = lCR_CompanyKey;
    }

    public String getsSourceSystem() {
        return sSourceSystem;
    }

    public void setsSourceSystem(String sSourceSystem) {
        this.sSourceSystem = sSourceSystem;
    }

    public String getsExternalKey() {
        return sExternalKey;
    }

    public void setsExternalKey(String sExternalKey) {
        this.sExternalKey = sExternalKey;
    }

    public String getbIsBroker() {
        return bIsBroker;
    }

    public void setbIsBroker(String bIsBroker) {
        this.bIsBroker = bIsBroker;
    }

    public String getbIsInsured() {
        return bIsInsured;
    }

    public void setbIsInsured(String bIsInsured) {
        this.bIsInsured = bIsInsured;
    }

    public String getbIsCedant() {
        return bIsCedant;
    }

    public void setbIsCedant(String bIsCedant) {
        this.bIsCedant = bIsCedant;
    }

    public String getbIsReinsurer() {
        return bIsReinsurer;
    }

    public void setbIsReinsurer(String bIsReinsurer) {
        this.bIsReinsurer = bIsReinsurer;
    }

    public String getbIsCandC() {
        return bIsCandC;
    }

    public void setbIsCandC(String bIsCandC) {
        this.bIsCandC = bIsCandC;
    }

    public String getbIsGEB() {
        return bIsGEB;
    }

    public void setbIsGEB(String bIsGEB) {
        this.bIsGEB = bIsGEB;
    }

    public String getbIsEA() {
        return bIsEA;
    }

    public void setbIsEA(String bIsEA) {
        this.bIsEA = bIsEA;
    }

    public String getbIsEAGCS() {
        return bIsEAGCS;
    }

    public void setbIsEAGCS(String bIsEAGCS) {
        this.bIsEAGCS = bIsEAGCS;
    }

    public String getbIsEAIBD() {
        return bIsEAIBD;
    }

    public void setbIsEAIBD(String bIsEAIBD) {
        this.bIsEAIBD = bIsEAIBD;
    }

    public String getbIsAgency() {
        return bIsAgency;
    }

    public void setbIsAgency(String bIsAgency) {
        this.bIsAgency = bIsAgency;
    }

    public String getbDoNotSendToCRM() {
        return bDoNotSendToCRM;
    }

    public void setbDoNotSendToCRM(String bDoNotSendToCRM) {
        this.bDoNotSendToCRM = bDoNotSendToCRM;
    }

    public String getsSearchAddress() {
        return sSearchAddress;
    }

    public void setsSearchAddress(String sSearchAddress) {
        this.sSearchAddress = sSearchAddress;
    }

    public String getsUpdateBy() {
        return sUpdateBy;
    }

    public void setsUpdateBy(String sUpdateBy) {
        this.sUpdateBy = sUpdateBy;
    }

    public String getsDomesticParentGUNSNumber() {
        return sDomesticParentGUNSNumber;
    }

    public void setsDomesticParentGUNSNumber(String sDomesticParentGUNSNumber) {
        this.sDomesticParentGUNSNumber = sDomesticParentGUNSNumber;
    }

    public String getsDomesticParentName() {
        return sDomesticParentName;
    }

    public void setsDomesticParentName(String sDomesticParentName) {
        this.sDomesticParentName = sDomesticParentName;
    }

    public String getsUltimateParentGUNSNumber() {
        return sUltimateParentGUNSNumber;
    }

    public void setsUltimateParentGUNSNumber(String sUltimateParentGUNSNumber) {
        this.sUltimateParentGUNSNumber = sUltimateParentGUNSNumber;
    }

    public String getsUltimateParentName() {
        return sUltimateParentName;
    }

    public void setsUltimateParentName(String sUltimateParentName) {
        this.sUltimateParentName = sUltimateParentName;
    }

    @Override
    public String toString() {
        return "ClientGenerali{" +
                "l_GlobalCompanyKey='" + l_GlobalCompanyKey + '\'' +
                ", sGUNSNumber='" + sGUNSNumber + '\'' +
                ", lDNBCompanyKey='" + lDNBCompanyKey + '\'' +
                ", sCompanyName='" + sCompanyName + '\'' +
                ", sCompanyAddress1='" + sCompanyAddress1 + '\'' +
                ", sCompanyAddress2='" + sCompanyAddress2 + '\'' +
                ", sCompanyAddress3='" + sCompanyAddress3 + '\'' +
                ", sCompanyTownCity='" + sCompanyTownCity + '\'' +
                ", sCompanyCounty='" + sCompanyCounty + '\'' +
                ", sCompanyStateCode='" + sCompanyStateCode + '\'' +
                ", sCompanyState='" + sCompanyState + '\'' +
                ", sCompanyZipPostcode='" + sCompanyZipPostcode + '\'' +
                ", sCompanyCountry='" + sCompanyCountry + '\'' +
                ", lImmediateParentGlobalCompanyKey='" + lImmediateParentGlobalCompanyKey + '\'' +
                ", lUltimateParentGlobalCompanyKey='" + lUltimateParentGlobalCompanyKey + '\'' +
                ", lDomesticParentGlobalCompanyKey='" + lDomesticParentGlobalCompanyKey + '\'' +
                ", sCompanySICCode='" + sCompanySICCode + '\'' +
                ", dtLoaded='" + dtLoaded + '\'' +
                ", dtUpdated='" + dtUpdated + '\'' +
                ", bExternalValidationRequested='" + bExternalValidationRequested + '\'' +
                ", bWillNeverBeExternallyValidated='" + bWillNeverBeExternallyValidated + '\'' +
                ", bAwaitingCleansing='" + bAwaitingCleansing + '\'' +
                ", lCR_CompanyKey='" + lCR_CompanyKey + '\'' +
                ", sSourceSystem='" + sSourceSystem + '\'' +
                ", sExternalKey='" + sExternalKey + '\'' +
                ", bIsBroker='" + bIsBroker + '\'' +
                ", bIsInsured='" + bIsInsured + '\'' +
                ", bIsCedant='" + bIsCedant + '\'' +
                ", bIsReinsurer='" + bIsReinsurer + '\'' +
                ", bIsCandC='" + bIsCandC + '\'' +
                ", bIsGEB='" + bIsGEB + '\'' +
                ", bIsEA='" + bIsEA + '\'' +
                ", bIsEAGCS='" + bIsEAGCS + '\'' +
                ", bIsEAIBD='" + bIsEAIBD + '\'' +
                ", bIsAgency='" + bIsAgency + '\'' +
                ", bDoNotSendToCRM='" + bDoNotSendToCRM + '\'' +
                ", sSearchAddress='" + sSearchAddress + '\'' +
                ", sUpdateBy='" + sUpdateBy + '\'' +
                ", sDomesticParentGUNSNumber='" + sDomesticParentGUNSNumber + '\'' +
                ", sDomesticParentName='" + sDomesticParentName + '\'' +
                ", sUltimateParentGUNSNumber='" + sUltimateParentGUNSNumber + '\'' +
                ", sUltimateParentName='" + sUltimateParentName + '\'' +
                '}';
    }
}
