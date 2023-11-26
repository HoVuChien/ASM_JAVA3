/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_java3.KetNoi;

import asm_java3.DoiTuong.*;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class NhanVienKetNoi {
    Connec con;
    public ArrayList<NhanVien> getall(){
    String sql = "SELECT  * FROM NhanVien";
    ArrayList<NhanVien> list = new ArrayList<>();
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
    ResultSet rs = pst.executeQuery();
            while(rs.next()){
           Integer id=rs.getInt("id");
           String ma =rs.getString("ma_nhan_vien");
           String ten =rs.getString("ho_ten");
           String gt =rs.getString("gioi_tinh");
           String ns=rs.getString("nam_sinh");
           String dc =rs.getString("dia_chi");
           NhanVien nv = new NhanVien(id,ma,ten,gt,ns,dc);
           list.add(nv);
            }
    }catch(Exception e){
    e.printStackTrace();;
    }
   return list;
    }
    public Boolean add(NhanVien nv){
     String sql = "INSERT INTO NhanVien (ma_nhan_vien, ho_ten, gioi_tinh, nam_sinh, dia_chi)" +
"VALUES (?, ?, ?, ?, ?)";
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
       pst.setObject(1, nv.getMaNV());
       pst.setObject(2, nv.getHoTen());
       pst.setObject(3, nv.getGoiitinh());
       pst.setObject(4, nv.getNamSinh());
       pst.setObject(5, nv.getDiaChi());
     int kq = pst.executeUpdate();
     return kq>0;
    }catch(Exception e){
    e.printStackTrace();;
    }
   return false;
    }
    public Boolean dele(String ma){
     String sql = "delete from NhanVien where ma_nhan_vien = ?";
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
       pst.setObject(1, ma);      
     int kq = pst.executeUpdate();
     return kq>0;
    }catch(Exception e){
    e.printStackTrace();;
    }
   return false;
    }
    public ArrayList<NhanVien> tim(String name){
     String sql = "select * from NhanVien where ho_ten like '%"+name+"'";
    ArrayList<NhanVien> list = new ArrayList<>();
    try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)){
    ResultSet rs = pst.executeQuery();
            while(rs.next()){
           Integer id=rs.getInt("id");
           String ma =rs.getString("ma_nhan_vien");
           String ten =rs.getString("ho_ten");
           String gt =rs.getString("gioi_tinh");
          String ns=rs.getString("nam_sinh");
           String dc =rs.getString("dia_chi");
           NhanVien nv = new NhanVien(id,ma,ten,gt,ns,dc);
           list.add(nv);
            }
    }catch(Exception e){
    e.printStackTrace();;
    }
   return list;
    }
}
