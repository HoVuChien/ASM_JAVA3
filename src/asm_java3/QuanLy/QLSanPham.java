/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.SanPhamKetNoi;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSanPham {
    SanPhamKetNoi kn = new SanPhamKetNoi();
    public ArrayList<SanPham> getlist(){
    return kn.getAll();
    }
    public String add(SanPham sp){
        if (kn.add(sp)==true) {
            return "Them ThanH cong";
        } else {
             return "Them That baig";
        }
    
    }
    public String xoa(String ma){
    Boolean check = kn.dele(ma);
        if (check) {
             return "Xoa ThanH cong";
        } else {
             return "Them That Bai";
        }
    }
    public ArrayList<SanPham> tim(String ma){
    ArrayList<SanPham> kq = kn.tim(ma);
    return kq;
    } 
}
