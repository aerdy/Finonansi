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
public class Fibonanci {
    public static void main(String[] args) {
        int jmlDeret=
Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang derek: "));
        int nilai[]=new int[jmlDeret];
        int a=0;
        nilai[0]=1;
        nilai[1]=1;
        nilai[2]=2;
       for (int b=3;b<nilai.length;b++){
           nilai[b]=nilai[b-1]+nilai[b-2];
       }
        for (int c=0;c<nilai.length;c++){
            System.out.print(nilai[c]+" ");
        }

    }

}
