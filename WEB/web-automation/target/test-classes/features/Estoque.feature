# language: pt
# author: gabriel.dias@outlook.com
Funcionalidade: Listar estoque de vendedor no siteWebmotors

  @ListarEstoque
	Cenario: Listar estoque de um vendedor a partir dos detalhes de um veiculo
		Dado que esteja na tela de busca da WEBMOTORS
    Quando pesquisar por "Honda" no filtro de Marcas
    E pesquisar por "City" no filtro de Modelos
    Quando abrir os detalhes do primeiro veiculo nos resultados de pesquisa
    E clicar para ver todos os carros do vendedor
    Entao retornar para a tela de resultados de pesquisa somente com os carros do vendedor
    
  		
