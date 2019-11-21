# COUNTING SORT VS RADIX SORT

Este repositorio contiene la implementación(No la teoría) de los algoritmos de ordenamiento Counting Sort y Radix Sort ambos de complejidad O(n)

# Características

	-Tiene una interfaz simple 
	-Desarrollado en #Java 
	-No se requiere ningun tipo de jar(Api) para su uso
	-El repositorio contiene el executable del proyecto 
	-El proyecto pertenece al Curso de Algoritmica III

# ¿Como ejecutar el codigo?

	->Descargar el codigo en archivo .RAR 
	->Dirigirse hacia alguna IDE como Eclipse, NetBeans, etc.
	->Click en Archivo, dirigirse a IMPORTAR 
	->Buscar el folder descomprimido o sin descomprimir dependiendo de la IDE.
	->Si solo deseo ejecutar el codigo, ejecutar el programa.exe(tener en cuenta que debe tener instalado java en su ordenador) 

# ¿Como funciona?

La interfaz tiene 6 JTextArea de las cuales 1 recibe el tamaño del arreglo que queremos crear con data aleatoria.

Boton Crear-> Crea un arreglo de tamaño ya especificado en el JTextArea("Ingrese Tamaño") con valores aleatorios entre '0-1000'

	Ejemplo: Ingreso tamaño 5 y clickeo el boton 'Crear'-> (3)(58)(678)(34)(456) 

Boton Ordenar-> Empieza a llamar a los metodos radixSort() y countingSort() y asignar sus respectivos argumentos para ordenar el arreglo y posteriormente mostrar debajo del JLabel en el JTextArea el arreglo ordenado y al costado del JLabel el tiempo que demoro.

	Ejemplo: Counting Sort -> (3)(34)(58)(456)(678)    TIME: 345					

	Ejemplo: Radix Sort -> (3)(34)(58)(456)(678)    TIME: 234
