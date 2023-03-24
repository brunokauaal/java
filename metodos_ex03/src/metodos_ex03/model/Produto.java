package metodos_ex03.model;

public class Produto {

	 private String nome;
	    private String plataforma;
	    private int anoLancamento;
	    private double preco;
	    private boolean disponivel;

	    public Produto(String nome, String plataforma, int anoLancamento, double preco, boolean disponivel) {
	        this.nome = nome;
	        this.plataforma = plataforma;
	        this.anoLancamento = anoLancamento;
	        this.preco = preco;
	        this.disponivel = disponivel;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getPlataforma() {
	        return plataforma;
	    }

	    public void setPlataforma(String plataforma) {
	        this.plataforma = plataforma;
	    }

	    public int getAnoLancamento() {
	        return anoLancamento;
	    }

	    public void setAnoLancamento(int anoLancamento) {
	        this.anoLancamento = anoLancamento;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public boolean isDisponivel() {
	        return disponivel;
	    }

	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }

	    public void visualizar() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Plataforma: " + plataforma);
	        System.out.println("Ano de Lançamento: " + anoLancamento);
	        System.out.println("Preço: R$" + preco);
	        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
	    }
	
	
	
}
