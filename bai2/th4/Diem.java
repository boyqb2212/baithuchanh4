/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.th4;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class Diem {
    double x;
    double y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap hoanh do x");
        this.x=Input.nextDouble();
        System.out.println("Nhap tung do y");
        this.y=Input.nextDouble();
    }

    @Override
    public String toString() {
        return "Diem{" + "x=" + x + ", y=" + y + '}';
    }
    public double tinhkc2d(Diem D1){
        double s=Math.sqrt((this.x-D1.x)*(this.x-D1.x)+(this.y-D1.y)*(this.y-D1.y));
        return s;
    }
}
