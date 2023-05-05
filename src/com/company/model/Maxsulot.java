package com.company.model;
public class Maxsulot extends AllClass{
    public Float  Date;
    public Integer Caunt;
    public Float Price;
    public String status = "Bor";
    public Maxsulot(int id, String name, String position, Float date, Float price, Integer caunt) {
        super(id, name, position);
        this.Price = price;
        this.Date = date;
        this.Caunt = caunt;
    }
    public Maxsulot(){

    }
    public Float getDate() {
        return Date;
    }
    public void setDate(Float date) {
        Date = date;
    }
    public Float getPrice() {return Price;}
    public void setPrice(Float price) {Price = price;}
    public int getCaunt() {
        return Caunt;
    }
    public void setCaunt(int caunt) {
        Caunt = caunt;
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
            this.status = "Bor";
        }else {
            this.status="Yoq";}
    }
    public void showMaxshulot() {
        System.out.println(
            "id=" + Id +
                ", name='" + Name + '\'' +
                ", position='" + Position + '\'' +
                ", date=" + Date + '\'' +
                ", price=" + Price + '$' +
                ", caunt=" + Caunt + '\'' +
                ", status=" + status + '\'' );
    }

}
