package Steps;

import Logic.AdvantageonlineshoppingLogic;
import Runners.WebRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import javax.sound.midi.ShortMessage;

public class advantageonlineshoppingSteps {
    private WebDriver driver = WebRunner.getDriver();
    private AdvantageonlineshoppingLogic advantageonlineshoppinglogic = new AdvantageonlineshoppingLogic();

    @Given("que estou na tela principal do Advantage")
    public void que_estou_na_tela_principal_do_Advantage() {
        advantageonlineshoppinglogic.Homepage();
    }

    @When("clico no icone de login")
    public void clico_no_icone_de_login() {
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @Then("preencho os campos de login e senha clico em Sign in o sistema carrega a tela com o usuário logado")
    public void preencho_os_campos_de_login_e_senha_clico_em_Sign_in_o_sistema_carrega_a_tela_com_o_usuário_logado() {
        advantageonlineshoppinglogic.MenuUsuario();
    }

    @Given("que estou na pagina principal logado")
    public void que_estou_na_pagina_principal_logado(){
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("clico em popular items clico em view detais clico na cor na preta clico em ADD TO CART")
    public void clico_em_popular_items_clico_em_view_detais_clico_na_cor_na_preta_clico_em_ADD_TO_CART(){
        advantageonlineshoppinglogic.PopularItems();
    }

    @And("clico em checkout em seguinda clico em next em PAY NOW")
    public void clico_em_checkout_em_seguinda_clico_em_next_em_PAY_NOW(){
        advantageonlineshoppinglogic.Checkout();
    }

   @Then("o sistema apresenta a seguinte mensagem Thank you for buying with Advantage")
   public void o_sistema_apresenta_a_seguinte_mensagem_Thank_you_buying_wit_Advantage(){
        advantageonlineshoppinglogic.fluxoCompra();
   }
}
