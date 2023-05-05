package com.company.service;
import com.company.model.AllClass;
import com.company.model.Maxsulot;
import com.company.model.User;

import java.util.ArrayList;
public class MaxsulotService extends AllClass {
    static int k = 0;
    ArrayList<Maxsulot> maxsulot = new ArrayList<Maxsulot>();
    public boolean addMaxsulot(String name, String position, Float date, Float price, Integer caunt ){
        k++;
        Maxsulot worker = new Maxsulot(k, name, position,date, price, caunt);
        Maxsulot checkMaxsulot= new Maxsulot();
        for (int i = 0; i < maxsulot.size() ; i++) {
            checkMaxsulot=maxsulot.get(i);
            if(checkMaxsulot.getName().equals(name) &&
                    checkMaxsulot.getPosition().equals(position) &&
                    checkMaxsulot.getDate().equals(date)){
                System.out.println("=========================================================================");
                System.out.println("Bunday Maxsulot bor !!!");
                System.out.println("=========================================================================");
                return false;
            }
        }
        maxsulot.add(worker);
        return false;
    }
    public boolean updateMaxsulot(int id, String name, String position, Float date, Float price, Integer caunt, int status){
        for (int i = 0; i < maxsulot.size(); i++) {
            if (maxsulot.get(i).getId() == id){
                maxsulot.get(i).setName(name);
                maxsulot.get(i).setPosition(position);
                maxsulot.get(i).setDate(date);
                maxsulot.get(i).setPrice(price);
                maxsulot.get(i).setCaunt(caunt);
                maxsulot.get(i).setStatus(status);
            }
        }
        return false;
    }
    public void maxsulotUpdateName(int id,String name){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
                maxsulot.get(i).setName(name);
            }
        }
    }

    public void maxsulotUpdatePosition(int id,String position){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
                maxsulot.get(i).setPosition(position);
            }
        }
    }
    public void maxsulotUpdateDate(int id,Float date){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
                maxsulot.get(i).setDate(date);
            }
        }
    }
    public void maxsulotUpdatePrice(int id,Float price){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
                maxsulot.get(i).setPrice(price);
            }
        }
    }
    public void maxsulotUpdateCaunt(int id,int caunt){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
                maxsulot.get(i).setCaunt(caunt);
            }
        }
    }
    public void maxsulotUpdateStatus(int id,int status){
        for (int i = 0; i <maxsulot.size() ; i++) {
            if (maxsulot.get(i).getId()==id) {
               if (status ==1){
                   maxsulot.get(i).setStatus("Bor");
               }
                maxsulot.get(i).setStatus("Yoq");
            }
        }
    }
    public void  DeleteMaxsulot(int id) {
        for (int i = 0; i < maxsulot.size(); i++) {
            if (maxsulot.get(i).getId() == id) {
                maxsulot.get(i).setStatus("Yoq");
            }
        }
    }
    public void showmaxsulot(){
        for (Maxsulot item:maxsulot) {
            item.showMaxshulot();
        }
    }

    public void showFull(){
        for (Maxsulot item:maxsulot) {
            System.out.println(" Id: "+item.getId()+" || Name: "+item.getName()+" || Date: "+item.getDate()+" || Price: "+item.getPrice()+" || Status: "+item.getStatus());
        }
    }

    public Maxsulot getMaxsulotById(int id){
        for (Maxsulot item:maxsulot) {
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }

}

