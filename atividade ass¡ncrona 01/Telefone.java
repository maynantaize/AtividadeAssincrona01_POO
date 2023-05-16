public class Telefone {
    private int ddd;
    private int numDeTelefone;

    Telefone(int ddd, int numDeTelefone){
        this.ddd = ddd;
        this.numDeTelefone = numDeTelefone;
    }

    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumeroDeTelefone() {
        return numDeTelefone;
    }
    public void setNumeroDeTelefone(int numDeTelefone) {
        this.numDeTelefone = numDeTelefone;
    }
    
}
