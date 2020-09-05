/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasimpledeber1;



class Gasolina {

    float tamanio_in_muestra, tiempo_evap;
    float temp_evaporacion;
    int porcentaje_vol_evap;

    void MostrarTamanioMuestraGasolina() {
        System.out.println("El tamaño inicial de la muestra es:"
                + tamanio_in_muestra + " litros " + "\n El porcentaje"
                + " de gasolina evaporada es "
                + porcentaje_vol_evap + " %, en un periodo de " + tiempo_evap + "horas"
                + " a una temperatura de " + temp_evaporacion + "º");
    }
}

    class Especial extends Gasolina {

        String calidad;

        double CalcularMuestraRestante() {
            return tamanio_in_muestra - (porcentaje_vol_evap / 100) * tamanio_in_muestra;
        }

        void mostarCalidad() {
            System.out.println("La calidad de la muestra es : " + calidad);
        }
    }

    class Convencional extends Gasolina {

        String calidad;

        double CalcularaRestanteDeMuestra() {
            return tamanio_in_muestra - (porcentaje_vol_evap / 100)*tamanio_in_muestra;
        }

        void mostrarCalidad() {
            System.out.println("La calidad de la muestra es : " + calidad);
        }
    }


/**
 *
 * @author cliente
 */
public class HerenciaSimpleDeber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Especial ep= new  Especial();
        Convencional cv= new Convencional();

        ep.tamanio_in_muestra = (float) 2.5;
        ep.porcentaje_vol_evap = 70;
        ep.temp_evaporacion = (float) 15.6;
        ep.tiempo_evap = (float) 5.4;

        cv.tamanio_in_muestra = (float) 4.6;
        cv.porcentaje_vol_evap = 50;
        cv.temp_evaporacion = (float) 10.2;
        cv.tiempo_evap = (float) 6.8;

        System.out.println("Resultado de la muestra Super");
        ep.mostarCalidad();
        ep.MostrarTamanioMuestraGasolina();
        System.out.println("Lo que queda de la muestra es:"
                + ep.CalcularMuestraRestante() + " litros ");
        System.out.println();

        System.out.println("resultado de la muestra Extra");
        cv.mostrarCalidad();
        cv.MostrarTamanioMuestraGasolina();
        System.out.println("Lo que queda de la muestra es :"
                + cv.CalcularaRestanteDeMuestra() + "litros");

    }

}
