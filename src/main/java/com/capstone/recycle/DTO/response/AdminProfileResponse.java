package com.capstone.recycle.DTO.response;

import com.capstone.recycle.Entity.Admin;
import lombok.Getter;
import java.time.LocalDate;

@Getter
public class AdminProfileResponse {
    private final Long id;
    private final String username;
    private final String name;
    private final String role;
    private final Integer floor;
    private final String position;
    private final LocalDate birthDate;
    private final String photoUrl;
    private final String phone;

    public AdminProfileResponse(Admin a) {
        this.id = a.getId();
        this.username = a.getUsername();
        this.name = a.getName();
        this.role = a.getRole();
        this.floor = a.getFloor();
        this.position = a.getPosition();
        this.birthDate = a.getBirthDate();
        this.photoUrl = a.getPhotoUrl();
        this.phone = a.getPhone();
    }
}
