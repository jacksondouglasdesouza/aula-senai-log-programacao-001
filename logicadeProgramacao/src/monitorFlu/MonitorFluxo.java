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
		
		System.out.println("Passam exatamente, "+ litrosPorSegundos + " Litros por segundo na tubulação. \n");
		System.out.println("A temperatura constante do líquido é de: "+ temperatura + " graus C°. \n");
		System.out.println("O tipo de líquido atual é o: "+ tipoDoLiquido + ", em estado de produção contínua.\n");
		System.out.println("O alamarme está ativado? "+ alarme);
		
	
	}

}