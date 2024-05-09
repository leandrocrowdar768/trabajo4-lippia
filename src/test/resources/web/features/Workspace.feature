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
    When El cliente ingresa nombre del nuevo workspace
    When El cliente hace click en Create
    Then se muestra mensaje de creacion exitosa

@configurarWorkspace
Scenario: Cambiar nombre de workspace
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    When El cliente ingresa contrasena "practica4lippia"
    When El cliente hace click en el boton Log In
    When El cliente verifica que esta en la pagina inicial de cliente logueado
    When El cliente selecciona administrar workspace
    When Selecciono la opcion Settings
    And Ingreso un nuevo nombre de workspace en el campo Workspace name
    Then se muestra mensaje emergente Workspace settings have been updated

