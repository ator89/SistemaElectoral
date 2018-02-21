# Sistema Electoral
## Proyecto de Programación II - Sistema Electoral
##Enero 2018
### Angel Antonio Torres Cálix - 10711163

** El sistema consta de las siguientes Módulos:

1. Se espera que el sistema cuente con un buen diseño GUI, Amigable y entendible

2. Toda las parametrizaciónes e Información general o detallada debe estar guardada en archivos de texto, binarios y Bases de Datos. Es obligatorio que el proyecto contenga los tres tipos de almacenamiento

3. Administración: dicho sistema está estructurado de la siguiente manera:
1-	El sistema puede tener 4 tipos diferentes de usuarios:
a-	Administrador del sistema
b-	Miembro de mesa
c-	Electores
d-	Magistrados

**Administrador del sistema: es un tipo de usuario que puede:
"	Diseñar, administrar y estructurar papeletas electorales en los tres niveles (Presidente, diputado y alcaldes). Esto incluye fotos y posiciones de los candidatos etc. Recuerden que la cantidad de candidatos debe ser variable.
"	Ingresar/Modificar/eliminar la información general una o todas las mesas electorales, entre la información General tenemos: código, ubicación Geográfica (latitud y longitud mostrada en Google Earth/maps con todo el detalle de  la mesa).
"	Ingresar/modificar/Eliminar miembros de mesas electorales, básicamente esta es la administración de credenciales para cada miembro de la mesa, solo manejaremos presidente, secretario y vocal.
"	Ingresar/modificar/eliminar magistrados del TSE. 
"	Ingresar/modificar/eliminar otros administradores del sistema. 
"	Ingresar/modificar/eliminar electores por mesa electoral, esta administración permite asignar los electores habilitados para votar en dicha mesa. Se deberá crear un usuario por cada elector.
"	Generar y exportar a PDF reportes por mesa 
"	Generar y exportar a PDF reportes de resultados por presidente, alcalde o diputado
"	Generar y exportar a PDF reportes por departamento


**Miembro de mesa: es un tipo de usuario que puede:
"	Apertura la mesa para proceder a votar, esto solo se puede hacer una vez y es a partir de allí que se puede proceder a votar.
"	Cierra la mesa al final de la votación, a partir de esta acción ya no se puede votar y se genera toda la información necesaria.
"	Habilita a un elector asignado a esa mesa para que proceda a votar.
"	Puede ver un informe de todas las personas que han votado
"	Puede ver el reporte con los resultados solo de esa mesa, para presidente, diputado o alcalde. Pero hasta después del cierre de la mesa.
"	Se puede generar un acta electrónica con los resultados de la mesa e imprimirla para cada miembro de la mesa y todos los detalles de la misma.
"	Puede ver a través de google earth ver la ubicación y descripción de la mesa donde esta asignado


**Electores: es un tipo de usuario que puede:
"	Votar en la mesa electoral en la que ha sido asignado, solo puede votar una única vez.
"	Se desea que el método de votación electrónico sea agradable e intuitivo para el elector.
"	Se desea que la votación para presidente sea en una aplicación Móvil(Parte Investigativa)

**Magistrados: es un tipo de usuario que puede:
"	Los resultados finales de las elecciones a nivel nacional
"	Los resultados por municipio
"	Los resultados por departamento
"	Los resultados por mesa
"	Los solo clasificados por presidentes, diputados o alcaldes
"	Anular actas de mesas
"	Se desea ver las estadísticas finales en mapa mostradas por departamento.

d-	Se espera que los resultados incluyan graficas donde se puedan ver reflajados cualquier tipo de dato.
