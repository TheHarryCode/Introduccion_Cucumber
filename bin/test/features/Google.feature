Feature: Probar busqueda en google

    Scenario: Buscar algo en google
    Given Como usuario navego a google
    When Deseo realizar una busqueda de algo
    And Doy click en el boton buscar
    Then Encuentro un resultado
