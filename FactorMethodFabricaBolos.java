/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.factory_method_fabrica_bolos;

/**
 *
 * @author rafaelamoreira
 */
public class FactorMethodFabricaBolos {

    public static void main(String[] args) {
        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        fabricaChocolate.fazerBolo();
        
        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        fabricaMorango.fazerBolo();
        
        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        fabricaCenoura.fazerBolo();
        
        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();
        fabricaAbacaxi.fazerBolo();
    }
}
