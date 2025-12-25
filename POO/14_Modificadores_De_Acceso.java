//14. Modificadores de acceso

public

private

protected

default (sin palabra)


Los modificadores de acceso en Java controlan qué partes del código pueden ver o usar una clase,
método o atributo:
public permite acceso desde cualquier parte del programa;
private restringe el acceso únicamente dentro de la misma clase, protegiendo los datos;
protected permite el acceso dentro del mismo paquete y también desde clases hijas aunque estén en otros paquetes; y el modificador
default (cuando no se escribe nada) permite el acceso solo dentro del mismo paquete, funcionando como un nivel intermedio de visibilidad entre public y private.