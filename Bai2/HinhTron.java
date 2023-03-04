package Bai2;

import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    Scanner input = new Scanner(System.in);

    public HinhTron(){

    }
    public HinhTron(float banKinh){
        this.banKinh = banKinh;
    }

    public void nhapBanKinh(){
        System.out.print("Nhap ban kinh hinh tron : ");
        banKinh = input.nextFloat();
    }
    public void tinhChuvi(){
        float TinhCV = banKinh * 2 * Pi ;
        System.out.print("Chu vi = " + TinhCV);
    }
    public void  tinhDienTich(){
        float TinhDT = Pi * banKinh * banKinh ;
        System.out.print("Dien tich = " + TinhDT);
    }
}
