# Explorador de UI Elements en Android

**Alumnos:** Pérez Olivares José Julio, Nava Villar Eric

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
