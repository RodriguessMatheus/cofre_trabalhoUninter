package cofrinho;

import java.util.ArrayList;

//Classe que gerencia as moedas
public class cofrinho {

 private ArrayList<moeda> listaMoedas = new ArrayList<>();

 // Adiciona moeda
 public void adicionar(moeda moeda) 
 {
     listaMoedas.add(moeda);
 }

 // Remove moeda pelo valor (primeira que encontrar)
 public void removerPorValor(double valor) 
 {
     for (moeda m : listaMoedas) 
     {
         if (m.valor == valor) {
             listaMoedas.remove(m);
             System.out.println("Moeda removida!");
             return;
         }
     }
     System.out.println("Moeda não encontrada!");
 }

 // Lista moedas
 public void listarMoedas() 
 {
     if (listaMoedas.isEmpty()) {
         System.out.println("Cofrinho vazio!");
         return;
     }

     for (moeda m : listaMoedas) 
     {
         m.info(); // polimorfismo
     }
 }

 // Soma total convertido em real
 public double totalConvertido() 
 {
     double total = 0;

     for (moeda m : listaMoedas) 
     {
         total += m.converter(); // polimorfismo
     }

     return total;
 }
}