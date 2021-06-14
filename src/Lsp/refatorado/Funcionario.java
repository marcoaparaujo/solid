// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package Lsp.refatorado;

public class Funcionario extends FuncionarioGeral implements IFuncionario {
      
    public Funcionario() {};
    
   public float calcularSalario() {
        return this.salarioBase + this.acrescimos - this.descontos;
   }
   
}
