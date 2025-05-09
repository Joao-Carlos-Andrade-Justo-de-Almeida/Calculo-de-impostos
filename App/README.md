# 💰 Calculadora de Impostos - Projeto Java

Este projeto Java simula um sistema de cálculo de impostos para contribuintes, com regras específicas para **pessoas físicas** e **pessoas jurídicas**.

---
## 📌 Funcionalidades

- Cadastro de contribuintes (Pessoa Física ou Jurídica)
- Cálculo automático do imposto devido
- Descontos para pessoas físicas com gastos em saúde
- Listagem dos impostos pagos
- Cálculo do total de impostos arrecadados

---

## 🧮 Regras de Cálculo

### Pessoa Física
- **Renda ≤ R$ 20.000,00**: taxa de **15%**
- **Renda > R$ 20.000,00**: taxa de **25%**
- **Dedução**: 50% das despesas médicas

### Pessoa Jurídica *(opcional)*
- **Imposto fixo de 16%**
- **Desconto** de 14% se tiver mais de 10 funcionários

---

## ▶️ Como Executar

Exemplo de Entrada

Digite o número de contribuinte: 2  
Contribuinte #1  
Individual ou Empresa (i/e): i  
Nome: João  
Renda Anual: 18000  
Despesas com saúde: 2000

Contribuinte #2  
Individual ou Empresa (i/e): i  
Nome: Maria  
Renda Anual: 30000  
Despesas com saúde: 1000

## 📤 Saída Esperada
IMPOSTOS PAGOS:  
João: R$ 1700.00  
Maria: R$ 7300.00

Soma total da renda anual: `R$ 48000.00`  
Total de impostos pagos: `R$ 9000.00`