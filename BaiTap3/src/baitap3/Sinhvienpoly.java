/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author dell
 */
abstract public class Sinhvienpoly {
    private String Hoten ;
    private String Nganh ;
    public String getHoten(){
        return Hoten ;
    }
    public void setHoten(String Hoten){
        this.Hoten = Hoten ;
    }
    public String getNganh(){
        return Nganh ;
    }
    public void setNganh(String Nganh){
        this.Nganh = Nganh ;
    }
    public Sinhvienpoly (String Hoten , String Nganh){
        this.Hoten = Hoten ;
        this.Nganh = Nganh ;
    }
    abstract public double getDiem();
    public String getHocluc(){
        double Diem = getDiem();
        String Hocluc ;
               if(Diem < 5) return Hocluc = "Yeu" ;
               else if(Diem < 6.5) return Hocluc = "Trung binh" ;
               else if(Diem < 7.5) return Hocluc = "Kha" ;
               else if(Diem < 9) return Hocluc = "Gioi" ;
               else return Hocluc = "Xuat sac" ;
    }
    public void Xuat(){
        System.out.println("Thong tin sinh vien" + Hoten);
        System.out.println("Nganh : " + Nganh + "Diem : " + getDiem() + ", Hoc luc : " + getHocluc());
    }
}
