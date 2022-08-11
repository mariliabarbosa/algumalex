package algumalex;

public class AlgumaLex {
    public static void main(String[] args) {
        AlgumaLexico lex = new AlgumaLexico("./././programa.alguma");
        Token t = null;
        while((t=lex.proximoToken()).nome != TipoToken.Fim) {
            System.out.print(t);
        }
    }
}
