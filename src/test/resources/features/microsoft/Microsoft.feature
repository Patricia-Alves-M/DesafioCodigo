#language: pt
Funcionalidade: Navegar no site da Microsoft
   
  Cenario:  Navegar no Menu Windows
    Dado que acesso o site Microsoft
    E Valide se todos os itens do menu estão presentes - Microsoft 365 - Windows - Surface - Xbox – Deals – Small Business - Support
    E acesse o Menu Windows
  	E acesse o subMenu About Windows
    E imprima os elementos do menu suspenso
    E acesse o menu Pesquisa
    E pesquise por Visual Studio
    E imprima o preço o item selecionado
    E armazene o preço
    E clique no botão Obter Assinatura
    E valide se ambos os preços NÃO são os mesmos
    E Clique no botão Adicionar ao carrinho
    E Verifique se todos os 3 valores de preço Individual, Itens, Total são os mesmos
    E acesse o menu suspenso N de itens 
    E selecione 20 e valide se o valor total é Preço unitário multiplicado por 20
 
  
    
 