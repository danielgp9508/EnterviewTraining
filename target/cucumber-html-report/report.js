$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/mainPage.feature");
formatter.feature({
  "name": "Pagina de Fecolsa",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Consulta Fonquimicas",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Consulta_sin_datos"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "paginaPrincipalDefinition.ingresar_a_la_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresar a servicio",
  "keyword": "When "
});
formatter.match({
  "location": "paginaPrincipalDefinition.ingresar_a_servicio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar servicio",
  "keyword": "Then "
});
formatter.match({
  "location": "paginaPrincipalDefinition.validar_servicio()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login pagina Fonquimicas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Consulta_con_datos"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la pagina",
  "keyword": "Given "
});
formatter.step({
  "name": "login pagina \u003cusuario\u003e \u003ccontrasena\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Validar listado de extractos",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usuario",
        "contrasena"
      ]
    },
    {
      "cells": [
        "\"nellyprp@hotmail.com\"",
        "\"39794108\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login pagina Fonquimicas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Consulta_con_datos"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "paginaPrincipalDefinition.ingresar_a_la_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login pagina \"nellyprp@hotmail.com\" \"39794108\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginDefinition.login_pagina(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validar listado de extractos",
  "keyword": "Then "
});
formatter.match({
  "location": "loginDefinition.validar_listado_de_extractos()"
});
formatter.result({
  "status": "passed"
});
});