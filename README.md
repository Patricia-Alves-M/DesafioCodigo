# DesafioCodigo
Projeto de automação em Java. Com as seguintes tecnologias. Java, Maven, BDD, Cucumber, JUnit, Selenium WebDriver.
O projeto é composto pelos seguintes pacotes:
1. src/main/java - core (Aonde eu criei a Classe: DriverFactory.java, lá coloco os métodos para iniciar o browser, setar o caminho aonde o chromedriver está dentro do projeto, abrir o navegador em janela anônima e maximizado. Classe: BasePage.java, aonde eu faço toda a lógica para clicar, escrever, selecionar combobox dos mapeamentos da página, criei alguns métodos para gearar email aleatoriamente e gerar uma senha. Classe: Browsers.java, criei um método para poder selecionar em qual navegador o teste irá ser executado. Firefox ou Chrome).
2. src/test/java (Tem os pacotes: pageObjects, runners e stepDefinitions. pageObjects é aonde todo o mapeamento dos elementos html do site, sitema fica. stepDefinitions é aonde são criados os métodos dos passos do BDD que foi criado e runners que é aonde a classe Cucumber é chamada para realizar o teste. Lá também tem o caminho aonde será salvo as evidências do teste que são geradadas em html e json).
3. src/test/resources (Aonde contém as features criadas em BDD e os drivers do chromedriver e firefox).
4. target (Tem duas pastas aonde são armazenadas as evidências do teste em html e json)
5. pom.xml (Arquivo do maven com as configurações e repositórios)


# Instalação e Execução
1.	Baixar o Java JDK e instalar
2.	Definir Variáveis de Ambiente
3.	Baixar o projeto do GITHUB
4.	Executar os arquivos runners do seguinte caminho em uma IDE de sua preferência: /ME/src/test/java/runners/login

