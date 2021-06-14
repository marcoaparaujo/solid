// SRP - Single Responsability Principle 
// Princípio da Responsabilidade Única

package Srp.refatorado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aposta {
    private static final int APOSTA_MINIMA = 6;
    private static final int APOSTA_MAXIMA = 15;
    private static final int MENOR_NUMERO = 1;
    private static final int MAIOR_NUMERO = 60;
    
    private final List<Integer> numeros;

    public Aposta(List<Integer> numeros) {
        this.numeros = Collections.unmodifiableList(numeros);// cópia defensiva
        validarAposta(numeros);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    private void validarAposta(List<Integer> numerosApostados) {
        if (numerosApostados.size() < APOSTA_MINIMA) {
            throw new IllegalArgumentException("A aposta abaixo da mínima");
        }
        if (numerosApostados.size() > APOSTA_MAXIMA) {
            throw new IllegalArgumentException("A aposta cima da máxima");
        }

        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer apostado : numerosApostados) {
            if (apostado < MENOR_NUMERO || apostado > MAIOR_NUMERO) {
                throw new IllegalArgumentException("Número fora do limite"); 
            }
            if (numerosValidos.contains(apostado)) {
                throw new IllegalArgumentException("Número duplicado");  
            }
            numerosValidos.add(apostado);
        }
    }



}
