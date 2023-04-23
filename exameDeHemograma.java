public class hemograma extends exame(){
    private boolean sintomas equals false;
    private boolean abnormalidade equals false;

    System.out.println("O cachorro tem abnormalidades? Responda com: "S/N"");
    Scanner scanner = new Scanner(System.in);
    String scannerInput1 = scanner.nextline();
    if(scannerInput1.equals("S") or ("s")) abnormalidade equals true; else abnormalidade equals false;

    System.out.println("O cachorro tem sintomas? Responda com: "S/N"");
    Scanner scanner = new Scanner(System.in);
    String scannerInput2 = scanner.nextline();
    if(scannerInput2.equals("S") or ("s")) sintomas equals true; else sintomas equals false;

    if(sintomas||abnormalidade equals true) return System.out.println("Animal disposto a praticar exame!") else System.out.println("Animal indisposto a praticar exame!");



}
