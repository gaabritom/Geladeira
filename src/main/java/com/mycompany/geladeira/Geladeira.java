package com.mycompany.geladeira;

public class Geladeira {

    private int temperatura;
    private String modelo;
    private String marca;

    Geladeira() {
        temperatura = -5;
        marca = "Brastemp";
        modelo = "Frost Free";
    }

    Geladeira(int t, String m, String model) {
        temperatura = t;
        marca = m;
        modelo = model;
    }

    Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int t) {
        this.temperatura = t;
    }

    String getModelo() {
        return modelo;
    }

    String getMarca() {
        return marca;
    }

    public static void main(String args[]) {

        Geladeira g1 = new Geladeira();
        Geladeira g2 = new Geladeira(2, new String("Brastemp"), new String("B22"));
        Geladeira g3 = new Geladeira(0, new String("Panasonic"), new String("E54"));

        System.out.println("A geladeira 1 tem uma temperatura de ate " + g1.getTemperatura()
                + ", do modelo " + g1.getModelo() + ", da marca " + g1.getMarca() + ".\n");

        g1.setTemperatura(-200);

        System.out.println("A geladeira 1 tem uma temperatura de ate " + g1.getTemperatura()
                + ", do modelo " + g1.getModelo() + ", da marca " + g1.getMarca() + ".\n");

        System.out.println("A geladeira 2 tem uma temperatura de ate " + g2.getTemperatura()
                + ", do modelo " + g2.getModelo() + ", da marca " + g2.getMarca() + ".\n");

        System.out.print("A geladeira 3 tem:" + "\n" + "Temperatura: " + g3.getTemperatura() + "\n"
                + "Modelo: " + g3.getModelo() + "\n"
                + "Marca: " + g3.getMarca() + ".");

    }
}
