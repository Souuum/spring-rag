package fr.efrei.springrag.domain;

import jakarta.persistence.*;

@Entity
public class Document {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    private String title;

    private String description;

    private String author;

    private String publisher;

    private String publishedDate;

    private String contentType;

    public Document(){}

    public Document(String title,String description, String author, String publisher, String publishedDate, String contentType) {
        this.title =title;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.contentType = contentType;
    }

    public Document(Long id,String title,String description, String author, String publisher, String publishedDate, String contentType) {
        this.id =id;
        this.title =title;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.contentType = contentType;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getContentType() {
        return contentType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
