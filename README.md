# app-operaciones-checkbox-andorid-studio
### Aplicación implementando checkBox para la opción de la operación (Suma, resta, exponente, radicación) a realizar.
#### _Distribución de los elementos_
  En primera instancia se creó el diseño de la app para realizar las operaciones.
  Los elementos usados fueron, TextView,  EditText de tipo Number, Button  y checkbox para indicar la operación a realizar
  
![Screenshot 2022-10-21 151231](https://user-images.githubusercontent.com/81268917/197280955-f64bb137-be66-44d7-84d6-bf03d0e7825c.jpg)

  Para estos elementos se creó esta disposición de entrada, con dos campos de texto para el ingreso de los datos “A” y “B”, los checkbox de operaciones y dos con la opciones de seleccionar todas las operaciones y para quitar la selección de todas las opciones:
  
![Screenshot 2022-10-21 151327](https://user-images.githubusercontent.com/81268917/197281092-a4a9d222-83f0-4931-8abf-1bf86b68b1a6.jpg)

#### _Método de operación_

En la Clase principal, la MainActivity es la encargada de establecer la conexión lógica del programa, en este caso de declarar las variables 
por referencia hacia los elementos de la activity, y de esta forma establecer las operaciones para cada una de las opciones de los checkbox.

Por medio del método operation se realizan las operaciones de suma, resta, exponente y radicación entre los datos A y B y su resultado se 
visualizará en el TextView con el id txtV.
 
 Una vez finalizado el código, se le establece el atributo para el evento de onclick en el botón, con el fin de realizar el llamado el método _“operation”_.

#[**APK del proyecto**]: https://github.com/IAN63k/app-operaciones-checkbox-andorid-studio/blob/main/app-debug.apk
