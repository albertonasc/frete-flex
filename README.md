# Projeto - FreteFlex
## Sistema de Cálculo de Frete
<p align="justify">FreteFlex é um sistema de cálculo de frete que permite aos usuários calcular o custo de envio de pacotes utilizando diferentes estratégias de cálculo de frete. O sistema oferece duas principais opções de frete: Standard (Normal) e Express (Expresso). Cada opção utiliza uma fórmula diferente para calcular o custo com base no peso do pacote e na distância de envio.</p>

### Regras de Negócio
- Tipos de Frete:
 - Frete Standard (Normal):
   - Fórmula de cálculo: custo = peso * 1.0 + distância * 0.5
   - Este tipo de frete oferece um custo mais acessível, adequado para entregas que não têm urgência.
 - Frete Express (Expresso):
   - Fórmula de cálculo: custo = peso * 1.5 + distância * 0.75
   - Este tipo de frete é mais caro, mas oferece uma entrega mais rápida e prioritária.
  
 - Parâmetros de Entrada:
   - Peso do Pacote (weight): O peso do pacote em quilogramas (kg).
   - Distância de Envio (distance): A distância total a ser percorrida para a entrega, em quilômetros (km).
   - Tipo de Frete (type): O tipo de frete desejado. Pode ser "standard" ou "express".
 -  Processo de Cálculo de Frete:
    - O usuário fornece o peso, a distância do pacote e o tipo de frete.
    - O sistema seleciona a implementação apropriada do ShippingCalculator (Standard ou Express) com base no tipo de frete escolhido. 
    - O custo é calculado com base na fórmula associada ao tipo de frete selecionado.
 - Endpoint REST:
   - GET /shipping/calculate: Endpoint para calcular o custo de frete.
  - Parâmetros de consulta:
    - weight: Peso do pacote.
    - distance: Distância de envio.
    - type: Tipo de frete ("standard" ou "express").
  - Retorna:
    - shippingCost: O custo calculado do frete.



