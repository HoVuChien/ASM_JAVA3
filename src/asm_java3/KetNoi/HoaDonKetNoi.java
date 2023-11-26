/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.KetNoi;

import asm_java3.DoiTuong.*;
import java.sql.*;
import java.util.ArrayList;

 
//"INSERT INTO HoaDon (ma, ngay_tao, ten_nguoi_tao, id_khach_hang, tong_tien, trang_thai, id_nhan_vien)" +
//"VALUES (?, ?, ?, ?, ?, ?, ?)";
public class HoaDonKetNoi {
    Connec con;
    public ArrayList<HoaDon> getAll(){
    String sql = "select* from HoaDon";
    ArrayList<HoaDon> list= new ArrayList<>();
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
     ResultSet rs = pst.executeQuery();
     while(rs.next()){
     Integer id = rs.getInt("id");
      String ma = rs.getString("ma");
     String ngay = rs.getString("ngay_tao");
     String ten = rs.getString("ten_nguoi_tao");
     Integer idk = rs.getInt("id_khach_hang");
     float tong = rs.getFloat("tong_tien");
     String tt= rs.getString("trang_thai");
     Integer idnv = rs.getInt("id_nhan_vien");
     HoaDon hd = new HoaDon(id,ma,ngay,ten,idk,tong,tt,idnv);
     list.add(hd);      
     }
    }catch(Exception e){
    e.printStackTrace();
    }
    return list;
    }    
   public Boolean add(HoaDon hd){
   String sql = "INSERT INTO HoaDon (ma, ngay_tao, ten_nguoi_tao, id_khach_hang, tong_tien, trang_thai, id_nhan_vien)" +
"VALUES (?, ?, ?, ?, ?, ?, ?)";
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
      pst.setObject(1, hd.getMaHD());
      pst.setObject(2, hd.getNgayTao());
      pst.setObject(3, hd.getTen());
      pst.setObject(4, hd.getIdKH());
      pst.setObject(5, hd.getTongTien());
      pst.setObject(6, hd.getTrangThai());
      pst.setObject(7, hd.getIdNV());
     int kq = pst.executeUpdate();
     return kq>0;
    }catch(Exception e){
    e.printStackTrace();
    }
    return false;  
   }
   public Boolean delete(String ma){
   String sql = "delete HoaDon where ma=?" ;
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
      pst.setObject(1, ma);
     int kq = pst.executeUpdate();
     return kq>0;
    }catch(Exception e){
    e.printStackTrace();
    }
    return false;  
   }
  public ArrayList<HoaDon> tim (String name){
  String sql = "Select  *from  HoaDon where ten_nguoi_tao like '%"+name+"'";
    ArrayList<HoaDon> list= new ArrayList<>();
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
     ResultSet rs = pst.executeQuery();
     while(rs.next()){
     Integer id = rs.getInt("id");
      String ma = rs.getString("ma");
     String ngay = rs.getString("ngay_tao");
     String ten = rs.getString("ten_nguoi_tao");
     Integer idk = rs.getInt("id_khach_hang");
     float tong = rs.getFloat("tong_tien");
     String tt= rs.getString("trang_thai");
     Integer idnv = rs.getInt("id_nhan_vien");
     HoaDon hd = new HoaDon(id,ma,ngay,ten,idk,tong,tt,idnv);
     list.add(hd);      
     }
    }catch(Exception e){
    e.printStackTrace();
    }
    return list;
  
  }
}
