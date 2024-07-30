#Challenge-tecnico-monitoreo


• Endpoints disponibles para GESTIONAR PLANTAS:

1. Obtener todas las plantas
Método: GET
URL: /api/plantas
Descripción: Obtiene una lista de todas las plantas.


2. Crear una nueva planta
Método: POST
URL: /api/plantas/register
Descripción: Crea una nueva planta. Requiere un objeto Planta en el cuerpo de la solicitud.
Cuerpo de la solicitud:

{
  "nombre": "Nombre de la planta",
  "tipo": "Tipo de planta",
  "otrosCampos": "Valores adicionales"
}


3. Actualizar una planta existente
Método: PUT
URL: /api/plantas/{id}
Descripción: Actualiza la planta con el ID especificado. Requiere un objeto Planta en el cuerpo de la solicitud.
URL de ejemplo: /api/plantas/1

Cuerpo de la solicitud:
{
  "nombre": "Nombre actualizado",
  "tipo": "Tipo actualizado",
  "otrosCampos": "Valores adicionales actualizados"
}


4. Eliminar una planta
Método: DELETE
URL: /api/plantas/{id}
Descripción: Elimina la planta con el ID especificado.
URL de ejemplo: /api/plantas/1


5. Obtener planta por ID
Método: GET
URL: /api/plantas/{id}
Descripción: Obtiene los detalles de la planta con el ID especificado.
URL de ejemplo: /api/plantas/1


6. Obtener lecturas
Método: GET
URL: /api/plantas/lecturas
Descripción: Obtiene una lista de plantas con lecturas.


7. Obtener alertas medias
Método: GET
URL: /api/plantas/alertas-medias
Descripción: Obtiene una lista de plantas con alertas medias.


8. Obtener alertas rojas
Método: GET
URL: /api/plantas/alertas-rojas
Descripción: Obtiene una lista de plantas con alertas rojas.


9. Obtener sensores deshabilitados
Método: GET
URL: /api/plantas/sensores-deshabilitados
Descripción: Obtiene una lista de plantas con sensores deshabilitados.


10. Obtener plantas y datos
Método: GET
URL: /api/plantas/plantas-datos
Descripción: Obtiene una lista de plantas con datos asociados.



• Endpoints de Autenticación
11. Iniciar sesión
Método: POST
URL: /auth/login
Descripción: Autentica al usuario y devuelve un token JWT para acceso a los recursos protegidos.
Cuerpo de la solicitud:

{
  "email": "lucas@hotmail.com",
  "password": "1234"
}



12. Registrar un nuevo usuario
Método: POST
URL: /auth/register
Descripción: Registra un nuevo usuario en el sistema.
Cuerpo de la solicitud:

{
    "email": "leo-messi@hotmail.com",
    "password": "1234",
    "firstname": "Leonel",
    "lastname":"Messi"
}



• Endpoint de Países de latinoamérica

13. Obtener lista de países de latinoamérica
Método: GET
URL: /api/paises
Descripción: Obtiene una lista de nombres de países.
Respuesta:

[
  "Argentina",
  "Brasil",
  "Chile",
  ...
]