# Project-java-unit-testing-triangles
Proyecto Java con Gradle que implementa validación de triángulos y pruebas unitarias usando JUnit 5. Incluye configuración de toolchains, integración con JaCoCo para reporte de cobertura y ejemplos de TDD. Ideal para aprendizaje de testing, calidad de código y automatización con Gradle.

///////////////////////////////////////////__Descripción del repositorio__////////////////////////////////////////////////////////////

Este proyecto implementa un comprobador de triángulos en Java y aplica principios básicos de pruebas unitarias utilizando JUnit 5, junto con generación de reportes de cobertura mediante JaCoCo. El objetivo principal es demostrar una arquitectura mínima pero profesional para practicar TDD (Test Driven Development), manejo de dependencias con Gradle y validación lógica con métodos puros.

La aplicación principal permite ingresar tres valores numéricos y determina si pueden formar un triángulo válido basándose en la desigualdad triangular. Además, incluye una batería de pruebas unitarias que cubren distintos casos: triángulos válidos, inválidos, equilateral, isósceles, degenerate y valores extremos o no permitidos (cero, negativos, etc.).

Tecnologías

#Java (JDK 21)

#Gradle

#JUnit 5

#JaCoCo

#Funcionalidades principales

#Método isTriangle(a, b, c) con cobertura de casos reales y límite.

#Pruebas unitarias organizadas en DemoTest.java.

#Reportes automáticos de cobertura en carpeta build/reports/jacoco/test/html.

Ejecución desde consola con gradlew run y gradlew test.

