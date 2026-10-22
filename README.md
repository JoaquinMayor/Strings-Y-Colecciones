# Strings y Colecciones en Java

Proyecto de práctica del **Curso Java Base**. Reúne ejemplos de uso de la API de `String` y de las principales colecciones de Java (`List`, `Set` y `Map`), combinadas con la API de Streams y `Comparator`.

No es una aplicación terminada: es material de estudio con clases utilitarias que muestran las operaciones más comunes sobre cada tipo de colección.

## Tecnologías

- Java 17
- Maven (sin dependencias externas)
- IntelliJ IDEA (configuración del IDE en `.idea/`)

## Estructura del proyecto

```
colecciones/
├── pom.xml
└── src/main/java/com/app/back/
    ├── Main.java               # Punto de entrada (plantilla inicial de IntelliJ)
    ├── Usuario.java            # Modelo simple: nombre y monto
    ├── ColeccionesMapper.java  # Operaciones sobre List, Set y Map de Usuario
    └── StringUtilidades.java   # Muestra de los métodos más usados de String
```

### `Usuario`
Clase modelo con `nombre` y `monto`, getters/setters y `toString()`. Es el tipo de elemento que se guarda en las colecciones de `ColeccionesMapper`.

### `ColeccionesMapper`
Mantiene tres colecciones de `Usuario` y, para cada una, implementa el mismo conjunto de operaciones para poder compararlas:

| Operación | `List` (`ArrayList`) | `Set` (`HashSet`) | `Map<String, Usuario>` (`HashMap`) |
|---|---|---|---|
| Agregar | `agregarALista` | `agregarASet` | `agregarAMap(clave, usuario)` |
| Quitar | `quitarDeLista` | `quitarDeSet` | `quitarDeMap(clave)` |
| Modificar / obtener | `modificarEnLista(indice, usuario)` | — | `obtenerDeMap(clave)` |
| Recorrer | `recorrerLista` | `recorrerSet` | `recorrerMap` |
| Tamaño / vacío | `tamanoLista`, `listaEstaVacia` | `tamanoSet`, `setEstaVacio` | `tamanoMap`, `mapEstaVacio` |
| Contiene | `contieneEnLista` | `contieneEnSet` | `contieneClaveEnMap` |
| Filtrar por monto mayor | `filtrarListaPorMontoMayor` | `filtrarSetPorMontoMayor` | `filtrarMapPorMontoMayor` |
| Mayor monto | `buscarMayorMontoEnLista` | `buscarMayorMontoEnSet` | `buscarMayorMontoEnMap` |
| Ordenar por nombre | `ordenarListaPorNombre` (in place) | `ordenarSetPorNombre` (devuelve lista) | `ordenarMapPorNombre` (devuelve lista) |
| Suma de montos | `sumaMontosLista` | `sumaMontosSet` | `sumaMontosMap` |

### `StringUtilidades`
El método `mostrarFuncionalidades(String texto)` imprime por consola el resultado de aplicar al texto: `length`, `isEmpty`, `toUpperCase`, `toLowerCase`, `substring`, `contains`, `replace`, `startsWith`, `endsWith`, `indexOf`, `lastIndexOf`, `compareTo`, `trim`, `split` y `String.join`.

## Conceptos aplicados

- Diferencias entre `List` (orden e índices), `Set` (sin duplicados, sin orden) y `Map` (acceso por clave).
- Recorridos con `forEach` y referencias a métodos (`System.out::println`).
- Streams: `filter`, `max`, `sorted`, `mapToDouble(...).sum()` y `collect(Collectors.toList()/toSet())`.
- `Comparator.comparing(...)` para ordenar y buscar máximos.
- Uso de `Optional` con `orElse(null)`.
- Métodos principales de la clase `String`.

## Cómo ejecutarlo

Requisitos: JDK 17 y Maven.

```bash
# Compilar
mvn compile

# Ejecutar la clase Main
java -cp target/classes com.app.back.Main
```

También se puede abrir el proyecto en IntelliJ IDEA y ejecutar `Main` directamente.

> `Main` todavía contiene la plantilla generada por IntelliJ; para probar las colecciones o los métodos de `String` hay que instanciar `ColeccionesMapper` o `StringUtilidades` desde ahí.
