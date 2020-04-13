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

import java.util.ArrayList;
public class QuanLyNhanVien implements IQuanLy{
     ArrayList<NhanVien> dsNhanVien = new ArrayList<>(); 
     @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0;i<dsNhanVien.size();i++){
            System.out.println(i+1+"--------------------------");
            System.out.println(dsNhanVien.get(i).ThongtinNV());
        }
    }
}
