/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestacionamientomall;

/**
 *
 * @author ivanb
 */
public class SistemaEstacionamientoMall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento e1 = new Normal("A1", "Sector 1");
        Estacionamiento e2 = new Preferente("P1", "Sector 1");

        // Estacionamiento Normal
        e1.registrarEntrada(10, 20);
        e1.registrarSalida(11, 30);
        e1.definirTarifaMinuto(50);

        // Estacionamiento Preferente
        e2.definirTipoDescuento(1); // Funcionario (20% descuento)
        e2.definirTarifaUnica(3000);

        // Mostrar pagos
        System.out.println(e1.mostrarPago());
        System.out.println(e2.mostrarPago());
    }
    
}
