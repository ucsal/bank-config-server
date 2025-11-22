# bank-config-server
Repositório para atividade avaliativa utilizando Spring Clound para a matéria de Arquitetura de Software de Fernando Cezar

# Respostas das perguntas do form

## a)

A configuração externalizada, conforme a documentação do Spring, permite o desenvolvimento e a execução da mesma aplicação em diferentes cenários e ambientes. O Spring Boot facilita essa externalização para que você possa trabalhar com o mesmo artefato em diversos ambientes. Ele suporta uma variedade de fontes externas (como variáveis de ambiente Java, argumentos de linha de comando – CLI, e arquivos YAML). Esses valores são injetados diretamente nas classes Beans usando a anotação @Value, acessados por meio de abstrações do Environment, ou mapeados em objetos estruturados via @ConfigurationProperties.

Por outro lado, nas configurações centralizadas, todas as aplicações acessam o mesmo Config Server para buscar suas propriedades, garantindo que o conjunto de serviços e artefatos de código de um determinado ambiente (ex: produção e desenvolvimento) esteja em um estado de configuração consistente.

## b)

Pode-se notar o tamanho da importância dos Config Server em um sistema bancário com múltiplos ambientes. Algumas das razões para isso são: segurança e conformidade, consistência de configuração, Hot Reload e isolamento de erros e estabilidade. 

- Segurança e Conformidade: Credenciais confidenciais são armazenadas de forma segura e cifrada no repositório do Config Server.

- Consistência de Configuração: Garante que o mesmo código-fonte possa ser implantado em todos os ambientes (Desenvolvimento, Homologação, Produção), com as únicas diferenças sendo as propriedades específicas do ambiente.

- Hot Reload: Justificado pela alta disponibilidade que o banco precisa ter, o Config Server permite atualizar configurações sem a necessidade de reiniciar os microsserviços.

- Isolamento de Erros e Estabilidade: Garante que, caso um serviço falhe devido a uma configuração incorreta, essa falha fique isolada na camada de configuração e não se propague para o código-fonte, prevenindo cascatas de falhas.


# Realizado por: 
- Filipe da Conceição Santana
- João Vitor Ferreira Peixoto
