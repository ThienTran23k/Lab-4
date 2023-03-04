package Bai2;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    
    public float chieuCao;
    Scanner input = new Scanner(System.in);
    public HinhTru(){

    }
    public void nhapChieuCao(){
        System.out.print("Nhap chieu cao hinh tru : ");
        chieuCao = input.nextFloat();
    }
    public void tinhTheTich(){
        float theTichTru = Pi * banKinh * banKinh * chieuCao;
        System.out.print("The tich hinh tru = " + theTichTru);
    }
}
