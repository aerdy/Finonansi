/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AtHome;

import javax.swing.JOptionPane;

/**
 *
 * @author bahrie
 */
public class Fibo {
    public static void main(String[] args) {
        int num1=0,num2=1,temp;
        int n=
Integer.parseInt(JOptionPane.showInputDialog("Masukkan Maksimum derek: "));
        System.out.print(num2+" ");
        for (int i=1;i<n;++i){
            temp=num2;//temp untuk menyimpan sementara nilai num2
            num2+=num1;//num2 kemudian ditambahkan
            System.out.print(num2+" ");
            num1=temp;//nilai dari num2 yg sebelumnya dipindah ke num1


        } 
    }

}
