@Project
Feature: Projects

  @crearProject
  Scenario: Crear nuevo workspace
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    When El cliente ingresa contrasena "practica4lippia"
    When El cliente hace click en el boton Log In
    When El cliente verifica que esta en la pagina inicial de cliente logueado
    When El cliente selecciona Project
    When El cliente selecciona Create new Project
    When El cliente ingresa datos del proyecto
    When El cliente hace click en Create
    Then se muestra mensaje de creacion exitosa

