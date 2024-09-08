<h1>This project has make to programação 1 in my graduaduation</h1>

### Description

In projected i will make a micro system using concptions of POO.

# My structure
Produtos
|Name|Type|
| --- | --- |
| Código | String |
| Nome  | String |
| Valor  | Double |
| Quantidade_disponivel_estoque | int |

|Metodos|
|---|
|Adiconar_estoque()|
|Remover_estoque()|

Loja
|Name|Type|
| --- | --- |
| Codigo | String |
| Nome_fantasia | String |
| Tipo | Enum |
| CNPJ | String |
| Telefone | String |
| Endereço | String |

|Name|Type|
| --- | --- |
| Nome | String |
| Data_nascimento | String |
| Endereco | String |
| Telefone | String |
| CPF | String |

Vendedor extends Pessoa
|Name|Type|
| --- | --- |
| Numero_ctpis | INT |
| Salario | Double |
| Turno | Enum |

# Serviçes 
+ **Serviço de vendas**: In this service the vendedor makes sales to client, in sales service check a repository on have products to sale, and confirm status.

+ **Atendimento ao cliente**: This have troubleshooting, check warranty, and make complaints.
