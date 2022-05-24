package com.eduSys.Utils;

import com.eduSys.entity.NhanVien;


public class Auth {
    //khai báo user =>Duy trì user đăng nhập vào hệ thống
    public static NhanVien user=null;
    //Xóa user khi người dùng đăng xuất
    public static void clear(){
        Auth.user=null;
    }
    //Kiểm tra đăng nhập hay chưa?
    public static boolean isLogin(){
        return Auth.user!=null;//user khác null =>Đã đăng nhập
    }
    //Kiểm tra vai trò trưởng phòng hay nhân viên 
    public static boolean isManager(){
        return Auth.isLogin() && user.getVaiTro();
    }
    
}
