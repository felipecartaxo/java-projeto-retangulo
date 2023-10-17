public class RetanguloTeste {

	public static void main(String[] args) {
		
		try {
			// Instanciando o objeto 'r1' utilizando o construtor com 3 parâmetros
			// Retangulo r1 = new Retangulo();
			// System.out.println(r1.calcularArea()); // 12.0
			
			// Instanciando o objeto 'r2' utilizando o construtor vazio
			// Retangulo r2 = new Retangulo();
			
			// Como utilizamos o construtor vazio, os atributos foram inicializados com valor 0 , portanto retorna 0.0 ao chamar o método 'calcularArea()'
			// System.out.println(r2.calcularArea()); // 0
			
			Retangulo r3 = new Retangulo(1, 3, 5);
			System.out.println(r3.calcularArea()); // 15.0
			r3.enquadrar();
			System.out.println(r3.calcularArea()); // 16.0 (após o método 'enquadrar()', 'largura' e 'comprimento' passaram a ser '4'
			
			Retangulo r4 = new Retangulo(1, 3, 3);
			System.out.println(r4.ehQuadrado()); // true
			
			Retangulo r5 = new Retangulo(2, 2, 7);
			System.out.println(r5.ehQuadrado()); // false
			
			System.out.println(r4);
			System.out.println(r4.ehIgual(r5)); // false
			
			// Dobra as medidas de r4
			r4.redimensionar(2);
			System.out.println(r4);
			
			// Copia as medidas de r5
			r4.copiar(r5);
			System.out.println(r5);
			
			// Instanciando o objeto r6 utilizando o construtor com apenas um parâmetro
			// Retangulo r6 = new Retangulo(5);
			// System.out.println(r6.calcularArea()); // 25.0
			
			// System.out.println(r6.getLargura());
		}
		catch(Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}