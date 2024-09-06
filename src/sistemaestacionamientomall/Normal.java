/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamientomall;

/**
 *
 * @author ivanb
 */
public class Normal extends Estacionamiento {
    private int horaEntrada;
    private int minutoEntrada;
    private int horaSalida;
    private int minutoSalida;
    private int tarifaMin;

    public Normal(String sigla, String ubicacion) {
        super(sigla, ubicacion);
    }

    @Override
    public void registrarEntrada(int hora, int minuto) {
        this.horaEntrada = hora;
        this.minutoEntrada = minuto;
    }

    @Override
    public void registrarSalida(int hora, int minuto) {
        this.horaSalida = hora;
        this.minutoSalida = minuto;
    }

    @Override
    public void definirTarifaMinuto(int tarifa) {
        this.tarifaMin = tarifa;
    }

    @Override
    public void definirTipoDescuento(int tipoDescuento) {
        // Método vacío ya que no hay descuentos en Normal
    }

    @Override
    public void definirTarifaUnica(int tarifa) {
        // Este método no se usa en Normal
    }

    @Override
    public double valorAPagar() {
        int minutosEntrada = (horaEntrada * 60) + minutoEntrada;
        int minutosSalida = (horaSalida * 60) + minutoSalida;
        int minutosTotales = minutosSalida - minutosEntrada;
        return minutosTotales * tarifaMin;
    }

    @Override
    public String mostrarPago() {
        return "Normal: A pagar " + sigla + " " + ubicacion + " $" + valorAPagar();
    }
}
