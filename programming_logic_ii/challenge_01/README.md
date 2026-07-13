````markdown
# Refatoração: Estrutura de Alunos

## Objetivo

Refatorar a implementação para substituir o uso de arrays paralelos por uma estrutura orientada a objetos, encapsulando os dados e a lógica de cálculo na classe `Aluno`.

---

## Contexto

A versão inicial (excercise-01) armazenava os dados dos alunos em dois arrays distintos:

- `String[] alunos` → nomes dos alunos;
- `double[][] notas` → notas GA e GB.

O cálculo da média ponderada era realizado diretamente na classe `Main`.

### Implementação anterior

```java
String[] alunos = {"Ana", "Bruno", "Carla"};

double[][] notas = {
    {8.0, 9.0},
    {6.5, 7.0},
    {5.0, 6.5}
};

for (int i = 0; i < alunos.length; i++) {
    double ga = notas[i][0];
    double gb = notas[i][1];
    double grauFinal = (ga * 0.3333) + (gb * 0.6667);

    System.out.printf("%s : %.2f%n", alunos[i], grauFinal);
}
```

---

## Problema

A implementação apresentava algumas limitações:

- Informações de um mesmo aluno estavam distribuídas em estruturas diferentes.
- O cálculo da média estava acoplado à classe `Main`.
- A manutenção se tornava mais difícil caso novos atributos fossem adicionados.
- O código não aproveitava conceitos básicos de orientação a objetos.

---

## Solução

Foi criada a classe `Aluno`, responsável por:

- armazenar o nome;
- armazenar as notas GA e GB;
- calcular o grau final do aluno.

A classe `Main` passou a ser responsável apenas por criar os objetos e exibir os resultados.

---

## Estrutura Atual

```
challenge_01
│
├── Main.java
└── Aluno.java
```

---

## Principais Alterações

### Antes

- Utilização de dois arrays (`String[]` e `double[][]`);
- Cálculo da média realizado na classe `Main`;
- Dados e comportamento separados.

### Depois

- Utilização de um único array de objetos `Aluno`;
- Cálculo encapsulado no método `calcularGrauFinal()`;
- Dados e comportamento reunidos na mesma classe.

---

## Melhorias Implementadas

### Encapsulamento

As informações do aluno passaram a pertencer ao próprio objeto.

```java
private final String nome;
private final double ga;
private final double gb;
```

---

### Responsabilidade da Classe

O cálculo da média foi movido para o método:

```java
public double calcularGrauFinal()
```

Dessa forma, a classe `Main` não precisa conhecer a fórmula utilizada.

---

### Uso de Constantes

Os pesos da média passaram a ser definidos como constantes locais:

```java
final double PESO_GA = 1.0 / 3.0;
final double PESO_GB = 2.0 / 3.0;
```

Isso melhora a legibilidade e facilita futuras alterações.

---

### Enhanced For

O laço tradicional foi substituído pelo `for-each`, tornando a iteração mais simples.

Antes:

```java
for (int i = 0; i < alunos.length; i++)
```

Depois:

```java
for (Aluno aluno : alunos)
```

---

### Imutabilidade

Os atributos da classe `Aluno` foram declarados como `final`, impedindo alterações após a criação do objeto.

---

## Benefícios da Refatoração

- Melhor organização do código;
- Separação de responsabilidades;
- Maior legibilidade;
- Facilidade de manutenção;
- Código mais alinhado aos princípios de orientação a objetos;
- Maior facilidade para futuras extensões (ex.: matrícula, disciplina, frequência, etc.).

---

## Impacto

A refatoração não altera o comportamento da aplicação.

A saída permanece:

```text
Ana : 8.67
Bruno : 6.83
Carla : 6.00
```

---

## Conclusão

A alteração substitui uma estrutura baseada em arrays paralelos por uma modelagem orientada a objetos, tornando o código mais organizado, reutilizável e preparado para futuras evoluções, sem modificar o resultado produzido pela aplicação.
````
