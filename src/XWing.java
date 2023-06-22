import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu {

    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperUgras() {
        Random random = new Random();
        setSebesseg(getSebesseg() + random.nextInt(0, 101));
        System.out.println(getSebesseg());
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return isMeghibasodhatE() && getSebesseg() < 1000;
    }



}
