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
public class SinhvienIT extends Sinhvienpoly {
    private double DiemJava ;
    private double DiemCss ;
    private double DiemHtml ;
    public double getDiemJava(){
        return DiemJava ;
    }
    public void setDiemJava(double DiemJava){
       this.DiemJava = DiemJava ;
    }
    public double getDiemCss(){
        return DiemCss ;
    }
    public void setDiemCss(double DiemCss){
        this.DiemCss = DiemCss;
    }
    public double getDiemHtml(){
        return DiemHtml ;
    }
    public void setDiemHtml(double DiemHtml){
        this.DiemHtml = DiemHtml ;
    }
    public SinhvienIT( String Hoten ,double DiemJava , double DiemCss , double DiemHtml){
        super (Hoten , "IT");
        this.DiemJava = DiemJava ;
        this.DiemCss = DiemCss ;
        this.DiemHtml = DiemHtml ;
    }
    @Override
    public double getDiem(){
        return (DiemJava * 2 + DiemCss + DiemHtml) / (double)4;
    }
}
