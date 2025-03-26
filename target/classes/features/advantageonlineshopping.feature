Feature: advantageonlineshopping


  @CT0001

    Scenario: Login do usuário
      Given que estou na tela principal do Advantage
      When  clico no icone de login
      Then  preencho os campos de login e senha clico em Sign in o sistema carrega a tela com o usuário logado


 @CT0002

  Scenario: Realizar compra do produto
    Given que estou na pagina principal logado
    When  clico em popular items clico em view detais clico na cor na preta clico em ADD TO CART
    And   clico em checkout em seguinda clico em next em PAY NOW
    Then o sistema apresenta a seguinte mensagem Thank you for buying with Advantage


