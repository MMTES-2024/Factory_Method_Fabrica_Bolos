/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_fabrica_bolos;

/**
 *
 * @author rafaelamoreira
 */
public abstract class FabricaBolo {
    
    public abstract Bolo criarBolo(); // Factory Method
    
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
        System.out.println("Bolo finalizado e pronto para servir!");
    }
}
