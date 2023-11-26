/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.NhanVienKetNoi;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLNhanVien {
    NhanVienKetNoi kn = new NhanVienKetNoi();
   public ArrayList<NhanVien> getlist(){
    return kn.getall();
    }
   public String add(NhanVien nv){
       if (kn.add(nv)==true) {
           return "Them ThanH cong";
       } else {
           return "Them ThanH cong";
       }
   
   }
   public String dele(String ma){
   Boolean check = kn.dele(ma);
       if (check) {
           return "Xoa Thanh Cong";
       }else{
        return "Xoa Thaat Bai";
       }
   }
   public ArrayList<NhanVien> tim(String name){
   ArrayList<NhanVien> kq= kn.tim(name);
   return kq;
   }
}
