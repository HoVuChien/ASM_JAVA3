/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.KhachHangKetNoi;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLKhachHang {
    KhachHangKetNoi knKH = new KhachHangKetNoi();
    
    public ArrayList<KhachHang> getlist(){
  return knKH.getAll();
}
    public String add(KhachHang kh){
        if (knKH.add(kh)==true) {
            return "Them Thanh Cong";
        }else{
         return "Them That Bai";
        }
    
    }
    public String delete(String ma){
    Boolean check = knKH.delete(ma);
        if (check) {
            return "Xoa Thanh Cong";
        }else{
        return "Xoa That BAi";
        }
    }
    public ArrayList<KhachHang> tim(String name){
    ArrayList<KhachHang> tim= knKH.tim(name);
    return tim;
    }
}
