#language: pt

@CriarLoginELogar
Funcionalidade: Criar Login e Logar

  @CriarLogin
  Esquema do Cenário: Criação de login
    Dado que ignoro o login automático
    E que eu abro as configurações
    E abro a menu de login
    E clico em cadastre-se
    Então crio o login com "<usuario>" e "<senha>"

    Exemplos:
      | usuario                      | senha      |
      | automation.test.97@gmail.com | joaotester |

  @LoginNaConta
  Esquema do Cenário: Logar na conta Jogatina
    Dado que ignoro o login automático
    E que eu abro as configurações
    E abro a menu de login
    E seleciono a opção de logar
    E preencho o acesso com "<user>" e "<pass>"
    Então valido que o login foi realizado com o "<nickname>"


    Exemplos:
      | user                         | pass       | nickname      |
      | automation.test.97@gmail.com | joaotester | joao.liraneto |