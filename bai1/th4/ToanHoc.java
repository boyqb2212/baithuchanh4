/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.th4;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class ToanHoc {
    public int n;

    public ToanHoc() {
    }

    public ToanHoc(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhapSon(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap gia tri n");
        this.n=Input.nextInt();
    }
    public int checksnt(){
        if(this.n<2){
            return 0;
        }
        else if(this.n==2||this.n==3){
            return 1;
        }
        else{
            for(int i=2;i<this.n;i++){
                if(this.n%i==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public int checksohoanhao(){
        int s=0;
        for(int i=1;i<this.n;i++){
            if(this.n%i==0){
                s=s+i;
            }
        }
        if(s==this.n){
            return 1;
        }
        return 0;
    }
    public int checksochinhphuong(){
        if(Math.sqrt(this.n)==(float)Math.sqrt(this.n)){
            return 1;
        }
        return 0;
    }
    public int fibonaci(int n){
        if(n==0){
            return 2;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    public float tinhtong1(){
        float s=0;
        for(int i=1;i<this.n;i++){
            s=s+(float)i/(i+1);
        }
        return s;
    }
    public double tinhtong2(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap gia tri x");
        double x=Input.nextDouble();
        System.out.println("Nhap gia tri k");
        double k=Input.nextDouble();
        double s=0;
        int c=1;
        for(int i=1;i<=n;i++){
            c=c*i;
            s=s+(c/(Math.pow(x, i)+Math.pow(-1, i+1)*Math.pow(k, i)));
        }
        return s;
    }
    public int tinhtong3(){
        int s=0;
        int c=1;
        for(int i=1;i<=n;i++){
            c=c*i;
            s=s+c;
        }
        return s;
    }
    
}
