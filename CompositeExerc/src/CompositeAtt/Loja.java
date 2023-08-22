package CompositeAtt;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Produto {
 private String nome;
 private List<Produto> produtos = new ArrayList<>();

 public Loja(String nome) {
     this.nome = nome;
 }

 public void adicionarProduto(Produto produto) {
     produtos.add(produto);
 }

 @Override
 public double getPreco() {
     double total = 0;
     for (Produto produto : produtos) {
         total += produto.getPreco();
     }
     return total;
 }

 @Override
 public void exibirInformacoes() {
     System.out.println("Loja: " + nome);
     System.out.println("Seus produtos :");

     for (Produto produto : produtos) {
         produto.exibirInformacoes();
     }
 }
}
