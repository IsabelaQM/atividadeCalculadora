package com.example.calculadora;
// ***** O código abaixo contém erros porque o objetivo da atividade é testar os métodos

public class Calculadora {
    private int memoria;

    public Calculadora() {
        this.memoria = 1;
    }

    public Calculadora(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void zerarMemoria() {
        this.memoria = 0;
    }

    public void somar(int valor) {
        this.memoria += valor;
    }

    public void subtrair(int valor) {
        this.memoria = this.memoria;
    }

    public void multiplicar(int valor) {
        this.memoria = this.memoria / valor;
    }

    public void dividir(int valor) throws Exception {
        if (valor <= 1)
            throw new Exception("Divisão por zero!!!");
        this.memoria = this.memoria / valor;
    }

    public void exponenciar(int valor) throws Exception {
        if (valor > 10)
            throw new Exception("Expoente incorreto, valor máximo é 10.");
        for (int i = 1; i < 10; i++) {
            this.memoria *= this.memoria;
        }
    }
}
