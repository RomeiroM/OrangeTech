public class Ususrio {
    public static void main(String[] args) throws Exception {

        SmartTV smarTv = new SmartTV();

        System.out.println("TV Ligada? "+smarTv.ligada);
        System.out.println("Canal ? "+smarTv.canal);
        System.out.println("Volume ? "+smarTv.volume);

        smarTv.ligar();
        smarTv.mudaCanal(12);
    }
}
