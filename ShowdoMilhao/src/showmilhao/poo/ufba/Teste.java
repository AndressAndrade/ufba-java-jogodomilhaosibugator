package showmilhao.poo.ufba;

public class Teste {

	public static void main(String[] args) {
		int nota = 10;
		if(nota > 5){
			System.out.println("Aprovado");
		}
		else{
			System.out.println("Reprovado");
		}
		int inicio = 0;
		while(inicio < 10){
			inicio++;
			System.out.println(inicio);
		}
		
		switch(inicio){
		case 0:                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 10:
			System.out.println("Dez");
			break;
		default:
			System.out.println("Nao encontrado");
			break;
		}

	}
}
