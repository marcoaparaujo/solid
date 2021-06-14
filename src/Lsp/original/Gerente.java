// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package Lsp.original;

public class Gerente extends Funcionario {

    public void setDescontos(float descontos) {
        this.descontos = 0;
    }

    public void setAcrescimos(float acrescimos) {
        this.acrescimos = 0;
    }

    public float calcularSalario() {
        return (float)(this.salarioBase * 1.2);
    }
}
