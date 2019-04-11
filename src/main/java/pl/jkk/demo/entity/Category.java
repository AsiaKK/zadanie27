package pl.jkk.demo.entity;

import java.beans.Transient;

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Transient
    private Long offers;

    public Category(String name, String description, Long offers) {
        this.name = name;
        this.description = description;
        this.offers = offers;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOffers() {
        return offers;
    }

    public void setOffers(Long offers) {
        this.offers = offers;
    }

}