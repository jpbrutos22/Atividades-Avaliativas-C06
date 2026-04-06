# Atividades-Avaliativas-C06

Nome: João Paulo de Moura Brandão
Curso: Engenharia da Computação
Matrícula: 2288

Durante o desenvolvimento do projeto, usei IA para me ajudar no entendimento de getters e setters.

Meu Prompt: "Olá Chat, estou com dificuldade para aplicar getters e setters no meu projeto, (enivei prints do projeto) como eu aplicaria
os getters e setters para a classe "Computador", me explique resumidamente por favor."

Resposta: 

**🔑 O que são getters e setters?

São métodos usados para acessar e modificar atributos privados de uma classe.

🔒 Por que eles existem?

Em POO, os atributos são private (encapsulados), então:

👉 você não acessa diretamente
👉 usa métodos controlados

📥 Setter (definir valor)
```
public void setPreco(float preco) {
    this.preco = preco;
}
```
👉 Serve para alterar o valor

🧠 Tradução:

“Defina o preço do objeto”

📤 Getter (obter valor)
```
public float getPreco() {
    return preco;
}
```
👉 Serve para pegar o valor

🧠 Tradução:

“Me diga qual é o preço”

🔄 Exemplo rápido
```
pc.setPreco(3000);     // define
float valor = pc.getPreco(); // pega
```
🔥 Resumo (pra prova)

👉 Getter → retorna valor
👉 Setter → modifica valor
👉 Ambos protegem os dados (encapsulamento)**

Exemplo dado na classe "Computador": 
```
public class Computador {
    private float preco;
    private SistemaOperacional sistema;

    // Setter
    public void setSistemaOperacional(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    // Getter
    public float getPreco() {
        return preco;
    }
}
``` 

Neste exemplo:

O método setSistemaOperacional permite definir o sistema operacional do computador.
O método getPreco permite acessar o valor do preço de forma controlada.

Esses métodos são fundamentais para garantir o princípio de encapsulamento, evitando acesso direto aos atributos da classe.
