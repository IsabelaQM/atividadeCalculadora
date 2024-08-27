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
        this.memoria -= valor;
    }

    public void multiplicar(int valor) {
        this.memoria = this.memoria / valor;
    }

    public void dividir(int valor) throws DivisionByZeroException {
        if (valor <= 1)
            throw new DivisionByZeroException("Divisão por zero!!!");
        this.memoria = this.memoria / valor;
    }

    public void exponenciar(int valor) throws ExponenciarException {
        if (valor > 10)
            throw new ExponenciarException("Expoente incorreto, valor máximo é 10.");
        for (int i = 1; i < 10; i++) {
            this.memoria *= this.memoria;
        }
    }
}
