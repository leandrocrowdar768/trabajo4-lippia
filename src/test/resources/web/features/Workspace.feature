@crearWorkspace

  Background: Usuario dentro con sesion iniciada

Scenario: Crear nuevo workspace
Given que estoy en la pagina de inicio del usuario
When Selecciono Manage Workspaces
And selecciono la opcion Create New Workspace
And ingreso nombre del nuevo workspace
And selecciono crear
Then se muestra nuevo workspace creado en la lista

@configurarWorkspace
Scenario: Cambiar nombre de workspace
Given que estoy en la pagina Manage Workspaces con mas de un workspace creado
When Selecciono la opcion Settings
And Ingreso un nuevo nombre de workspace en el campo Workspace name
Then se muestra mensaje emergente Workspace settings have been updated

