# Projecte Intermodular - [Nom del Projecte]

**Autor/s:** Antonio y Mario
**Data:** 14/10/2026
**Grup:** Antonio y Mario

---

# 1. Introducció
- Explicar el cas d'ús
    - Qui és el **End User**?
        El End User es cualquier personas que busquen una forma de organizarse y prepararse sus rutinas para el gimnasio

    - Quin problema soluciona?
        Algunas personas gestionan sus rutinas utilizando notas del móvil esta opcion pueden dificultar la consulta y organización de los entrenamientos, especialmente cuando una rutina contiene varios ejercicios.

    - Com soluciona el problema?
        La pagina web permitirá al usuario registrarse e iniciar sesión para crear, editar y eliminar sus rutinas personales.

# 2. Requeriments
- Requeriments **funcionals**
    - RF01: El sistema permitirá añadir ejercicios a una rutina.
    - RF02: El sistema permitirá establecer para cada ejercicio el número de series, repeticiones y peso.
    - RF03: El sistema permitirá consultar las rutinas creadas por el usuario.
    - RF04: El sistema permitirá modificar una rutina existente.
    - RF05: El sistema permitirá eliminar una rutina.
    - RF06: El administrador podrá crear nuevos ejercicios.
    - RF07: El administrador podrá modificar y eliminar ejercicios existentes.

- Requeriments **no funcionals**
    - RNF01:  La aplicación tendrá una interfaz sencilla e intuitiva para facilitar su uso.
    - RNF02:  Las contraseñas de los usuarios deberán almacenarse de forma segura mediante un sistema de cifrado/hash.
    - RNF03:  El proyecto estará gestionado mediante un sistema de control de versiones Git.
    - RNF04:  La aplicación utilizará una base de datos relacional para almacenar la información de usuarios, rutinas y ejercicios.

- User Stories (format: *Com a [rol], vull [acció], per a [benefici]*)

## Usuario

- US01 — Registro: Como usuario, quiero registrarme en la aplicación, para poder crear y gestionar mis propias rutinas.

- US02 — Inicio de sesión: Como usuario, quiero iniciar sesión, para poder acceder a mis rutinas personales.

- US03 — Cerrar sesión: Como usuario, quiero cerrar sesión, para proteger el acceso a mi cuenta.

- US04 — Consultar ejercicios: Como usuario, quiero consultar los ejercicios disponibles, para conocer los ejercicios que puedo añadir a mis rutinas.

- US05 — Crear rutina: Como usuario, quiero crear una rutina, para organizar mis entrenamientos.

- US06 — Añadir ejercicios: Como usuario, quiero añadir ejercicios a una rutina, para personalizar mi entrenamiento.

- US07 — Configurar ejercicios: Como usuario, quiero indicar las series, repeticiones y peso de cada ejercicio, para definir cómo realizar mi entrenamiento.

- US08 — Consultar rutina: Como usuario, quiero consultar mis rutinas, para saber qué ejercicios debo realizar durante mi entrenamiento.

- US9 — Modificar rutina: Como usuario, quiero modificar mis rutinas, para adaptarlas a mis necesidades.

- US10 — Eliminar rutina: Como usuario, quiero eliminar una rutina, para mantener organizadas mis rutinas y eliminar aquellas que ya no utilizo.

## Administrador

- US12 — Crear ejercicio Como administrador, quiero crear nuevos ejercicios, para ampliar el catálogo disponible para los usuarios.

- US13 — Modificar ejercicio: Como administrador, quiero modificar los ejercicios existentes, para mantener actualizada la información.

- US14 — Eliminar ejercicio: Como administrador, quiero eliminar ejercicios, para mantener actualizado y organizado el catálogo.

- Estimació de **punts** de les User Stories (Planning Poker / Fibonacci)

