@PageComputadores
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

    Scenario: como usuario deseo filtrar la lista de computadores por uno especifico
    Given navego al sitio web de computadores
    When ingreso el nombre del computador a buscar
    Then doy click en el boton filtrar por nombre
    And comparo si en la lista esta el computador buscado

    Scenario: como usuario deseo paginar los resultados de la pantalla de computadores
    Given navego al sitio web de computadores paginados
    When doy click en el boton paginar siguiente
    Then puedo ver los resultados encontrados