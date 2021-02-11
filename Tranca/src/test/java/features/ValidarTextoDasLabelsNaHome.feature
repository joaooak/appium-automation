#language: pt

@ValidarTextoDasLabelsNaHome
Funcionalidade: Validar a escrita e tradução das Labels na Home

  @LabelsHome
  Esquema do Cenário: Validação das Labels da tela inicial
    Dado que estou com o idioma "<linguagem>" e "<local>" ativado
    Então valido o botão jogar agora "<play>"
    Então valido o botão jogar com pessoas "<multiplayer>"
    Então valido o botão promoção cruzada "<cross_promotion>"
    Então valido o botão convidar amigos "<invite_friends>"
    Então valido o botão mais jogos "<more_games>"

    Exemplos:
      | linguagem | local | play         | multiplayer       | cross_promotion | invite_friends | more_games |
      | pt        | BR    | JOGAR AGORA! | JOGAR COM PESSOAS |                 |                | + JOGOS    |
      | en        | US    | PLAY NOW!    | MULTIPLAYER       |                 |                | + GAMES    |

  @LabelsExitGame
  Esquema do Cenário: Validação das Labels do popup de sair do jogo
    Dado que estou com o idioma "<linguagem>" e "<local>" ativado
    E abro o popup de sair do jogo
    Então valido o título de sair do jogo "<exit_title>"
    Então valido a descrição de sair do jogo "<exit_description>"
    Então valido o botão não de sair do jogo "<no_exit_game>"
    Então valido o botão sim de sair do jogo "<yes_exit_game>"

    Exemplos:
      | linguagem | local | exit_title   | exit_description                      | no_exit_game | yes_exit_game |
      | pt        | BR    | SAIR DO JOGO | Tem certeza que deseja sair do jogo?  | Não          | Sim           |
      | en        | US    | EXIT GAME    | Do you really want to leave the game? | No           | Yes           |