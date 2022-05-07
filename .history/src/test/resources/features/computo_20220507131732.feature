@Computadores
Feature: Como usuario deseo testear la pagina computer database
    Scenario: como usuario deseo adicionar un computador
    Given navego al sitio web del comprador de computadores
    And doy click en el boton de add new computer
    When ingreso nombre del computador
    And ingreso una fecha de introduccion
    And ingreso una fecha de descontinuar
    And selecciono una compania
    Then doy click en el boton crear computador
    And comparo si la respuesta es correcta al crear un computador