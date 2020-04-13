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
public class Main {
    public static void Main(String[] args){
        SinhvienIT SVIT = new SinhvienIT("Nguyen Nhu Huan" ,7.0,7.5,9);
        SVIT.Xuat();
        
        SinhvienBiz SVB = new SinhvienBiz("Nguyen Nhu Thinh",8.0,9.5);
        SVB.Xuat();
    }
}
