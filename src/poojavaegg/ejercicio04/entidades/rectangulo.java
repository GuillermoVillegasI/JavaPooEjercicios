package poojavaegg.ejercicio04.entidades;

public class rectangulo {

    private double base;
    private double altura;

    public rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }

    public rectangulo() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double sup() {
        return (base * altura);
    }

    public double per() {
        return ((base + altura) * 2);
    }

    public void dib(double numero1, double numero2) {

        for (int i = 0; i < numero2; i++) {
            for (int j = 0; j < numero1; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
