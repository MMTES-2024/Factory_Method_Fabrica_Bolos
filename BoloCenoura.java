/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_fabrica_bolos;

/**
 *
 * @author rafaelamoreira
 */
public class BoloCenoura implements Bolo {
    @Override
    public void preparar() {
        System.out.println("Preparando Bolo de Cenoura: misturando cenouras, ovos, farinha e açúcar...");
    }
}
