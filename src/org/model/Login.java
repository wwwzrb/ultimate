package org.model;

/**
 * Created by wcy on 2016/4/9.
 */
public class Login {
    private int id;
    private String username;
    private String password;
    private int root;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public int getId(){
        return this.id;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public int getRoot() {
        return root;
    }

}
