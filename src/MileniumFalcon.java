public class MileniumFalcon implements Urhajo, Hiperhajtomu {
    private double tapasztalat;

    public MileniumFalcon() {
        this.tapasztalat = 100;
    }

    @Override
    public void hiperUgras() {
        this.tapasztalat += 500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        return urhajo.milyenGyors() < this.milyenGyors();
    }

    @Override
    public double milyenGyors() {
        return this.tapasztalat * 2;
    }


}
