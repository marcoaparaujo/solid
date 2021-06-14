// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package Lsp.refatorado;

public class Gerente extends FuncionarioGeral implements IFuncionario {

    public Gerente() {};

    public float calcularSalario() {
        return (float)(this.salarioBase * 1.2);
    }

}
