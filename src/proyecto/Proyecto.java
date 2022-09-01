/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    
    public static void main(String[] args) {
     int num,a;
        num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        if(num%2==0){
            System.out.println("el numero  "+num+"  es par");
        }
        
        else if(num%2==1){
            System.out.println("el numero "+num+" es impar");
        }  
    }
    
}