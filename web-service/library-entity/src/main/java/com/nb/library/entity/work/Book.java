package com.nb.library.entity.work;

import com.nb.library.entity.BookInterface;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book implements BookInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "isbn")
    private String ISBN;
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Column(name = "work_id")
    private Integer workId;
    public Integer getWorkId() {
        return workId;
    }
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    @Column(name = "purchase_date", columnDefinition = "DATE")
    private Date purchaseDate;
    public Date getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Column(name = "price", columnDefinition = "NUMERIC(4,2)")
    private Double price;
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "year")
    private Integer year;
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    @ManyToOne(targetEntity = Editor.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "editor_id", referencedColumnName = "id")
    private Editor editor;
    public Editor getEditor() {
        return editor;
    }
    public void setEditor(Editor editor) {
        this.editor = editor;
    }
}
