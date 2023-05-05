package com.company.model;
public class User extends AllClass {
    public String surname;
    public String status = "Online";
    public User(int id, String name, String surname, String position) {
        super(id, name, position);
        this.surname = surname;
    }
    public User() {

    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getStatus() {
        return status;
    }
    public boolean setStatus(String status) {
        this.status = status;
        return false;
    }
    public void setStatus(int status) {

        if (status==1){
            this.status = "Online";
        }else {
            this.status="Ofline";}
    }
    public void show(){

    System.out.println("Id: "+Id +
            ", Name='" + Name + '\'' +
            ", Surname='" + surname + '\'' +
            ", Position='" + Position + '\'' +
            ", Status='" + status + '\'');
}

}
