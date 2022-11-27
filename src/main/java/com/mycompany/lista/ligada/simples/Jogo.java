/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.ligada.simples;

/**
 *
 * @author JONAS
 */
public class Jogo {
    
    static int Jogo(int n, int r)
    {
        if(n ==1)
        {
            return 1;
        }
        else
        {
            return(Jogo(n -1, r) + r-1 ) % n +1;
        }
    }
}
