# Explorador de UI Elements en Android

**Alumnos:** Pérez Olivares José Julio, Perez Hernandez Tony Saifi , Nava Villar Eric.

## Descripción de la App
Esta aplicación de android tiene como objetivo demostrar el uso de una arquitectura moderna basada en una `Activity` principal y múltiples `Fragments`, de esta manera sirviendo como un catalogo interactivo.

## Instrucciones de Uso
1. Clonar este repositorio.
2. Abrir el proyecto utilizando Android Studio.
3. Ejecutar la aplicación en un emulador (AVD) o en un dispositivo fisico con depuración USB activada.
4. Utilizar la barra de navegación inferior (Bottom Navigation) para alternar fluidamente entre las diferentes pantallas explicativas.

## Componentes Implementados

### 1. Estructura Base (`MainActivity`)
* La aplicación utiliza una sola Activity que actúa como contenedor.
* La navegación se maneja mediante un **`BottomNavigationView`** en la parte inferior de la pantalla, el cual carga e intercambia los diferentes `Fragments` dentro de un `FrameLayout`.

### 2. Fragment 1: TextFields (Campos de Texto)
* **¿Para qué sirve?** El componente `EditText` permite al usuario interactuar ingresando información a través del teclado del dispositivo. Se pueden configurar para aceptar tipos de datos específicos.
* **Demostración Interactiva:** Se implementaron tres campos de texto: uno estándar para texto (nombre), uno numérico (teléfono) y uno de texto oculto (contraseña).
* **Funcionalidad:** Al presionar el botón de "Procesar Datos" el código en Kotlin captura el texto de los `EditText` y valida que no estén vacíos, lanza un mensaje emergente (`Toast`) saludando al usuario y limpia los campos mediante el método `.clear()`.

* ![TextFields](https://github.com/user-attachments/assets/95d6b916-2f6e-4ede-b37b-e732148daa57)


* ### 3. Fragment 2: Botones (Button, ImageButton, FAB)
* **¿Para qué sirve?** Los botones permiten a los usuarios realizar acciones y tomar decisiones con un solo toque. Son el punto de contacto principal para ejecutar la lógica de la aplicación.
* **Demostración Interactiva:** Se incluyeron tres tipos de botones: un botón estándar de texto, un `ImageButton` con icono y un `FloatingActionButton` (FAB) para acciones destacadas.
* **Funcionalidad:** El botón estándar e `ImageButton` muestran un `Toast` al ser presionados. El botón flotante implementa un `Snackbar` interactivo con la opción de "Deshacer", demostrando una retroalimentación de usuario más avanzada.

* ![Botones](https://github.com/user-attachments/assets/a24b6e52-131a-4915-95f3-e0ef377c4b45)

### 4. Fragment 3: Selección (CheckBox, RadioButton, Switch)

- **¿Para qué sirve?** Permite al usuario **seleccionar opciones**, ya sea varias simultáneamente o solo una dentro de un grupo.
- **Demostración Interactiva:**  
  - **CheckBox:** Pizza, Hamburguesa, Tacos (permiten seleccionar varias)  
  - **RadioButton:** Hombre, Mujer, Otro (solo una opción)  
  - **Switch:** Activar/Desactivar notificaciones
- **Funcionalidad:** Cada interacción muestra un **Toast** indicando la opción seleccionada, permitiendo al usuario experimentar con cada componente.

*![Seleccion](https://github.com/user-attachments/assets/92f3da62-3793-494d-b45e-a30e0db787c1)

### 5. Fragment 4: Listas (ListView)

- **¿Para qué sirve?** Permite mostrar múltiples elementos en pantalla y seleccionar uno de ellos.
- **Demostración Interactiva:** Se implementó una lista de **tecnologías y lenguajes de programación**, incluyendo: Python, Java, Kotlin, C++, JavaScript, HTML, CSS, SQL, Android Studio, Git, Docker, Node.js.
- **Funcionalidad:** Al tocar un elemento, se muestra un **Toast** indicando la opción seleccionada.

*![Listas](https://github.com/user-attachments/assets/3095cedb-8d83-4c6c-a2fb-9803d5779a9a)

### 6. Fragment 5: Elementos de Información (ImageView, ProgressBar)
* **¿Para qué sirve?** Componentes utilizados para presentar datos visuales, contenido multimedia o indicar el estado de procesos que ocurren en segundo plano.
* **Demostración Interactiva:** Contiene una `ImageView` con el logotipo de la aplicación y una `ProgressBar` horizontal para representar el avance de una tarea.
* **Funcionalidad:** Se implementó un botón de "Simular Descarga" que activa un hilo asíncrono (`Thread`) para actualizar la barra de progreso y un `TextView` dinámico de 0% a 100%, demostrando el manejo correcto del hilo de interfaz (`UI Thread`).

* ![Informacion](https://github.com/user-attachments/assets/87cd2161-8c5c-4ea0-a053-617651e42141)
