public class Conta {
    private int numeroDaConta;
    private int agencia;
    private int saldo;

    Conta(int numeroDaConta, int agencia, int saldo){
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public void extrato() {
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }

}
