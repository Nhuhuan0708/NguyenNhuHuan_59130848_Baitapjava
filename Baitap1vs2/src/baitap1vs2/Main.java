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
public class Main {
    public static void main(String[]args){
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyen Nhu Huan");
        nv1.setTuoi(20);
        nv1.setDiachi("Van Ninh , Khanh Hoa");
        nv1.setTienluong(2000000);
        nv1.setTsogiolam(200);
        System.out.println(nv1.ThongtinNV() + "Thong tin cua nhan vien 1 : ");
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyen Van A");
        nv2.setTuoi(25);
        nv2.setDiachi("Nguyen Dinh Chieu , Nha Trang");
        nv2.setTienluong(1500000);
        nv2.setTsogiolam(150);
        System.out.println(nv2.ThongtinNV() + "Thong tin cua nhan vien 2 : " );
        
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien();
        nv3.setTen("Ngo Thanh Nam");
        nv3.setTuoi(30);
        nv3.setDiachi("Dong Anh ,Ha Noi");
        nv3.setTienluong(2500000);
        nv3.setTsogiolam(250);
        NhanVien nv4 = new NhanVien();
        nv4.setTen("Luong Tan Dat");
        nv4.setTuoi(25);
        nv4.setDiachi("Ninh Hoa, Khanh Hoa");
        nv4.setTienluong(1800000);
        nv4.setTsogiolam(180);
        NhanVien nv5 = new NhanVien();
        nv5.setTen("Ngo Ba Kha");
        nv5.setTuoi(27);
        nv5.setDiachi("Ba Dinh , Ha Noi");
        nv5.setTienluong(2100000);
        nv5.setTsogiolam(210);
        QLNV.them(nv5);
        QLNV.them(nv4);
        QLNV.them(nv3);
        QLNV.them(nv2);
        QLNV.them(nv1);
        QLNV.inDS();
    }    
}
