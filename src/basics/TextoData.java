package basics;

public class TextoData {
	public static void main(String[] args) {
		short dia = 17, mes = 4, ano = 2001;
		String mesTxt = convertMesNumPraTexto(mes);
		System.out.println(dia+" de "+mesTxt+" do ano de "+ano);			
	}
	
	public static String convertMesNumPraTexto(short mes) {
		switch(mes) {
		case 1: return "Janeiro";
		case 2: return "Feveireiro";
		case 3: return "Março";
		case 4: return "Abril";
		case 5: return "Maio";
		case 6: return "Junho";
		case 7: return "Julho";
		case 8: return "Agosto";
		case 9: return "Setembro";
		case 10: return "Outubro";
		case 11: return "Novembro";
		case 12: return "Dezembro";
		default: return "Mês inexistente";
		
		}
	}
}
