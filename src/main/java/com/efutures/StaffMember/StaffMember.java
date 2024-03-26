package com.efutures.StaffMember;

import com.efutures.Availability.Availability;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StaffMember{
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;
    private String name;
    private String position;
    private Availability availability;

    public Availability getAvailability() {
        return availability;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id ;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return "Staff ID: " + getId() +
                ", Name: " + getName() +
                ", Position: " + getPosition()+
                ", The Availability: " + getAvailability();
    }
}
