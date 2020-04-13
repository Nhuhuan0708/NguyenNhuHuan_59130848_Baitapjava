/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1vs2;

/**
 *
 * @author dell
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String Diachi;
    private double Tienluong;
    private int Tsogiolam ;

    public NhanVien() {
       
    }
    public void setTen(String Ten){
        this.Ten = Ten ;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi = Tuoi ;
    }
    public void setDiachi(String Diachi){
        this.Diachi = Diachi;
    }
    public void setTienluong(double Tienluong){
        this.Tienluong = Tienluong;
    }
    public void setTsogiolam(int Tsogiolam){
        this.Tsogiolam = Tsogiolam;
    }
    public NhanVien(String Ten , int Tuoi , String Diachi , double Tienluong , int Tsogiolam){
        this.Ten = Ten ;
        this.Tuoi = Tuoi;
        this.Diachi = Diachi;
        this.Tienluong = Tienluong;
        this.Tsogiolam = Tsogiolam;
    }
    public double TinhThuong(){
        if (Tsogiolam >= 200) return Tienluong*0.2;
        else if (Tsogiolam >= 100) return Tienluong*0.1;
        else return 0;
    }
    public String ThongtinNV(){
        return "Ten : " + Ten + ", Tuoi : " + Tuoi + ", Diachi : " + Diachi + ", Tienluong : " + Tienluong + ", Tsogiolam : " + Tsogiolam + ", Tienthuong : " + TinhThuong();
    }
}
