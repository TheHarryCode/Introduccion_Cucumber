@HoverCss
Feature: Como usuario deseo testear la pagina de hover css
    Scenario: como usuario deseo ver el comportamiento del boton Hover Para
    Given navego al sitio web de hover para
    And ingreso el dia de la fecha inicial
    And ingreso el mes de la fecha inicial
    And ingreso el ano de la fecha inicial
    And ingreso el dia de la fecha final
    And ingreso el mes de la fecha final
    When ingreso el ano de la fecha final
    Then doy click en el boton calcular duracion
    And comparo si la respuesta es correcta al calcular un rango de fechas