package com.vishnugan.bookstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_author")
public class BookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
    private Book book;
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    private Author author;

    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }
    public Book getBook () {
        return book;
    }

    public void setBook ( Book book ) {
        this.book = book;
    }

    public Author getAuthor () {
        return author;
    }

    public void setAuthor ( Author author ) {
        this.author = author;
    }
}
