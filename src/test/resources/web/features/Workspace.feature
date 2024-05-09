@Workspace
Feature: Workspace

  @crearWorkspace
Scenario: Crear nuevo workspace
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    When El cliente ingresa contrasena "practica4lippia"
    When El cliente hace click en el boton Log In
    When El cliente verifica que esta en la pagina inicial de cliente logueado
    When El cliente selecciona administrar workspace
    When El cliente selecciona la opcion Create New Workspace
    When ingreso nombre del nuevo workspace "Workspace"
    When selecciono crear
    Then se muestra nuevo workspace creado en la lista

@configurarWorkspace
Scenario: Cambiar nombre de workspace
Given que estoy en la pagina Manage Workspaces con mas de un workspace creado
When Selecciono la opcion Settings
And Ingreso un nuevo nombre de workspace en el campo Workspace name
Then se muestra mensaje emergente Workspace settings have been updated

