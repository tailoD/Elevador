package elevador;

public class ClasseElevador {
    private int terreo = 0;
    private int totalAndares;
    private int capacidade;
    private int qntdPessoas;
    private int andarAtual =0;

    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public void setQntdPessoas(int qntdPessoas) {
        this.qntdPessoas = qntdPessoas;
    }
    
    public ClasseElevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    
    
    
    public void entrar(){
        if (capacidade - qntdPessoas < 0 ){
            System.out.println("Este elevador ja esta cheio!!");
        }
        else{
            qntdPessoas = qntdPessoas + 1;
            System.out.println("Uma pessoa entrou no elevador");
            System.out.println("Total de pessoas: " + qntdPessoas);
        }
    }
    
    public void sair(){
        if (qntdPessoas>0){
            qntdPessoas = qntdPessoas - 1;
            System.out.println("Uma pessoa saiu do elevador");
            System.out.println("Quantidade de pessoas: " + qntdPessoas);
        }
        else{
            System.out.println("Este elevador ja esta vazio!");
        }
    }
    
    public void subir(){
        if (andarAtual<totalAndares){
            andarAtual = andarAtual + 1;
        System.out.println("Subimos um andar");
        System.out.println("Atualmente estamos no andar " + andarAtual);

    }else{
            System.out.println("Ja estamos no ultimo andar");
        }
    }
    
    public void descer(){
      if (andarAtual==1 || andarAtual == 0){
          System.out.println("Nao eh possivel descer mais");
      }else{
          andarAtual=andarAtual -1;
          System.out.println("Descemos um andar");
          System.out.println("Atualmente estamos no andar " + andarAtual);
      }
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
            
}