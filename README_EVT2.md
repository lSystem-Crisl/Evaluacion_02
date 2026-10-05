# Evaluación 02 - Implementación de Sistemas de Información

## Descripción

Aplicación desarrollada en **Java + Swing** para el registro de empleados, conectada a **MySQL mediante JDBC**.

El proyecto aplica la estructura trabajada en clase, separando la entidad, la lógica de acceso a datos, las utilidades y la interfaz gráfica.

## Tecnologías

- Java / Swing
- Eclipse
- Maven
- MySQL / MySQL Workbench
- JDBC
- Git / GitHub

## Funcionalidades

- Registro de empleados.
- Selección del tipo de empleado mediante `JComboBox` cargado desde MySQL.
- Validación de datos mediante `ValidateUtil` y expresiones regulares.
- Persistencia de información en MySQL.
- Limpieza del formulario y mensajes de confirmación.

## Base de datos

**BD:** `evaluacion_t2`

Tablas:

- `empleado`
- `tipoempleado`

La tabla `empleado` se relaciona con `tipoempleado` mediante:

`empleado.idTipoEmpleado → tipoempleado.idTipoEmpleado (FK)`

Esto permite mantener la relación entre el empleado y su tipo de forma estructurada.

## Estructura

```text
src/
├── entity/
│   └── Empleado.java
├── model/
│   ├── EmpleadoModel.java
│   └── TipoEmpleadoModel.java
├── util/
│   ├── MySqlDBConexion.java
│   ├── TeoriaExpresionesRegulares.java
│   └── ValidateUtil.java
└── vista/
    └── FrmRegistraEmpleado.java
```

## Flujo del sistema

```text
FrmRegistraEmpleado
        ↓
EmpleadoModel / TipoEmpleadoModel
        ↓
MySqlDBConexion
        ↓
MySQL
```

## Autor

**Cristhian Elfer Ñahui Navarro**

**Profesor:** Jacinto Gutarra Jorge Lorenzo

**Curso:** Implementación de Sistemas de Información

**Evaluación 02**
