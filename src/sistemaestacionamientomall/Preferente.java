/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamientomall;

/**
 *
 * @author ivanb
 */
public class Preferente extends Estacionamiento {
    private int tarifaUnica;
    private int tipoDescuento;

    public Preferente(String sigla, String ubicacion) {
        super(sigla, ubicacion);
    }

    @Override
    public void definirTarifaMinuto(int tarifa) {
        // No se usa en Preferente
    }

    @Override
    public void definirTarifaUnica(int tarifa) {
        this.tarifaUnica = tarifa;
    }

    @Override
    public void definirTipoDescuento(int tipoDescuento) {
        if (tipoDescuento == 1 || tipoDescuento == 2) {
            this.tipoDescuento = tipoDescuento;
        } else {
            System.out.println("Tipo de descuento inválido.");
        }
    }

    @Override
    public double valorAPagar() {
        double descuento = 0.0;
        if (tipoDescuento == 1) { // Funcionario - 20% descuento
            descuento = 0.20;
        } else if (tipoDescuento == 2) { // PrePago - 10% descuento
            descuento = 0.10;
        }
        return tarifaUnica - (tarifaUnica * descuento);
    }

    @Override
    public String mostrarPago() {
        return "Preferente: A pagar " + sigla + " " + ubicacion + " $" + valorAPagar();
    }

    // Implementaciones vacías de registrarEntrada y registrarSalida
    @Override
    public void registrarEntrada(int hora, int minuto) {
        // No se usa en Preferente
    }

    @Override
    public void registrarSalida(int hora, int minuto) {
        // No se usa en Preferente
    }
}
