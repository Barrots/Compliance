package com.earlymorning.model;

import org.apache.commons.io.FilenameUtils;

import java.util.Date;

/**
 * Created by Dario on 11/08/2016.
 */
public class InboundFile {

    private long idFile;
    private String nameOfFile;
    private String nameOfFileWithoutExt;
    private long actualArrivalDate;
    private String filePath;

    public InboundFile() {

    }
    public InboundFile(long idFile, String nameOfFile, long actualArrivalDate, String filePath) {
        this.idFile = idFile;
        this.nameOfFile = nameOfFile;
        this.nameOfFileWithoutExt = FilenameUtils.removeExtension(nameOfFile);
        this.actualArrivalDate = actualArrivalDate;
        this.filePath=filePath;
    }

    public long getIdFile() {
        return idFile;
    }

    public void setIdFile(long idFile) {
        this.idFile = idFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
        this.nameOfFileWithoutExt = FilenameUtils.removeExtension(nameOfFile);
    }

    public String getNameOfFileWithoutExt() {
        return nameOfFileWithoutExt;
    }

    public long getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(long actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
