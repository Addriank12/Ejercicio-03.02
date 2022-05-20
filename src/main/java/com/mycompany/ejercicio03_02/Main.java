/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import Vista.Ventana1;
import Vista.Ventana2;
import Vista.ventana4;
import Vista.ventanaInscripcion;
import Vista.ventanaCrearGrupo;

/**
 *
 * @author Adrian
 */
public class Main {
    public static void main(String[] args) {
        var v1 = new Ventana1("");
        v1.show();
         var v2 = new Ventana2("");
        v2.show();
         var v3 = new ventanaCrearGrupo("");
        v3.show();
         var v4 = new ventanaInscripcion("");
        v4.show();
         var v5 = new ventana4("");
        v5.show();
    }
}
