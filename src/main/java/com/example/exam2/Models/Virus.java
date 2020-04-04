package com.example.exam2.Models;
import javax.persistence.*;
@Entity
@Table(name = "virus2")
public class Virus {
    @Id
    @Column(name = "id")
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "duration")
    public int duration;
    @Column(name = "mortality")
    public float mortality;
    @Column(name ="imageaddress")
    public String image;

    public Virus() {

    }
public Virus(int id,String name, String description, String symptoms, int duration, float mortality,String image){
        this.id=id;
        this.name=name;
        this.description=description;
        this.symptoms=symptoms;
        this.duration=duration;
        this.mortality=mortality;
        this.image=image;
}
    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getMortality() {
        return mortality;
    }
    public void setMortality(float mortality) {
        this.mortality = duration;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}