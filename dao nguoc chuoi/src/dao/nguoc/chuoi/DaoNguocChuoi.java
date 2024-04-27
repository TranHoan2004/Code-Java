/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.nguoc.chuoi;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class DaoNguocChuoi {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        // Duyệt chuỗi từ cuối lên đầu và thêm các ký tự vào reversed
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi các ký tự" );
        String input = sc.nextLine();
        //Đảo ngược chuỗi
        String reversed = reverseString(input);
        System.out.println("Chuỗi đảo ngược: "+reversed);
    }
    
}
