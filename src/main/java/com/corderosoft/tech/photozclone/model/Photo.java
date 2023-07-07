package com.corderosoft.tech.photozclone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Photo {
    private String id;
    @NotEmpty
    private String fileName;

    private String contentType;

    @JsonIgnore
    private byte [] data;

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public Photo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
