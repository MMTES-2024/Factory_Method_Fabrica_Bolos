/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_fabrica_bolos;

/**
 *
 * @author rafaelamoreira
 */
public class FabricaBoloMorango extends FabricaBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloMorango();
    }
}
