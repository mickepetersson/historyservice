package com.tobiasjohansson.emusicms.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "media_type")
public class MediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "type")
    private String type;

    @ManyToMany(mappedBy = "mediaTypes")
    private List<Genre> genres;
    public MediaType(String type) {
        this.type = type;
    }

    public MediaType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
