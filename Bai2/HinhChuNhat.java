package Bai2;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai , rong ;
    Scanner input = new Scanner(System.in);

    public HinhChuNhat(){

    }
    public void nhapChieuDai(){
        System.out.print("Nhap chieu dai hinh chu nhat : ");
        dai = input.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Nhap chieu rong hinh chu nhat : ");
        rong = input.nextFloat();
    }
    public void tinhChuvi(){
        float TinhCV = (dai + rong) * 2;
        System.out.print("Chu vi HCN = "+TinhCV);

    }
    public void tinhDienTich(){
        float TinhDT = dai * rong ;
        System.out.print("Dien tich HCN = "+TinhDT);

    }
}
