class Retangulo {
	// Inicializando atributos
	private int id;
	private double largura;
	private double comprimento;
	
	// Construtor vazio
	public Retangulo() { }
	
	// Construtor contendo apenas um parâmetro (nesse caso seria criado um quadrado)
	public Retangulo(double valor) {
		this.largura = valor;
		this.comprimento = valor;
	}
	
	// Construtor contendo 3 parâmetros
	public Retangulo(int id, double largura, double comprimento) {
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	// Calcula a área do retângulo
	public double calcularArea() {
		return this.largura * this.comprimento;
	}
	
	// Altera as medidas do retângulo para que o mesmo se transforme em um quadrado
	public void enquadrar() { 
		double media = (this.largura + this.comprimento) / 2;
		this.largura = media;
		this.comprimento = media;
	}
	
	// Verifica se é um quadrado
	public boolean ehQuadrado() {
		if(this.largura == this.comprimento) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Verifica se as medidas entre dois retângulos são iguais
	public boolean ehIgual(Retangulo outroRetangulo) {
		if(this.calcularArea() == outroRetangulo.calcularArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Altera as medidas do retângulo com base no fator especificado
	public void redimensionar(double fator) {
		this.largura = this.largura * fator;
		this.comprimento = this.comprimento * fator;
	}
	
	// Copia os atributos de um retângulo existente
	public void copiar(Retangulo outroRetangulo) {
		this.largura = outroRetangulo.largura;
		this.comprimento = outroRetangulo.comprimento;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	// ToString
	@Override
	public String toString() {
		return "ID: " + this.id + "; Largura: " + this.largura + "; Comprimento:  "+ this.comprimento;
	}	
}