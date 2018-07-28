package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * 作者entity
 */
@ApiModel(description = "作者entity")
@Entity
@Table(name = "author")
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Author name
     */
    @ApiModelProperty(value = "Author name")
    @Column(name = "writer_name")
    private String writerName;

    /**
     * some write book
     */
    @ApiModelProperty(value = "some write book")
    @Column(name = "writer_book")
    private String writerBook;

    @OneToMany(mappedBy = "writer")
    private Set<Book> books = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWriterName() {
        return writerName;
    }

    public Author writerName(String writerName) {
        this.writerName = writerName;
        return this;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getWriterBook() {
        return writerBook;
    }

    public Author writerBook(String writerBook) {
        this.writerBook = writerBook;
        return this;
    }

    public void setWriterBook(String writerBook) {
        this.writerBook = writerBook;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Author books(Set<Book> books) {
        this.books = books;
        return this;
    }

    public Author addBook(Book book) {
        this.books.add(book);
        book.setWriter(this);
        return this;
    }

    public Author removeBook(Book book) {
        this.books.remove(book);
        book.setWriter(null);
        return this;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
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
        Author author = (Author) o;
        if (author.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), author.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Author{" +
            "id=" + getId() +
            ", writerName='" + getWriterName() + "'" +
            ", writerBook='" + getWriterBook() + "'" +
            "}";
    }
}
