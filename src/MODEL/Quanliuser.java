/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Admin
 */
public class Quanliuser {
    String Username;
    String Password;
    String role;
    String name;
    String email;

    public Quanliuser(String Username, String Password, String role, String name, String email) {
        this.Username = Username;
        this.Password = Password;
        this.role = role;
        this.name = name;
        this.email = email;
    }

    public Quanliuser() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
