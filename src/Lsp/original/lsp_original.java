// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package Lsp.original;

public class lsp_original {

    public static Funcionario getFuncionario() {
        //return new Funcionario();
        return new Gerente();
    }

    public static void main(String args[]) {
        Funcionario func = getFuncionario();
        func.setSalarioBase(1000);
        func.setAcrescimos(200);
        func.setDescontos(100);
        System.out.println(func.calcularSalario());
    }

}
