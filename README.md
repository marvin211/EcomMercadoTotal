# EcomMercadoTotal

Este proyecto de comercio electrónico está diseñado para proporcionar una plataforma flexible y escalable para la gestión de tiendas en línea. Está desarrollado en Java 17 y utiliza el marco de trabajo Spring Boot junto con Thymeleaf para la creación de páginas web dinámicas. La arquitectura hexagonal se ha aplicado para asegurar un diseño modular y mantenible.

## Funcionalidades Principales

- **Gestión de Productos:** Permite a los administradores añadir, editar y eliminar productos en el catálogo de la tienda.

- **Carrito de Compras:** Los usuarios pueden añadir y eliminar productos de su carrito de compras, así como realizar el proceso de compra.

- **Autenticación de Usuarios:** Ofrece autenticación segura para los usuarios y administradores del sistema.

- **Páginas Dinámicas:** Utiliza Thymeleaf para generar páginas web dinámicas con contenido personalizado.

## Ejecución del Proyecto

### Requisitos Previos
- [Java 17](https://www.oracle.com/java/technologies/javase-downloads.html)
- [PostgreSQL](https://www.postgresql.org/download/)
- Maven (Gestor de dependencias). Se puede instalar desde [aquí](https://maven.apache.org/download.cgi).
- Las dependencias de Spring Boot se gestionan automáticamente, utilizando Maven.

### Pasos para Ejecutar el Proyecto
1. **Clonar el repositorio**

    ```bash
    git clone https://github.com/marvin211/EcomMercadoTotal.git
    ```
2. **Configuración de la Base de Datos:** Configura tu base de datos en el archivo application.properties con los parámetros necesarios.

3. **Ejecutar en Desarrollo:** En desarrollo, el proyecto se ejecutará en el puerto 8090. Ejecuta el siguiente comando desde la raíz del proyecto:

    ```bash
    mvn spring-boot:run -Dspring.profiles.active=dev
    ```
4. **Ejecutar en Producción:** En producción, el proyecto se ejecutará en el puerto 8080. Ejecuta el siguiente comando desde la raíz del proyecto:

    ```bash
    mvn spring-boot:run -Dspring.profiles.active=pdn
    ```
5. **Acceder a la Página Principal:** Abre tu navegador y ve a http://localhost:8080/home para acceder a la página de inicio en producción o http://localhost:8090/home para desarrollo.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

¡Gracias por elegir EcomMercadoTotal! Espero que esta descripción te haya proporcionado una visión clara de las capacidades y funcionalidades de la aplicación. Si tienes alguna pregunta o necesitas asistencia adicional, no dudes en ponerte en contacto conmigo.

