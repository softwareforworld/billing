package com.saas.billing.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class GenericResponse<T> {
    private static final Logger log = LoggerFactory.getLogger(GenericResponse.class);
    private String action;
    private int responseStatus;
    private String responseCode = "";
    private String responseMessage = "";
    private long totalSize;
    private int totalPages;
    private int currentPage;
    private int currentSize;
    private boolean isLastPage;
    private List<T> results;




    public GenericResponse(String action, int responseStatus, String responseCode, String responseMessage) {
        this.action = action;
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.totalSize = 0L;
        this.results = new ArrayList();
    }


    public GenericResponse(String action, int responseStatus, String responseCode, long totalSize, int totalPages, List<T> results) {
        this.action = action;
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;
        this.totalSize = totalSize;
        this.totalPages = totalPages;
        this.results = results;
      //  //this.setResponseMessage((Object[]) null);
    }

    public GenericResponse(String action, int responseStatus, String responseCode, long totalSize, int totalPages, int currentPage, int currentSize, boolean isLastPage, List<T> results) {
        this.action = action;
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;
        this.totalSize = totalSize;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.currentSize = currentSize;
        this.isLastPage = isLastPage;
        this.results = results;
        ////this.setResponseMessage((Object[]) null);
    }

    public GenericResponse(String action, int responseStatus, String responseCode, String responseMessage, long totalSize, int totalPages, int currentPage, int currentSize, boolean isLastPage, List<T> results) {
        this.action = action;
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;
        this.totalSize = totalSize;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.currentSize = currentSize;
        this.isLastPage = isLastPage;
        this.results = results;
        this.responseMessage = responseMessage;
        //this.setResponseMessage((Object[]) null);
    }

    private String formatError(String message, Object[] messageParams) {
        if (messageParams != null && messageParams.length > 0) {
            message = MessageFormat.format(message, messageParams);
        }

        message = message.replaceAll("\"", "").replaceAll("\\[", "").replaceAll("\\]", "");
        return message.toUpperCase();
    }

    public String getAction() {
        return this.action;
    }

    public int getResponseStatus() {
        return this.responseStatus;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public boolean isLastPage() {
        return this.isLastPage;
    }

    public List<T> getResults() {
        return this.results;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

}
