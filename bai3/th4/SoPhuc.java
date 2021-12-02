/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.th4;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class SoPhuc {
    double a;
    double b;

    public SoPhuc() {
    }

    public SoPhuc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void nhapTT(){
        Scanner Input=new Scanner (System.in);
        System.out.println("Nhap phan thuc");
        this.a=Input.nextDouble();
        System.out.println("Nhap phan ao");
        this.b=Input.nextDouble();
    }
    public void inTT(){
        System.out.println(this.a+"+"+this.b+"i");
    }
    public void cong2sophuc(SoPhuc D1){
        System.out.println((this.a+D1.a)+"+"+(this.b+D1.b)+"i");
    }
    public void nhan2sophuc(SoPhuc D1){
        System.out.println((this.a*D1.a-this.b*D1.b)+"+"+(this.b*D1.a+this.a*D1.b)+"i");
    }
}
