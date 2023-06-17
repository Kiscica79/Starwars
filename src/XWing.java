import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu {

    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperUgras() {
        Random random = new Random();
        setSebesseg(getSebesseg() + random.nextInt(0, 101));
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return isMeghibasodhatE() && getSebesseg() < 1000;
    }

    @Override
    public String toString() {
        return "XWing{}" + super.toString();
    }


}
