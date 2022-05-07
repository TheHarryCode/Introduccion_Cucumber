Feature: Busqueda en una lista

@List
Scenario Outline: validar si un elemento esta contenido en la lista de acuerdo a un criterio de busqueda
Given Como usuario navego a la pagina de la lista
When Busco un <state> en la lista
Then Comparo si la <city> esta en lista

Examples:
    | state      | city | 
    | Washington | VancouverT, Washington|
    | Chicago    | Chicago, Illinois  |