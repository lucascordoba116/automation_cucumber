Feature: Google
  Scenario: Buscar en google
    Given usuario se encuentra en la pagina de google
    When ingresa para buscar cheese
    And presiona enter
    Then se visualiza los resultados de la busqueda
