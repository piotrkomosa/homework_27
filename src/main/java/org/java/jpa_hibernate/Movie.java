package org.java.jpa_hibernate;

import jdk.jfr.Category;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "tytul")
    private String title;
    @Column(name = "data_premiery")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate premiereDate;
    @Column(name = "opis")
    private String desc;
//    @Column(name = "kategoria")
//    @Enumerated(EnumType.STRING)
//    private Category category;

    public Movie() {
    }


    public Movie(String title, LocalDate premiereDate, String desc) {
        this.title = title;
        this.premiereDate = premiereDate;
        this.desc = desc;
    //   this.category = category;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", premiereDate=" + premiereDate +
                ", desc='" + desc + '\'' +
                ", category=" +
                '}';
    }
}
