/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QLHoaDon {
    HoaDonKetNoi kn = new HoaDonKetNoi();
    public ArrayList<HoaDon> getlist(){
    return kn.getAll();
    }
    public String add(HoaDon hd){
        if (kn.add(hd)==true) {
            return "Them TC";
        } else {
            return "Them TB";
        }
    }
    public String delete(String ma){
    Boolean check = kn.delete(ma);
        if (check) {
             return "Xoa TC";
        } else {
             return "Xoa TB";
        }
    }
   public ArrayList<HoaDon> tim(String ten){
     ArrayList<HoaDon> tim1 = kn.tim(ten);
     return tim1;
    }
}
