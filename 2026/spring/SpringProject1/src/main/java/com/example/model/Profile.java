package com.example.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    private int profileId;
    private String type;

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @PostConstruct
    public void initProfile(){
        this.profileId=9;
        this.type="job";
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", type='" + type + '\'' +
                '}';
    }
}
