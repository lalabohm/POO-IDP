## Agrupador de Cidades por UF

Este projeto implementa um sistema para agrupar e gerenciar cidades por Unidade Federativa (**UF**). Ele realiza três tipos de operações principais, descritas nas estruturas abaixo.

---

### Estrutura 1
- Agrupa cidades por UF.
- Imprime as cidades de cada UF em ordem alfabética.

---

### Estrutura 2
- Lista as cidades de uma UF específica.
- Exibe as capitais primeiro, seguidas pelas demais cidades em ordem alfabética.

---

### Estrutura 3
- Lista todas as cidades de forma global.
- A listagem é feita em ordem alfabética decrescente.

---

🔧 ## Como Funciona

### Classes Principais
- **AgrupadorCidades**: Gerencia o agrupamento e ordenação das cidades.
- **Cidade**: Representa os dados de uma cidade (nome e se é capital ou não).

### Estruturas de Dados Utilizadas
- `Map<String, List<Cidade>>`: Para agrupar cidades por UF.
- `TreeSet<Cidade>`: Para armazenar todas as cidades em ordem alfabética decrescente.
