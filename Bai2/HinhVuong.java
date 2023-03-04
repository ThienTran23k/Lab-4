package Bai2;

import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    
    Scanner input = new Scanner(System.in);
    public HinhVuong(){
        
    }
    public void nhapCanh(){
        System.out.print("Nhap do dai canh :");
        dai = input.nextFloat();
    }

    
}
