package OO5Sobrecarga;
public class Operacao {

    private int nroFatorial = 0;
    private int nroMinuedo = 0;
    private int nroSubtraendo = 0;
    private int nroGenerico1 = 0;
    private int nroGenerico2 = 0;

    public Operacao() {
        this.nroMinuedo = 0;
        this.nroSubtraendo =0;
        this.nroGenerico1 = 0;
        this.nroGenerico2 = 0;
    }

    public int soma(int numero1, int numero2){
        return numero1 + numero2;
    }
    public int soma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
    public void setMinuedo(int numero){
        this.nroMinuedo = numero;
    }
    public void setSubtraendo(int numero){
        this.nroSubtraendo = numero;
    }
    public int subtracao(){
        return nroMinuedo - nroSubtraendo;
    }

    public void setFatorial(int numero){
        this.nroFatorial = numero;
    }
    private int fatorialRecursivo(int numero){
        if((numero==1) || (numero==0)){
            return 1;
        } else {
            return fatorialRecursivo(numero-1)*numero;
        }
    }
    public int getFatorial(){
        return fatorialRecursivo(nroFatorial);
    }
    public int multiplicacao(){
        return this.nroGenerico1 * this.nroGenerico2;
    }
    public void setNumeroGenerico1(int numero){
        this.nroGenerico1 = numero;
    }
    public void setNumeroGenerico2(int numero){
        this.nroGenerico2 = numero;
    }
    public int divisao(){
        return this.nroGenerico1 / this.nroGenerico2;
    }

    public long exponenciacao(long numero1, long numero2){
        long resultado = 1;
        if (numero2 >= 0){
            for (long i = 0; i < numero2; i++){
                resultado *= numero1;
            }
        }
        else {
            for(long i = 0; i > numero2; i--){
                resultado /= numero1;
            }
        }
        return resultado;
    }
    static public String mensagemEstatica(){
        return "Sou um método estático. Diferente de dinâmico, não preciso ser instanciado! Bem-vindo aperte ENTER para continuar! ";
    }
}