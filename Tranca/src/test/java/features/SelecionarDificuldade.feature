#language: pt

@MudarConfiguracoes
Funcionalidade: Mudar as configurações do jogo

  @MudarDificuldade
  Cenário: Mudar a dificuldade do jogo
    Dado que ignoro o login automático
    E que eu abro as configurações
    E que eu abro as opções de dificuldade
    Então seleciono o nível Médio