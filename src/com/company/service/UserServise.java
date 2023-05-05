package com.company.service;
import com.company.model.AllClass;
import com.company.model.User;
import java.util.ArrayList;
public class UserServise extends AllClass {
    static int k = 0;
    public ArrayList<User> user = new ArrayList<User>();
    public boolean addUser(String name , String surname , String position){
        k++;
        User worker = new User(k, name, surname, position);
        User checkUser = new User();
        for (int i = 0; i < user.size() ; i++) {
            checkUser=user.get(i);
            if( checkUser.getName().equals(name) && checkUser.getSurname().equals(surname) ){
                System.out.println("=========================================================================");
                System.out.println("Bunday Ishchi bor !!!");
                System.out.println("=========================================================================");
                return false;
            }
        }
        user.add(worker);
        return false;
    }
    public boolean updateUser(int id, String name, String surname, String position,int status) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getId() == id) {
                user.get(i).setName(name);
                user.get(i).setSurname(surname);
                user.get(i).setPosition(position);
                user.get(i).setStatus(status);
            }
        }
        return false;
    }
    public void updateUserName(int id,String name){
        for (int i = 0; i <user.size() ; i++) {
            if (user.get(i).getId()==id) {
                user.get(i).setName(name);
            }
        }
    }
    public void updateUserSurname(int id,String surname){
        for (int i = 0; i <user.size() ; i++) {
            if (user.get(i).getId()==id) {
                user.get(i).setSurname(surname);
            }
        }
    }
    public void updateUserPosition(int id,String position){
        for (int i = 0; i <user.size() ; i++) {
            if (user.get(i).getId()==id) {
                user.get(i).setPosition(position);
            }
        }
    }
    public void updateUserStatus(int id,int status){
        for (int i = 0; i <user.size() ; i++) {
            if (user.get(i).getId()==id) {
                user.get(i).setStatus(status);
            }
        }
    }

    public void  DeleteUser(int Id ) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getId() == Id) {
                user.get(i).setStatus("Ofline");
            }
        }
    }
    public void showuser(){
        for (User item:user) {
            item.show();
        }
    }
    public void showUserON(){
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getStatus()== "Online") {
                user.get(i).show();
            }

        }
    }
    public void showIdAndName(){
        for (User item:user) {
            if (item.getStatus()== "Online"){
            System.out.println(" "+item.getId()+" -> "+item.getName());
        }}
    }

    public User getUserById(int id){
        for (User item:user) {
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }

    public void check(){
        System.out.println("CHECK");
        System.out.println(user);
    }

}
