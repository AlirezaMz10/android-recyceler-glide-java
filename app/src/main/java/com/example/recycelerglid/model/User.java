package com.example.recycelerglid.model;

public class User {
    private int id;
    private String links;
    private String username;

    public User(int id, String links, String username) {
        this.id = id;
        this.links = links;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
