/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.QuanLy;

import asm_java3.DoiTuong.*;
import asm_java3.KetNoi.DanhMucKetNoi;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QlDanhMuc {
    DanhMucKetNoi kn = new DanhMucKetNoi();
    public ArrayList<DanhMuc> getlist(){
    return kn.getAll();
    }
    public String Add(DanhMuc dm){
        if (kn.add(dm)==true) {
            return "Thanh cong";
        }else{
         return "That Bai";
        }
    }
    public String dele(String ma){
    Boolean check = kn.delete(ma);
        if (check) {
            return "Thanh cong";
        }else{
        return "That Bai";
        }
    }
    public ArrayList<DanhMuc> tim(String ma){   
   ArrayList<DanhMuc> kq = kn.tim(ma);
    return kq;
    }
}
