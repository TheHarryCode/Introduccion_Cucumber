@HoverCss
Feature: Como usuario deseo testear la pagina de hover css
    Scenario: como usuario deseo ver el comportamiento del boton Hover Para
    Given navego al sitio web de hover para
    When doy click en el boton hover para
    Then espero ver el mensaje inferior y titulo principal

    Scenario: como usuario deseo ver el comportamiento del boton Hover Div
    Given navego al sitio web de hover div
    When doy click en el boton hover div
    And doy click en el link inferior presentado
    And doy click en el boton de atras para retornar
    Then espero ver la pagina de inicio