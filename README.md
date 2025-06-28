# 🍽️ LAPES Backend - Sistema de Restaurante

Este é o backend do sistema de gerenciamento de restaurante, desenvolvido em **Spring Boot** com persistência em **MySQL**. Ele oferece endpoints REST para autenticação, gestão de cardápio, pedidos, avaliações e painéis administrativos.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Security
- Spring Data JPA
- Bean Validation
- Lombok
- MySQL Driver
- DevTools (para hot reload)

---

## 🔧 Configuração do Projeto

### 📁 Pré-requisitos

- Java 17+
- Maven
- MySQL 8+
- IDE (recomendado: VS Code, IntelliJ, Eclipse)

### ⚙️ Configuração do banco de dados

1. Crie um banco no MySQL:

```sql
CREATE DATABASE lapes_db;

Copie o arquivo de exemplo de configuração:
cp src/main/resources/application.properties.example src/main/resources/application.properties

Edite o arquivo application.properties com as credenciais do seu banco local:
spring.datasource.url=jdbc:mysql://localhost:3306/lapes_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

🧪 Rodando localmente
No terminal, na pasta backend/:
./mvnw spring-boot:run

🛡️ Segurança
Autenticação com Spring Security

Suporte a roles para proteger rotas

Tokens JWT

Validação de entrada com Bean Validation
