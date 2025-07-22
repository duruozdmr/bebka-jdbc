package model;

import jakarta.persistence.*;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "course_name")
    private String name;
    @Column(name = "course_description")
    private String description;
    @Column(name = "course_topic")
    private String topic;
    @Column(name = "course_location")
    private String location;

    public Courses(String d){

    }

    public Courses( String name, String description, String topic, String location){
        this.name=name;
        this.description=description;
        this.topic=topic;
        this.location=location;
    }

    public Courses() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
