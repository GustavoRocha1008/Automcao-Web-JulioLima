package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvantageonlineshoppingPage {
        private WebDriver driver;

        public By BtnAcesso = By.id("menuUser");
        public By MenuUser = By.xpath("//a[@id=\'menuUserLink\']//span[@class=\'hi-user containMiniTitle ng-binding\']");
        public By LinkCreateAccount = By.xpath("//login-modal//div[3]//a[2]");
        public By InputUsernameCadastro = By.xpath("//div[@id=\"registerCover\"]//input[@name=\"usernameRegisterPage\"]");
        public By EmailCadastro = By.xpath("//div[@id=\"formCover\"]//input[@name=\"emailRegisterPage\"]");
        public By PasswordCadastro = By.xpath("//div[@class=\"spliter\"]//input[@name=\"passwordRegisterPage\"]");
        public By ConfirmPasswordCadastro = By.xpath("//sec-view[@class=\"ng-isolate-scope sec-view\"]//input[@name=\"confirm_passwordRegisterPage\"]");
        public By CheckboxIagree = By.xpath("//sec-view[@class=\"ng-isolate-scope sec-view\" and @sec-name=\"registrationAgreement\"]//input[@class=\"ng-valid ng-scope ng-touched ng-dirty ng-valid-parse\"]");
        public By BtoRegister = By.id("register_btn");
        public By NomeUsuario = By.xpath("//a[@id=\"menuUserLink\"]//span[@class=\"hi-user containMiniTitle ng-binding\"]");
        public By Myaccount =  By.xpath("//a[@id=\"menuUserLink\"]//div[@id=\"loginMiniTitle\"]//label[@translate=\"My_account\"]");
        public By LinkEditAccount = By.linkText("Edit");
        public By FirstName = By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"first_nameAccountDetails\"]");
        public By LastName = By.xpath("//label[contains(text(), \"Last Name\")]");
        public By PhoneNumber = By.xpath("//div [@class=\"inputContainer ng-scope\"]//input[@name=\"phone_numberAccountDetails\"]");
        public By Country = By.xpath("//div[@class=\"inputContainer ng-scope\"]//select[@class=\"ng-valid ng-scope in-focus ng-dirty ng-valid-parse ng-touched\"]//option[6]");
        public By City = By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"cityAccountDetails\"]");
        public By Address = By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"addressAccountDetails\"]");
        public By PostaCodel = By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"postal_codeAccountDetails\"]");
        public By Region = By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"state_/_province_/_regionAccountDetails\"]");
        public By BtoSave = By.id("save_btn");
        public By TelaMyaccount = By.xpath("//section[@class=\"ng-scope\"]//h3[@class=\"roboto-regular sticky fixedImportant ng-scope fixed\"]");



        public By InputUsername = By.xpath("//input[@name='username' and @type='text']");
        public By InputPassword = By.xpath("//div[@class='login ng-scope']//input[@name='password']");
        public By BtnSignIn = By.xpath("//login-modal//div//div//sec-form//sec-sender//button[@id='sign_in_btn']");
        public By PopularItems = By.xpath("//a[text()='POPULAR ITEMS']");
        public By LinkDetails = By.id("details_16");
        public By CorBlack = By.id("rabbit");
        public By BtnAddToCart = By.xpath ("//div[@class='fixedBtn']//button[@name='save_to_cart']");
        public By BtnCheckOut = By.xpath("//header//ul[@class='roboto-light desktop-handler']//button[@id='checkOutPopUp']");
        public By BtnNext = By.xpath("//div[@class='uiview ng-scope']//section//div[@id='orderPayment']//button[@id='next_btn' and @class='a-button nextBtn marginTop75 ng-scope']");
        public By BtnPayNow = By.id("pay_now_btn_MasterCredit");
        // Construtor para inicializar o WebDriver
        public AdvantageonlineshoppingPage(WebDriver driver) {
        this.driver = driver;
        }
}


