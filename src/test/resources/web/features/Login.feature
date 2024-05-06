Feature: Ingreso en clockify
@Login
  @LoginExitoso
  Scenario: Login usuario existente
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    When El cliente ingresa contrasena "practica4lippia"
    When El cliente hace click en el boton Log In
    Then El cliente verifica que esta en la pagina inicial de cliente logueado

  @loginnoexitoso @Login
  Scenario: Login con email invalido
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente ingresa correo electronico "practica4_lippia_jessica2@yopmail"
    When El cliente hace click el boton Continue with email
    Then se muestra mensaje Email format is not valid

  @loginnoexitoso
  Scenario: Login con codigo de validacion invalido
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente ingresa correo electronico "practica4_lippia_jessica2@yopmail.com"
    When El cliente hace click el boton Continue with email
    And ingreso codigo de confirmacion incorrecto
    Then se muestra mensaje That code isnt valid Please try again

  @resetearContraseña
  Scenario: Login con reseteo de contraseña
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica3@yopmail.com"
    When El cliente seleciona la opcion Forgot Password
    When El cliente hace click en el boton Reset Password
    Then se muestra mensaje emergente para resetear password

  @Logout
  Scenario: Logout
    Given El cliente esta en la pagina principal
    When El cliente hace click en Inicia la sesion
    When El cliente hace click en la opcion login manual
    When El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    When El cliente ingresa contrasena "practica4lippia"
    When El cliente hace click en el boton Log In
    When El cliente verifica que esta en la pagina inicial de cliente logueado
    Then cierra sesion
