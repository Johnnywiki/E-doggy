public class exameDeFezes extends exame(){
    private boolean fezesComSangue equals false;
    private boolean sintomas equals false;

    System.out.println("O cachorro tem fezes com sangue? Responda com: "S/N"");
    Scanner scanner = new Scanner(System.in);
    String scannerInput1 = scanner.nextline();
    if(scannerInput1.equals("S") or ("s")) fezesComSangue equals true; else fezesComSangue equals false;

    System.out.println("O cachorro tem sintomas? Responda com: "S/N"");
    Scanner scanner = new Scanner(System.in);
    String scannerInput2 = scanner.nextline();
    if(scannerInput2.equals("S") or ("s")) sintomas equals true; else sintomas equals false;

    if(sintomas||fezesComSangue equals true) return System.out.println("Animal disposto a praticar exame!") else System.out.println("Animal indisposto a praticar exame!");

}
