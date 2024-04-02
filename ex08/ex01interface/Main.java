public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4);

        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Perímetro do círculo: " + circulo.perimetro());

        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Perímetro do triângulo: " + triangulo.perimetro());
    }
}