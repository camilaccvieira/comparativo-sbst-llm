# comparativo-sbst-llm

Este projeto foi desenvolvido como atividade prática para a disciplina de Inteligência Artificial na Engenharia de Software no curso de especialização em Gerência de Projetos de Software na Era de Dados de Sensores e IA (UFJF).

O objetivo é comparar a eficácia de testes gerados por algoritmos evolutivos (SBST) e Inteligência Artificial Generativa (LLM) utilizando a análise de mutantes (PITest).

🛠️ Tecnologias e Ferramentas
Ambiente: GitHub Codespaces (Cloud IDE)

Linguagem: Java 17

Framework de Teste: JUnit 4.13.2

Análise de Mutantes: PITest 1.15.0

📁 Estrutura do Projeto
StringHelper.java: Classe principal contendo lógicas de manipulação de strings, palíndromos e truncamento.

/evosuite: Contém a suíte de testes gerada com foco em cobertura estrutural (Branch Coverage).

/llm: Contém a suíte de testes gerada via LLM (ChatGPT), focando em legibilidade e casos de borda semânticos.

🚀 Como Executar 
Abra este repositório no GitHub Codespaces.

No terminal, baixe as dependências necessárias:

Bash
# JUnit e Hamcrest
wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
Compile o projeto e os testes:

Bash
javac -cp ".:junit-4.13.2.jar" StringHelper.java llm/StringHelperTest.java
Execute os testes via JUnit:

Bash
java -cp ".:llm:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore StringHelperTest
📊 Resultados Obtidos (PITest)
De acordo com a execução realizada no ambiente Codespaces:

Line Coverage: 75%

Mutation Score: 67% (8/12 mutantes mortos)

Test Strength: 89%
