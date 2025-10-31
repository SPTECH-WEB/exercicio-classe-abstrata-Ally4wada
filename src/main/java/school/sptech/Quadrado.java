package school.sptech;


public class Quadrado extends Figura {
    private Double lado;

    public Quadrado(String cor, Integer espessura) {
        super(cor, espessura);
    }

    public Quadrado() {
        super("Vermelho", 15);
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
