import java.util.Scanner;

public class prescricaoDeAlimentacao(){
    private String prescricaoDeRacao = "A ração para o animal consiste de nutrientes essenciais para seu sustento durante o dia!";
    private String prescricaoDeSoro = "O soro conta com todas as vitaminas necessarias para uma recuperação eficaz!";
    private String prescricaoDeOutro = "Esta alimentação é unica para o animal requisitado! Entre em contato com o cuidador para a bula";


    System.out.println("Qual descrição gostaria de ler? Racao,soro ou outro?");
    Scanner scanner = new Scanner(System.in);
    String scannerInput = scanner.nextline();
    if(scannerInput.equals("Racao")|| scannerInput.equals("racao")) return prescricaoDeRacao;
        else if(scannerInput.equals("Soro")||scannerInput.equals("soro")) return prescricaoDeSoro;
            else if(scannerInput.equals("Outro")||scannerInput.equals("outro")) return prescricaoDeOutro;
                else System.out.println("Esta opção não é valida!")";
}