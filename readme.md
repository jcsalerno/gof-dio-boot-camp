# Explorando Padrões de Projetos na Prática com Java

Este repositório contém implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Neste projeto, utilizamos Java puro para demonstrar como aplicar três padrões de design populares em um sistema básico de gerenciamento de pedidos de uma loja online.

## Padrões de Projeto

### Singleton
O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. É útil em situações onde é necessário um único objeto para coordenar ações em todo o sistema, como em gerenciadores de configuração ou conexões com banco de dados.

### Strategy
O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Este padrão permite que o algoritmo varie independentemente dos clientes que o utilizam. É ideal para situações onde múltiplos métodos de execução são necessários para uma tarefa específica.

### Facade
O padrão Facade fornece uma interface simplificada para um conjunto complexo de interfaces em um subsistema. Ele facilita a utilização de sistemas complexos ao fornecer uma interface mais simples, escondendo a complexidade do sistema subjacente.

## Estrutura do Projeto

```src/
├── main/
│ └── java/
│ └── com/
│ └── exemplos/
│ └── padroesdeprojeto/
│ ├── singleton/
│ │ └── DatabaseConnection.java
│ ├── strategy/
│ │ ├── PaymentStrategy.java
│ │ ├── CreditCardPayment.java
│ │ └── PayPalPayment.java
│ ├── facade/
│ │ └── OrderFacade.java
│ ├── Order.java
│ └── Main.java
└── test