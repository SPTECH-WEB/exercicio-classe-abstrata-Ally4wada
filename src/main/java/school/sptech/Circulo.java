package school.sptech;

public class Circulo extends Figura {

    private Double raio;

    public Circulo(String cor, Integer espessura) {
        super(cor, espessura);
    }

    public Circulo() {
        super("branco", 12);
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

}
