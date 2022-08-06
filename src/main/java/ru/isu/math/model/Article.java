package ru.isu.math.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String description;

    private Date time;

    private boolean isActive;


    public Article() {

    }

    public Article(long id, String title, String description, Date time, boolean isActive) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.time = time;
        this.isActive = isActive;
    }

    public long getID() {
        return this.id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTime() {
        return this.time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean getActive() {
        return this.isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
