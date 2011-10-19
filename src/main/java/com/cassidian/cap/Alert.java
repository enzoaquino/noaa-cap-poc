package com.cassidian.cap;

import org.codehaus.jackson.annotate.JsonAutoDetect; 

@JsonAutoDetect
public class Alert {
    private String author;
    private String title;
    private String summary;
    private String url;

    public Alert() { }

    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setSummary(String summary) { this.summary = summary; }
    public String getSummary()  { return summary; }

    public void setUrl(String url) { this.url = url; }
    public String getUrl() { return url; }
}
