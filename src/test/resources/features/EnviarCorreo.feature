@tag
Feature: Enviar correo electr�nico

  @tag1
  Scenario: Enviar correo exitosamente
    Given El usuario se loguee en la pagina
    When Ingrese los datos del correo y lo envie 
    Then se debe enviar el correo correctamente
