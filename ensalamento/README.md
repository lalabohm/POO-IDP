# Sistema de Ensalamento

Este projeto é uma aplicação em Java que simula a alocação de alunos em turmas de uma instituição de ensino, levando em consideração cursos, disciplinas, alunos e professores. A estrutura do projeto segue os princípios da Programação Orientada a Objetos (POO).

## Funcionalidades

- **Cadastro de Alunos**: Alunos são associados a um curso e podem ser alocados em turmas específicas.
- **Cadastro de Professores**: Professores são associados a disciplinas e turmas.
- **Criação de Turmas**: Cada turma possui uma disciplina, um professor responsável e alunos alocados.
- **Associação de Cursos e Disciplinas**: Os cursos possuem disciplinas, e os alunos podem se matricular nas disciplinas oferecidas.

## Estrutura do Projeto

O projeto é dividido em diversas classes, cada uma representando um aspecto do sistema de ensalamento:

- `Main.java`: Classe principal que inicializa o programa e gerencia o fluxo de interação entre as diferentes classes.
- `Aluno.java`: Representa os alunos no sistema, com atributos como nome, matrícula e curso.
- `Professor.java`: Representa os professores, com informações sobre as disciplinas que lecionam.
- `Curso.java`: Define um curso com sua lista de disciplinas e alunos.
- `Disciplina.java`: Representa as disciplinas oferecidas pelos cursos.
- `Turma.java`: Representa uma turma, contendo uma lista de alunos e a disciplina associada.
- `Ensalamento.java`: Gerencia o processo de alocação de alunos em turmas.
- `Pessoa.java`: Superclasse para as classes `Aluno` e `Professor`, contendo atributos comuns como nome e documento de identificação.