!!! TIP
    Pots organitzar les User Stories en una taula:

    | ID | Com a... | Vull... | Per a... | Punts |
    |----|----------|---------|----------|-------|
    | US01 | Usuario | Registrarme | Crear una cuenta | 3 |
    | US02 | Usuario | Iniciar sesión | Acceder a mi cuenta | 5 |
    | US03 | Usuario | Cerrar sesión | Salir de mi cuenta de forma segura | 2 |
    | US04 | Usuario | Consultar ejercicios | Ver los ejercicios disponibles | 3 |
    | US05 | Usuario | Filtrar ejercicios | Encontrar ejercicios según mis criterios | 3 |
    | US06 | Usuario | Crear una rutina | Organizar mi entrenamiento | 5 |
    | US07 | Usuario | Añadir ejercicios a una rutina | Personalizar mi entrenamiento | 5 |
    | US08 | Usuario | Configurar series, repeticiones y peso | Adaptar el entrenamiento a mis necesidades | 3 |
    | US09 | Usuario | Consultar una rutina | Ver los ejercicios de mi rutina | 3 |
    | US10 | Usuario | Modificar una rutina | Actualizar mi entrenamiento | 5 |
    | US11 | Usuario | Eliminar una rutina | Borrar rutinas que ya no necesito | 2 |
    | US12 | Usuario | Crear un ejercicio | Añadir nuevos ejercicios al sistema | 3 |
    | US13 | Usuario | Modificar un ejercicio | Actualizar la información de un ejercicio | 3 |
    | US14 | Usuario | Eliminar un ejercicio | Eliminar ejercicios que ya no necesito | 2 |
    | | | | **Total estimado** | **47** |

# 3. Estructura Git
- Diagrama de l'estructura de branques (Gitflow, Trunk-based, etc.) amb **mermaid**
    Se utilizará una estructura basada en Trunk-Based Development, trabajando principalmente sobre la rama main y creando ramas secundarias para desarrollar nuevas funcionalidades.
- Justificació de l'estructura triada
    Se ha elegido esta estructura porque permite trabajar de forma sencilla y mantener una rama principal estable
- Convenció de noms de branques i commits

!!! TIP BONUS POINTS
    **BONUS**:
    - Implementar git hooks (pre-commit, commit-msg) per a normalitzar missatges de commit.
    - Implementar `.gitignore` adequat al stack.
    - Ús de Conventional Commits.

# 4. Tecnologies
- Stack triat (Frontend, Backend, Base de Dades, Infraestructura)
    Actualmente hemos trabajado en el backend donde hemos hecho toda la lógica del programa y una base de datos donde en principio se almacenara toda la información
- Justificació de la tria de cada tecnologia
- Diagrama d'arquitectura (mermaid)

# 5. Solució
- Quines pantalles s'han implementat (captures de pantalla)
- Taules de la base de dades implementades
  
**Rutina**
| Campo | Tipo | Descripción |
|-------|------|-------------|
| id_rutina | INT (PK) | Identificador de la rutina |
| nombre | VARCHAR | Nombre de la rutina |
| descripcion | VARCHAR | Descripción de la rutina |

**Ejercicios**
| Campo | Tipo | Descripción |
|-------|------|-------------|
| id_ejercicio | INT (PK) | Identificador del ejercicio |
| nombre | VARCHAR | Nombre del ejercicio |
| descripcion | VARCHAR | Descripción del ejercicio |

**Rutina-ejercicio**
| Campo | Tipo | Descripción |
|-------|------|-------------|
| id_rutina_ejercicio | INT (PK) | Identificador de la relación |
| id_rutina | INT (FK) | Referencia a la rutina |
| id_ejercicio | INT (FK) | Referencia al ejercicio |
| series | INT | Número de series |
| repeticiones | INT | Número de repeticiones |

- Lògiques de negoci principals implementades
    - Registro e inicio de sesión de usuarios.
    - Gestión de sesiones y cierre de sesión.
    - Consulta y filtrado de ejercicios.
    - Creación, modificación y eliminación de rutinas.
    - Asociación de ejercicios a diferentes rutinas.
    - Configuración de series y repeticiones.
    - Creación, modificación y eliminación de ejercicios.
- Funcionalitats pendents / fora d'abast (si n'hi ha)

# 6. Diagrames
- Diagrama de Dades (ER)

 ![Base de datos er](./imagenes/entidadRelacion.drawio)

- Diagrama de Classes (si aplica)
- Diagrama de Seqüència d'almenys 1 procés


# 9. Conclusions
- Dificultats trobades
- Aprenentatges
- Possibles millores futures
