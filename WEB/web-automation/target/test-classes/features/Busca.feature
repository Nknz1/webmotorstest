# language: pt
# author: gabriel.dias@outlook.com
Funcionalidade: Validar o filtro MARCA no site WEBMOTORS

  @RealizarBuscaMARCA
  Cenario: Realizar busca por MARCA
		Dado que esteja na tela de busca da WEBMOTORS
		Quando clico no botao VER TODAS AS MARCAS
		Entao retornar apenas veículos da marca "Honda"

  @ValidarTituloPaginaMarca
  Cenario: Validar o titulo da PAGINA Marca
		Dado que esteja na tela de busca da WEBMOTORS
		Quando seleciono a marca "Honda"
		Entao retornar o titulo da pagina igual a "Honda | Webmotors"
		
	@RealizarBuscaModelo
  Cenario: Realizar busca por MODELO
		Dado que esteja na tela de busca da WEBMOTORS
		Quando seleciono marca e modelo "Honda","City"
		Entao retornar apenas os veículos do modelo "HONDA CITY"

	@ValidarTituloPaginaModelo
  Cenario: Validar o titulo da PAGINA
		Dado que esteja na tela de busca da WEBMOTORS
		Quando seleciono marca e modelo "Honda","City"
		Entao retornar o titulo da pagina como "Honda City | Webmotors"

	@RealizarBuscaModeloModelo
  Cenario: Validar o titulo da PAGINA Modelo
		Dado que esteja na tela de busca da WEBMOTORS
		Quando seleciono marca e modelo "Honda","City"
		Entao retornar o titulo da pagina como "Honda City | Webmotors"
		
	@ValidarBuscaModeloEVersao
  Cenario: Validar busca por MODELO e filtrar por VERSAO
		Dado que esteja na tela de busca da WEBMOTORS
		Quando seleciono marca e modelo "Honda","City"
		Entao exibir apenas os veículos na versao "1.5 DX 16V FLEX 4P MANUAL"
    
  		
