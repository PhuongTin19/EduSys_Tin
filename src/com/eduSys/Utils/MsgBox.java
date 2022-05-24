
package com.eduSys.Utils;

import java.awt.Component;
import javax.swing.JOptionPane;


public class MsgBox {
    //Cửa sổ thông báo
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ thống quản lý đào tạo",
                JOptionPane.INFORMATION_MESSAGE);
    }
    //Cửa sổ xác nhận
    public static boolean confirm(Component parent,String message){
        int result=JOptionPane.showConfirmDialog(parent, message,"Hệ thóng quản lý đào tạo",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result==JOptionPane.YES_OPTION;
    }
    //Cửa sổ nhập
    public static String prompt(Component parent,String message){
        return JOptionPane.showInputDialog(parent,message,
                "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
