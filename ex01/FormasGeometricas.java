/*
 * @author Ana Carolina Silva Borges
 */

//Declarando os métodos abstratos na forma (sem corpo{})
abstract class Forma {
    abstract double area();
    abstract double perimetro();
}

//classe circulo que é filha de forma e requer apenas o raio como atributo
class Circulo extends Forma {
    double raio;
    
    //construtor da classe
    Circulo(double raio) {
        this.raio = raio;
    }
    
    //método herdado sobrescrito para calcular a área do círculo
    @Override
    double area() {
        return Math.PI * raio * raio;
    }
    
    //método herdado sobrescrito para calcular o perímetro do círculo
    @Override
    double perimetro() {
        return 2 * Math.PI * raio;
    }
}

//classe retangulo que é filha de forma e requer comprimento e largura como atributos
class Retangulo extends Forma {
    double comprimento;
    double largura;
    
    //construtor da classe
    Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    //método herdado sobrescrito para calcular a area do retagulo
    @Override
    double area() {
        return comprimento * largura;
    }

    //método herdado sobrescrito para calcular o perimetro do retagulo
    @Override
    double perimetro() {
        return 2 * (comprimento + largura);
    }
}

//classe triangulo que é filha de forma e requer base e altura como atributos

class Triangulo extends Forma {
    double base;
    double altura;
    
    //construtor da classe
    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //método herdado sobrescrito para calcular a area do triangulo
    @Override
    double area() {
        return 0.5 * base * altura;
    }
    
    //método herdado sobrescrito para calcular o perimetro do triangulo
    @Override
    double perimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}

//método para executar
public class FormasGeometricas {
    public static void main(String[] args) {

        //instanciando uma forma de cada
        Circulo circulo = new Circulo(5);//passando 5 de raio para o circulo
        Retangulo retangulo = new Retangulo(4, 6);// passando 4 de comprimento e 6 de largura para o retangulo
        Triangulo triangulo = new Triangulo(3, 4);//passando 3 de base e 4 de altura para o triangulo
        
        //CIRCULO
        System.out.println("Área do Círculo: " + circulo.area());//imprimindo na tela o resultado do método area
        System.out.println("Perímetro do Círculo: " + circulo.perimetro());//imprimindo na tela o resultado do método perimetro
        
        //RETANGULO
        System.out.println("Área do Retângulo: " + retangulo.area());//imprimindo na tela o resultado do método area
        System.out.println("Perímetro do Retângulo: " + retangulo.perimetro());//imprimindo na tela o resultado do método perimetro
        
        //TRIANGULO
        System.out.println("Área do Triângulo: " + triangulo.area());//imprimindo na tela o resultado do método area
        System.out.println("Perímetro do Triângulo: " + triangulo.perimetro());//imprimindo na tela o resultado do método perimetro
    }
}