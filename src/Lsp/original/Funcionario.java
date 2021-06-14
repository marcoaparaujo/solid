// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package Lsp.original;

public class Funcionario {
   
   protected float salarioBase;
   protected float descontos;
   protected float acrescimos;

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescontos() {
        return descontos;
    }

    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }

    public float getAcrescimos() {
        return acrescimos;
    }

    public void setAcrescimos(float acrescimos) {
        this.acrescimos = acrescimos;
    }

    public float calcularSalario() {
       return this.salarioBase + this.acrescimos - this.descontos;
   }
   
}
