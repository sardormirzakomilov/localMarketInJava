package com.company.model;

public class AllClass {
    public   int Id;
    public String Name;
    public String Position;

    public AllClass(int id, String name, String position) {
        Id = id;
        Name = name;
        Position = position;


    }

    public AllClass() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }


}
