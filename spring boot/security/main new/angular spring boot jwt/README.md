# 🌆 Tech City

**Tech City** é um aplicativo de gestão urbana desenvolvido como projeto da faculdade **FIAP**. Ele permite que os habitantes de uma cidade registrem ocorrências do dia a dia, como acidentes, alagamentos, falta de energia e outros problemas, promovendo uma gestão mais eficiente e transparente da cidade. 🏙️✨

---

## 🛠 Tecnologias Utilizadas

### Back-end
- **Java** com **Spring Boot**
- **JWT** para autenticação e segurança 🔐
- **PostgreSQL** como banco de dados relacional 🗄️
- REST API estruturada para integração com o front-end 📡

### Front-end
- **Angular** 🅰️
- **Serviços Angular (`HttpClient`)** para comunicação com a API
- **Data Binding**:
  - Interpolation: `{{ }}`
  - Property Binding: `[ ]`
  - Event Binding: `( )`
  - Two-way Binding: `[( )]`
- **Diretivas Angular**:
  - Estruturais: `*ngIf`, `*ngFor`  
  - Atributo: `[ngClass]`, `[ngStyle]`  

---

## 📌 Funcionalidades

- Cadastro de ocorrências públicas pela população 📝
- Diferenciação de tipos de ocorrências:  
  - 🚨 Acidentes  
  - 🌊 Alagamentos  
  - 💡 Falta de energia  
  - 🔥 Incêndios  
  - 🌳 Outros problemas urbanos
- Sistema de login e autenticação com JWT 🔐
- Interface interativa com Angular, incluindo formulários dinâmicos e cards de ocorrências

---

## 📂 Estrutura do Projeto

Tech City/
├── backend/ (API Java Spring Boot)
│ ├── src/main/java
│ ├── src/main/resources
│ └── pom.xml
├── frontend/ (App Angular)
│ ├── src/app
│ ├── src/assets
│ └── angular.json
└── README.md

---

## 🚀 Como Rodar o Projeto

### Back-end
1. Configurar o PostgreSQL e criar o banco de dados.
2. Atualizar o arquivo `application.properties` com credenciais do banco.
3. Rodar a aplicação Spring Boot:
./mvnw spring-boot:run

### Front-end
Navegar até a pasta do Angular:
cd frontend

Instalar dependências:
npm install

Rodar o servidor de desenvolvimento:
ng serve

Acessar via navegador:
http://localhost:4200

🌟 Próximos Passos / Melhorias

Notificações em tempo real para ocorrências críticas 📲

Dashboard com estatísticas e gráficos 📊


🤝 Contribuição
Contribuições são bem-vindas! Se você quiser contribuir com o projeto, faça um fork, crie sua branch, e envie um pull request.

📜 Licença
Este projeto está sob a licença MIT.

💚 Desenvolvido com ❤️ por Matheus, Maria, Eduarda e Egon, como projeto da FIAP.
