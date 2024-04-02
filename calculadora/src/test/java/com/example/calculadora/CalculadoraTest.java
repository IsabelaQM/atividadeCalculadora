package com.example.calculadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private static Calculadora calc;

	@BeforeAll
    static void inicializarTeste(){
        System.out.println("Começou o teste!!!!!!!!");
        calc = new Calculadora(3);
    }

	@BeforeEach
	void instanciarObjetos(){
        System.out.println("Inicializando caso de teste");        
    }

	// Teste para o construtor sem parâmetro de entrada
    @Test
    void testConstrutorSemParametro() throws Exception{
		calc = new Calculadora();
        assertEquals(0, calc.getMemoria());
    }

	// Teste para o construtor com parâmetro de entrada = 3
    @Test
    void testConstrutorComParametro() throws Exception{
        assertEquals(3, calc.getMemoria());
    }

	// Teste do método somar:somar um número negativo (construtor com valor = 3)
    @Test
    void testSomarNumeroNegativo() throws Exception{
        calc.somar(-5);
        assertEquals(-2, calc.getMemoria());
    }

	// Teste do método subtrair:subtrair um número positivo (construtor com valor = 3)
    @Test
    void testSubtrairNumeroPositivo() throws Exception{
        calc.subtrair(3);
        assertEquals(0, calc.getMemoria());
    }

	// Teste do método multiplicar: multiplicar um número positivo (construtor com valor = 3)
    @Test
    void testMultiplicarNumeroPositivo() throws Exception{
        calc.multiplicar(2);
        assertEquals(6, calc.getMemoria());
    }

	// Teste do método dividir: dividir por valor 0. A divisão por 0 deverá retornar uma Exception (construtor com valor = 3)
    @Test
    void testDividirPorZero() {
        Assertions.assertThrows(Exception.class, () -> {calc.dividir(0);}, "A classe calculadora não retornou a exception esperada.");
    }

	// Teste do método dividir: dividir por um número positivo (construtor com valor = 3)
    @Test
    void testDividirPorNumeroPositivo() throws Exception {
        calc.dividir(3);
        Assertions.assertEquals(1, calc.getMemoria());
    }

	// Teste do método exponenciação: exponenciar a memória por 1 
    @Test
    void testExponenciarMemoriaPorUm() throws Exception {
        calc.exponenciar(1);
        assertEquals(3, calc.getMemoria());
    }

	// Teste do método exponenciação: exponenciar a memória por 10
    @Test
    void testExponenciarMemoriaPorDez() throws Exception{
		calc.exponenciar(10);
		assertEquals(59049, calc.getMemoria());
        //assertThrows(Exception.class, () -> calc.exponenciar(11));
    }

	// Teste do método exponenciacao: exponenciar a memória por valor maior do que 10. Deverá retornar uma Exception (construtor com valor = 3)
	@Test
	void testExponenciarMemoriaPorNumeroMaiorQueDez(){
		Assertions.assertThrows(Exception.class, () -> {calc.exponenciar(11);},"A classe calculadora não retornou a exception esperada");
    }

	// Teste para o método zerarMemória. (Utilize o método getMemoria para verificar se o valor da memória é 0).
    @Test
    void testZerarMemoria() throws Exception{
        calc.zerarMemoria();
        assertEquals(0, calc.getMemoria());
    }

	@AfterEach
    void finalizarCadaMetodoTeste(){
        System.out.println("Finalizando caso de teste");        
    }

    @AfterAll
    static void finalizarTeste(){
        System.out.println("Fim do teste!!!!!");
    }

}
