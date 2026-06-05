# Sistema de Administración de Citas Médicas

## Instalación y configuración

### Requisitos del sistema

Para ejecutar la aplicación es necesario contar con:

* Java JDK 11 o superior.
* IntelliJ IDEA o cualquier IDE compatible con Java.
* Git instalado para clonar el repositorio.
* Sistema operativo Windows, Linux o macOS.

### Clonar el repositorio

```bash
git clone https://github.com/Estefania-ramirez14/CONSULTORIO-MEDICO-ESTEFANIA-RAMIREZ-SANTAMARIA.git
```

### Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open**.
3. Buscar la carpeta del proyecto.
4. Abrir el proyecto.
5. Esperar a que IntelliJ cargue las dependencias necesarias.

### Configuración de ejecución

1. Abrir el archivo `Main.java`.
2. Seleccionar el botón verde de ejecución.
3. Ejecutar el programa.

---

## Uso del programa

El sistema permite administrar un consultorio médico mediante las siguientes funcionalidades:

### Inicio de sesión

El sistema cuenta con autenticación de administrador.

Credenciales de prueba:

```text
Usuario: admin
Contraseña: 1234
```

### Funcionalidades disponibles

#### 1. Alta de doctores

Permite registrar doctores indicando:

* ID del doctor.
* Nombre completo.
* Especialidad.

#### 2. Alta de pacientes

Permite registrar pacientes indicando:

* ID del paciente.
* Nombre completo.

#### 3. Crear citas

Permite generar citas médicas registrando:

* ID de cita.
* Fecha.
* Hora.
* Motivo.
* Doctor asignado.
* Paciente asignado.

#### 4. Consultar doctores

Muestra la lista completa de doctores registrados.

#### 5. Consultar pacientes

Muestra la lista completa de pacientes registrados.

#### 6. Consultar citas

Muestra todas las citas registradas en el sistema.

### Persistencia de información

La aplicación utiliza archivos CSV para almacenar información dentro de la carpeta:

```text
db/
```

Los archivos generados son:

* doctores.csv
* pacientes.csv
* citas.csv

---

## Créditos

Proyecto desarrollado por:

**Estefanía Ramírez Santamaría**

Materia:

* Programación en Java.

Herramientas utilizadas:

* Java
* IntelliJ IDEA
* Git
* GitHub

---

## Licencia

Este proyecto fue desarrollado con fines académicos y educativos.

El uso del código es únicamente para prácticas escolares y aprendizaje de programación orientada a objetos en Java.
