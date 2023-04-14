// Tipos de variáveis em Java
/*
 String -> Armazena texto
 char -> Armazena uma única letra
 int -> Números Inteiros
 float -> némeros decimais
 double -> números decimais. Maior precisão
 */

 /*
  Toda variável DEVE começar com letra minuscula
  Não pode haver espaço no nome da variável
  nomeAluno, enrecoCliente, produtoAdquirido
  */



    

 public class Ex1{
    public static void main(String[] args) {


        String nome = "Kauã da Silva Lazarim";
        int idade = 16;
        String endereco = "Rua Azevedo do Gustavo Molina 645 - Bairro Edgar dos sites - SP";
        char civil = 'S'; 
        float altura = (float) 1.73; //Estou convertendo um double para float
        String tel = "(11) 98765-4321";
        String crush = "Lana Negrini";


        System.out.println("Meu nome é: "+nome);
        System.out.println("minha idade é: "+idade+" Anos");
        System.out.println("Eu tenho: "+altura+" Metros");
        System.out.println("Telefone: "+tel);
        System.out.println("Endereço: "+endereco);
        System.out.println("Estado Civil: "+civil);
        System.out.println("Minha Crush é: "+crush);
       





        
    }

 }