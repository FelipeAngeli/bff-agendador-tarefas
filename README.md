# BFF Agendador de Tarefas

Este é um projeto Backend for Frontend (BFF) desenvolvido em Spring Boot para gerenciamento e agendamento de tarefas.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.3
- Spring Cloud 2024.0.0
- OpenFeign para comunicação entre serviços
- Swagger/OpenAPI para documentação da API
- Lombok para redução de boilerplate
- Maven como gerenciador de dependências

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven
- Git

## 🔧 Instalação e Execução

1. Clone o repositório:
```bash
git clone [URL_DO_REPOSITÓRIO]
```

2. Navegue até o diretório do projeto:
```bash
cd bff-agendador-tarefas
```

3. Execute o projeto usando Maven:
```bash
./mvnw spring-boot:run
```

## 📚 Documentação da API

A documentação da API está disponível através do Swagger UI. Após iniciar a aplicação, acesse:
```
http://localhost:8080/swagger-ui.html
```

## 🏗️ Estrutura do Projeto

O projeto segue uma arquitetura limpa com as seguintes camadas:

- `controller`: Camada de apresentação, responsável por receber e processar requisições HTTP
- `business`: Camada de negócios, contendo a lógica de domínio
- `infrastructure`: Camada de infraestrutura, responsável por integrações externas e persistência

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença [inserir tipo de licença]. Veja o arquivo `LICENSE` para mais detalhes.

## ✨ Características

- API RESTful
- Documentação automática com Swagger
- Integração com serviços externos via Feign
- Arquitetura limpa e modular
- Suporte a testes automatizados

## 📫 Contato

[Inserir informações de contato do mantenedor do projeto] 