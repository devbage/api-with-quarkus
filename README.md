# api-with-quarkus

Projeto utilizado na talk:
 > Iniciando um novo projeto em Java (do hello World a API com Quarkus)

### Stack tecnológica utilizada
 - Java
 - Quarkus
 - Panache-ORM
 - RESTEasy
 - PostgreSql
 - Apache Maven 3.5.3+
 
### Pré-requisitos e configuração para desenvolvimento
 - [Apache Maven 3.5.3+](https://maven.apache.org/)
 - [Openjdk 1.8+ instalada com o JAVA_HOME configurado](https://adoptopenjdk.net/)
 - Alguma [IDE](https://www.jetbrains.com/idea/download) ou [Editor de código](https://code.visualstudio.com/)
  
### Complexidade de desenvolvimento
  - Inciante
  
### Rodando
Criar o banco de dados no postgreSQL chamado:
```
 ola
```

Dentro da raiz do projeto digite o seguinte comando:
  ```
  ./mvnw compile quarkus:dev.
  ```
  
### Release
* 0.0.1
    * Inicio do projeto e endPoint Olá mundo
* 0.0.2
    * Adicionando panache-orm, postgreSQL, camada de modelo e servive


  
### Autor

* **Rodrigo Freitas Java** - [@__RFreitas](https://twitter.com/__RFreitas) – rodrigofreitas.java@gmail.com

### Licença

Esse projeto está licenciado com a a licença MIT 

### Como contribuir

 >1. Fork (<https://github.com/yourname/yourproject/fork>)
 >2. Crie uma branch com a funcionalidade (`git checkout -b feature/fooBar`)
 >3. Commit suas mudanças (`git commit -am 'Add some fooBar'`)
 >4. Faça push da sua branch  (`git push origin feature/fooBar`)
 >5. Crie um novo Pull Request

### Agradecimentos

* A toda comunidade devBagé que tem nos inspirado a dar os próximos passos.
