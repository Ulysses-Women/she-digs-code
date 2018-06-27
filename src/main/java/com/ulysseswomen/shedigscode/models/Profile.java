package com.ulysseswomen.shedigscode.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="profiles")
public class Profile {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false, columnDefinition = "DATE")
    private Date birth_date;

    @Column(nullable = true, columnDefinition = "DATE")
    private Date death_date;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String biography;

    public Profile(){};

    public Profile(String first_name, String last_name, Date birth_date, Date death_date, String biography) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.death_date = death_date;
        this.biography = biography;
    }
}
