// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package p3_L_lsp_refatorado;

public class Funcionario extends FuncionarioGeral implements IFuncionario {
      
    public Funcionario() {};
    
   public float calcularSalario() {
        return this.salarioBase + this.acrescimos - this.descontos;
   }
   
}
