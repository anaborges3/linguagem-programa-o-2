class Triangulo implements Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 0.5 * base * altura;
    }

    @Override
    public double perimetro() {
        // Assumindo que é um triângulo genérico
        // Se for um triângulo retângulo, o cálculo seria diferente
        // Mas para a generalidade, a fórmula abaixo funciona
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}