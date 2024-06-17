# API de Gestão de Funcionários MGS

Esse é o projeto final da disciplina de Programação Orientada a Objeto em Java, onde foi solicitado a criação de uma API REST para gerenciamento de funcionários da empresa MGS. 

## Contextualização

A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

## Objetivo

Implementar uma API REST que permita o gerenciamento das informações dos empregados por meio de requisições HTTP. Deve ser possível, pelo menos, inserir (POST) e obter os dados (GET). Não é necessário implementar persistência, ou seja, quando o sistema for interrompido os dados serão perdidos.

## Funcionalidades

- Adicionar um novo funcionário com suas informações associadas (alergias, problemas médicos, telefones e e-mails de contato);
- Obter as informações de um funcionário por meio de seu ID;

## Como usar

### Pré-requisitos

- JDK 21 (Java Development Kit) instalado
- Maven instalado
- Postman

### IDE utilizada para o projeto
- SpringBoot;

### Executando o projeto

1. Clone este repositório através do comando: 
`git clone https://github.com/barlettab/api_mgs.git`
ou faça o download do código-fonte como arquivo ZIP e extraia-o
2. Importe o projeto para sua IDE Java preferida (Eclipse, NetBeans, IntelliJ, etc)
3. Execute o projeto a partir da classe principal MgsApplication.java
4. Abra o Postman

### Adicionar um novo funcionário (POST)

1. **Crie uma nova requisição:**
   - Clique em "New" e selecione "HTTP Request".

2. **Configurar a requisição:**
   - **Método:** Selecione `POST`.
   - **URL:** Digite `http://localhost:8080/employees`.

3. **Adicionar Cabeçalhos:**
   - Clique na aba "Headers" e adicione um novo cabeçalho:
     - **Key:** `Content-Type`
     - **Value:** `application/json`

4. **Adicionar o Corpo da Requisição:**
   - Clique na aba "Body".
   - Selecione "raw".
   - Selecione "JSON" no menu dropdown à direita.
   - Adicione o JSON com os dados do funcionário no campo de texto:
     ```json
     {
         "id": "1",
         "nome": "José da Silva",
         "alergia": ["Amendoim", "Carne de Porco"],
         "probMed": ["Asma"],
         "telefone": ["123456789", "987654321"],
         "email": ["josesilvin@example.com", "jsilva@workmail.com"]
     }
     ```

5. **Enviar a Requisição:**
   - Clique em "Send" e verifique a resposta.

### Obtendo Informações de um Funcionário (GET)

1. **Crie uma nova requisição:**
   - Clique em "New" e selecione "HTTP Request".

2. **Configurar a requisição:**
   - **Método:** `GET`
   - **URL:** `http://localhost:8080/employees/{id_do_funcionario}`
   - Substitua `{id_do_funcionario}` pelo ID do funcionário cadastrado (por exemplo, `1`).

3. **Enviar a Requisição:**
   - Clique em "Send" e verifique a resposta.
