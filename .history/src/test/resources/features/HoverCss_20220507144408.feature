@HoverCss
Feature: Como usuario deseo testear la pagina de fechas
    Scenario: como usuario deseo calcular los dias entre dos fechas
    Given navego al sitio web de calculos de fechas
    And ingreso el dia de la fecha inicial
    And ingreso el mes de la fecha inicial
    And ingreso el ano de la fecha inicial
    And ingreso el dia de la fecha final
    And ingreso el mes de la fecha final
    When ingreso el ano de la fecha final
    Then doy click en el boton calcular duracion
    And comparo si la respuesta es correcta al calcular un rango de fechas