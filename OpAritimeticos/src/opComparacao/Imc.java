package opComparacao;

public class Imc {
	public static void main(String[] args) {
		double altura = 1.77;
		double peso = 79.99;
		double imc = 0.0;
		boolean pesoIdeal;
		
		imc = (peso / (altura * altura));
		double imcValor = imc;
		pesoIdeal = ((imc >= 18.5) && (imc < 25));
		
		System.out.println(imcValor + " ? ou N?o ?? " + pesoIdeal);
		
	}

}
