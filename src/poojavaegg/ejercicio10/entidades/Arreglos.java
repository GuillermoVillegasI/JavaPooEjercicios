package poojavaegg.ejercicio10.entidades;

import java.util.Arrays;

public class Arreglos {

    private int[] vectora;
    private int[] vectorb;
    private int tama;
    private int tamb;

    public Arreglos() {

    }

    public Arreglos(int[] vectora, int tama, int[] vectorb, int tamb) {

        this.vectora = vectora;
        this.vectorb = vectorb;
        this.tama = tama;
        this.tamb = tamb;

    }

    public int[] getVectora() {
        return vectora;
    }

    public void setVectora(int[] vectora) {
        this.vectora = vectora;
    }

    public int[] getVectorb() {
        return vectorb;
    }

    public void setVectorb(int[] vectorb) {
        this.vectorb = vectorb;
    }

    public int getTama() {
        return tama;
    }

    public void setTama(int tama) {
        this.tama = tama;
    }

    public int getTamb() {
        return tamb;
    }

    public void setTamb(int tamb) {
        this.tamb = tamb;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "vectora=" + vectora + ", vectorb=" + vectorb + ", tama=" + tama + ", tamb=" + tamb + '}';
    }

    public void llenarymostrar(int vector[], int tam) {

        for (int i = 0; i < tam; i++) {

            vector[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < tam; i++) {

            System.out.print(" [ " + vector[i] + " ] ");

        }
    }
    // MIRAR VIDEO SORT //

    public void ordenar(int vectora[], int vectorb[], int tama, int tamb) {

        Arrays.sort(vectora);
        vectorb = Arrays.copyOf(vectora, 20);

        for (int i = 10; i < tamb; i++) {

            vectorb[i] = 5;
            
        }

        for (int i = 0; i < tama; i++) {

            System.out.print(" [ " + vectora[i] + " ] ");

        }
        System.out.println();

        for (int i = 0; i < tamb; i++) {

            System.out.print(" [ " + vectorb[i] + " ] ");

        }
    }

}


