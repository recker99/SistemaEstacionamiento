/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamientomall;

/**
 *
 * @author ivanb
 */
public abstract class Estacionamiento {
    protected String sigla;
    protected String ubicacion;

    public Estacionamiento(String sigla, String ubicacion) {
        this.sigla = sigla;
        this.ubicacion = ubicacion;
    }

    public abstract double valorAPagar();
    public abstract String mostrarPago();
    public abstract void definirTarifaMinuto(int tarifa);
    public abstract void definirTipoDescuento(int tipoDescuento);
    public abstract void definirTarifaUnica(int tarifa);

    // Nuevos métodos abstractos para registrar entrada y salida
    public abstract void registrarEntrada(int hora, int minuto);
    public abstract void registrarSalida(int hora, int minuto);
}
