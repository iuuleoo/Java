public class Conta {
    double saldo = 10.0;
    double novoSaldo; // Declare novoSaldo as a field

    public void sacar(Double valor) {
        novoSaldo = saldo - valor; // Assign to field
    }

    public void imprimirSaldo() {
        System.out.println(saldo);
        System.out.println(novoSaldo);
    }
}