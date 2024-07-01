import java.util.*;
 
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
 
        // Loop para solicitar números e registrar a frequência
        while (true) {
            System.out.println("Digite um número entre 0 e 100 (fora do intervalo para encerrar): ");
            int number = scanner.nextInt();
 
            if (number < 0 || number > 100) {
                System.out.println("Programa encerrado.");
                break;
            }
 
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
 
        // Modifica os valores de acordo com as regras
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            int newValue = frequency <= 5 ? 5 : 10;
            frequencyMap.put(key, newValue);
        }
 
        // Converte o mapa em uma lista
        List<Integer> resultList = new ArrayList<>(Collections.nCopies(101, 5)); // inicializa com valor padrão 5
        for (int key : frequencyMap.keySet()) {
            resultList.set(key, frequencyMap.get(key));
        }
 
        // Imprime a lista resultante
        System.out.println("Lista resultante:");
        for (int i = 0; i <= 100; i++) {
            System.out.println("Número: " + i + ", Valor: " + resultList.get(i));
        }
    }
}