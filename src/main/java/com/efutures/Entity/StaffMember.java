package com.efutures.Entity;

import com.efutures.Enum.Availability;
import jakarta.persistence.*;

@Entity
public class StaffMember{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "staffMember_id",
            updatable = false
    )
    private int id;
    @Column(
            name = "staffMember_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "staffMember_position",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String position;
    @Column(
            name = "availability",
            nullable = false
    )
    @Enumerated(EnumType.STRING)
    private Availability availability;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", availability=" + availability +
                '}';
    }
}
