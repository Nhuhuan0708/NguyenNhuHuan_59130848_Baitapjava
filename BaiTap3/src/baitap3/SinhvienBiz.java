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
public class SinhvienBiz extends Sinhvienpoly{
    private double DiemMarketing ;
    private double DiemSales ;
    public double getDiemMarketing(){
        return DiemMarketing;
    }
    public void setDiemMarketing(double DiemMarketing){
        this.DiemMarketing = DiemMarketing ;
    }
    public double getDiemSales(){
        return DiemSales;
    }
    public void setDiemSales(double DiemSales){
        this.DiemSales = DiemSales;
    }
    public SinhvienBiz(String Hoten,double DiemMarketing, double DiemSales){
        super(Hoten,"Biz");
        this.DiemMarketing = DiemMarketing ;
        this.DiemSales = DiemSales ;
    }
    @Override
    public double getDiem(){
        return (DiemMarketing*2 + DiemSales) / (double)3 ;
    }
}
