# Config Repo - Spring Cloud Config

Estrutura:
- application.properties -> configurações compartilhadas
- account-service-dev.properties -> configs do account-service em dev
- account-service-prod.properties -> configs do account-service em prod

**Como usar**
- Aponte o Config Server para este repositório (ou subpasta) via `spring.cloud.config.server.git.uri` e `search-paths` se precisar.
- Para proteger secrets, use criptografia do Config Server (`/encrypt`) ou integre com Vault.
