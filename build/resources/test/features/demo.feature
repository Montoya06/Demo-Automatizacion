Feature: El usuario podra validar la ubicacion exacta de la empresa DataCenter Colombia

  @CP01
  Scenario Outline: El usuario realizara la busqueda de la pagina oficial DataCenter Colombia y validara su ubicacion
    Given El usuario ingresa a la pagina de google y da click en el buscador
    When ingresa el nombre datacenter colombia y da click en buscar "<texto>"
    When el usuario ve el resultado y selecciona la primera opcion
    When el usuario ingresa a la pagina y hace scroll hasta el final
    Then El usuario ve la direccion exacta de la empresa
    Examples:
    |   texto                |
    |  datacenter colombia |