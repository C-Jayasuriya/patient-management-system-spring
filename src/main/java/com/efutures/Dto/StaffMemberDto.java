package com.efutures.Dto;

import com.efutures.Enum.Availability;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StaffMemberDto {
    private String name;
    private String position;
    @Enumerated(EnumType.STRING)
    private Availability availability;
    public StaffMemberDto(){

    }
    public StaffMemberDto(String name, String position, Availability availability) {
        this.name = name;
        this.position = position;
        this.availability = availability;
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
}
