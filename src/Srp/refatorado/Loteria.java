// SRP - Single Responsability Principle 
// Princípio da Responsabilidade Única

package Srp.refatorado;

import java.util.List;

public class Loteria {

    public static final int NUM_ACERTOS_SENA = 6;
    public static final int NUM_ACERTOS_QUINA = 5;
    public static final int NUM_ACERTOS_QUADRA = 4;
    public static final double PERC_PREMIO_SENA = 1.0;
    public static final double PERC_PREMIO_QUINA = 0.2;
    public static final double PERC_PREMIO_QUADRA = 0.05;

    public double calcularPremio(Aposta aposta, Sorteio sorteio, double premioTotal) {
        if (aposta == null) {
            throw new IllegalArgumentException("Aposta inválida");
        }
        if (sorteio == null) {
            throw new IllegalArgumentException("Sorteio inválido");
        }
        
        int acertos = contarAcertos(aposta.getNumeros(), sorteio.getNumeros());

        if (acertos == NUM_ACERTOS_SENA) {
            return premioTotal * PERC_PREMIO_SENA;
        } else if (acertos == NUM_ACERTOS_QUINA) {
            return premioTotal * PERC_PREMIO_QUINA;
        } else if (acertos == NUM_ACERTOS_QUADRA) {
            return premioTotal * PERC_PREMIO_QUADRA;
        } else {
            return 0.0;
        }
    }

    private int contarAcertos(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int acertos = 0;
        for (Integer apostado : numerosApostados) {
            if (numerosSorteados.contains(apostado)) {
                acertos++;
            }
        }
        return acertos;
    }

}
