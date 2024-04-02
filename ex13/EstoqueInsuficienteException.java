package ex13;

class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
