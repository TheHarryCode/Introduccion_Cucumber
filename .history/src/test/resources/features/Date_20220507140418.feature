@CalculateDate
Feature: Como usuario deseo testear la pagina de fechas
    Scenario: como usuario deseo calcular los dias entre dos fechas
    Given navego al sitio web de calculos de fechas
    And ingreso la fecha inicial
    When ingreso la fecha final
    Then doy click en el boton calcular duracion
    And comparo si la respuesta es correcta al calcular un rango de fechas