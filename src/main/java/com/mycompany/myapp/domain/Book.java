package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * 书
 */
@ApiModel(description = "书")
@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * book name
     */
    @ApiModelProperty(value = "book name")
    @Column(name = "book_name")
    private String bookName;

    /**
     * author
     */
    @ApiModelProperty(value = "author")
    @Column(name = "writer_name")
    private String writerName;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties("books")
    private Author writer;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public Book bookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public Book writerName(String writerName) {
        this.writerName = writerName;
        return this;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Author getWriter() {
        return writer;
    }

    public Book writer(Author author) {
        this.writer = author;
        return this;
    }

    public void setWriter(Author author) {
        this.writer = author;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        if (book.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", bookName='" + getBookName() + "'" +
            ", writerName='" + getWriterName() + "'" +
            "}";
    }
}
