/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.th4;

/**
 *
 * @author boyqb2212
 */
public class Bai3TH4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoPhuc s=new SoPhuc();
        SoPhuc D1=new SoPhuc();
        s.nhapTT();
        s.inTT();
        D1.nhapTT();
        D1.inTT();
        System.out.println("tong 2 so phuc :");
        s.cong2sophuc(D1);
        System.out.println("Tic 2 so phuc");
        s.nhan2sophuc(D1);
    }
    
}
