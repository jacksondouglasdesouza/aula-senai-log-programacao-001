package monitorFlu;

public class MonitorFluxo {
	public static void main(String[] args) {
		int litrosPorSegundos;
		double temperatura;
		tipoLiquido tipoDoLiquido =  tipoLiquido.SOLVENTE;
		boolean alarme;
		int liquido = 0;
		
		litrosPorSegundos= 125;
		temperatura = 54.0;
		
		alarme = ((litrosPorSegundos > 150) || (temperatura > 55) || (liquido != 0));
		
		System.out.println("Passam exatamente, "+ litrosPorSegundos + " Litros por segundo na tubula��o. \n");
		System.out.println("A temperatura constante do l�quido � de: "+ temperatura + " graus C�. \n");
		System.out.println("O tipo de l�quido atual � o: "+ tipoDoLiquido + ", em estado de produ��o cont�nua.\n");
		System.out.println("O alamarme est� ativado? "+ alarme);
		
	
	}

}