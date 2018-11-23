package model;

import java.util.ArrayList;

public class User {

    protected String userName;
    protected String kode;
    protected boolean IsAdmin;
    protected ArrayList<User> users;


    public User(String username, String kode, boolean isAdmin) { //constructor av parametre
        this.userName = username;
        this.kode = kode;
        this.IsAdmin = isAdmin;
        this.users = new ArrayList();

    }

    public User() {

    }


    public ArrayList<User> getUser() {return users; } //setters and getters af parametre

    public void setUser(ArrayList<User> users) {

    }
    public void addUser(User user) {
    }

    public String getUsername() { return userName; }

    public void setUsername(String username) { this.userName = username; }

    public String getKode() { return kode; }

    public void setKode(String kode) { this.kode = kode; }

    public boolean isAdmin() {return IsAdmin; }

    public void setAdmin(boolean admin) { this.IsAdmin = admin; }



}
