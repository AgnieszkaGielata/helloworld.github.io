package com.spti.helloworld1.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "measurement")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Column(name = "pressure1", nullable = false)
    private Integer pressure1;

    @Column(name = "pressure2", nullable = false)
    private Integer pressure2;

    @Column(name = "pulse", nullable = false)
    private Integer pulse;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getPressure1() {
        return pressure1;
    }

    public void setPressure1(Integer pressure1) {
        this.pressure1 = pressure1;
    }

    public Integer getPressure2() {
        return pressure2;
    }

    public void setPressure2(Integer pressure2) {
        this.pressure2 = pressure2;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}