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
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, columnDefinition = "DATE")
    private Date birthDate;

    @Column(nullable = true, columnDefinition = "DATE")
    private Date deathDate;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String biography;

    public Profile(){};

    public Profile(String firstName, String lastName, Date birthDate, Date deathDate, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.biography = biography;
    }
}
