/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.th4;

/**
 *
 * @author boyqb2212
 */
public class Bai2TH4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diem s=new Diem();
        Diem z=new Diem();
        s.nhapTT();
        z.nhapTT();
        System.out.println(s.toString());
        System.out.println(z.toString());
        System.out.println(s.tinhkc2d(z));
    }
    
}
