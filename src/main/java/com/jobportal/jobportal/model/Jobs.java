package com.jobportal.jobportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "jobs")
public class Jobs {
    @Id
    private int id;
    private String title;
    private String companyname;
    private String requirements;
    private String experience;
    private String location;
    private String deadline;

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", companyname='" + companyname + '\'' +
                ", requirements='" + requirements + '\'' +
                ", experience='" + experience + '\'' +
                ", location='" + location + '\'' +
                ", deadline='" + deadline + '\'' +
                ", applylink='" + applylink + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getApplylink() {
        return applylink;
    }

    public void setApplylink(String applylink) {
        this.applylink = applylink;
    }

    private String applylink;
}
