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
public class KhachHangKetNoi {
    Connec connec;
    public ArrayList<KhachHang> getAll(){
        String sql ="SELECT  * FROM KhachHang";
        ArrayList<KhachHang> list = new ArrayList<>();
        try(Connection conn = connec.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);){
        ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               Integer id = rs.getInt("id");
              String ma = rs.getString("ma");  
              String Ten = rs.getString("ho_ten");  
              String Dc = rs.getString("dia_chi");  
               Integer ns = rs.getInt("nam_sinh");
               String GT = rs.getString("gioi_tinh");  
               KhachHang nv = new KhachHang(id,ma,Ten,Dc,ns,GT);
               list.add(nv);
            }                
        }catch(Exception e){
        e.printStackTrace();
        }
    return list;
    
    }
   public Boolean add(KhachHang kh){
     String sql ="INSERT INTO KhachHang (ma, ho_ten, dia_chi, nam_sinh, gioi_tinh)" +"VALUES(?, ?, ?, ?, ?)";
    
        try(Connection conn = connec.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);){
        pst.setObject(1, kh.getMaKH());
        pst.setObject(2, kh.getHoTen());
        pst.setObject(3, kh.getDaiChi());
        pst.setObject(4, kh.getNamsinh());
        pst.setObject(5, kh.getGioiTinh());
        
            int kq = pst.executeUpdate();
            return kq>0;
        }catch(Exception e){
        e.printStackTrace();
        }
       return false;
   }
    public Boolean delete(String ma){
    String sql ="delete KhachHang where ma=?";
        try(Connection conn = connec.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);){
        pst.setObject(1,ma);       
            int kq = pst.executeUpdate();
            return kq>0;
        }catch(Exception e){
        e.printStackTrace();
        }
       return false;
    
    }
    public ArrayList<KhachHang> tim(String name){
     String sql ="select* from KhachHang where ho_ten like '%"+name+"'" ;
        ArrayList<KhachHang> list = new ArrayList<>();
        try(Connection conn = connec.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);){
        ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               Integer id = rs.getInt("id");
              String ma = rs.getString("ma");  
              String Ten = rs.getString("ho_ten");  
              String Dc = rs.getString("dia_chi");  
               Integer ns = rs.getInt("nam_sinh");
               String GT = rs.getString("gioi_tinh");  
               KhachHang nv = new KhachHang(id,ma,Ten,Dc,ns,GT);
               list.add(nv);
            }                
        }catch(Exception e){
        e.printStackTrace();
        }
    return list;
    }
}
