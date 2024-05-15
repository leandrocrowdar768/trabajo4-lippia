@Workspace
Feature: Workspace

  Background: Precondiciones
    Given El cliente esta en la pagina principal
    And El cliente hace click en Inicia la sesion
    And El cliente hace click en la opcion login manual
    And El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    And El cliente ingresa contrasena "practica4lippia"
    And El cliente hace click en el boton Log In
    And El cliente verifica que esta en la pagina inicial de cliente logueado
    And El cliente selecciona administrar workspace

  @crearWorkspaceLean
  Scenario: Crear nuevo workspace
    When El cliente selecciona la opcion Create New Workspace
    And El cliente ingresa nombre del nuevo workspace
    And El cliente hace click en Create
    Then se muestra mensaje de creacion exitosa

  @configurarWorkspaceLean
  Scenario: Cambiar nombre de workspace
    When Selecciono la opcion Settings
    And Ingreso un nuevo nombre de workspace en el campo Workspace name
    Then se muestra mensaje emergente Workspace settings have been updated

