package com.app.back;

import java.util.*;
import java.util.stream.Collectors;

public class ColeccionesMapper {

    private List<Usuario> lista = new ArrayList<>();
    private Set<Usuario> conjunto = new HashSet<>();
    private Map<String, Usuario> mapa = new HashMap<>();

    // Métodos para List
    public void agregarALista(Usuario usuario) {
        lista.add(usuario);
    }

    public void quitarDeLista(Usuario usuario) {
        lista.remove(usuario);
    }

    public void modificarEnLista(int indice, Usuario nuevoUsuario) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, nuevoUsuario);
        }
    }

    public void recorrerLista() {
        lista.forEach(System.out::println);
    }

    public int tamanoLista() {
        return lista.size();
    }

    public boolean contieneEnLista(Usuario usuario) {
        return lista.contains(usuario);
    }

    public boolean listaEstaVacia() {
        return lista.isEmpty();
    }

    public List<Usuario> filtrarListaPorMontoMayor(double monto) {
        return lista.stream().filter(u -> u.getMonto() > monto).collect(Collectors.toList());
    }

    public Usuario buscarMayorMontoEnLista() {
        return lista.stream().max(Comparator.comparing(Usuario::getMonto)).orElse(null);
    }

    public void ordenarListaPorNombre() {
        lista.sort(Comparator.comparing(Usuario::getNombre));
    }

    public double sumaMontosLista() {
        return lista.stream().mapToDouble(Usuario::getMonto).sum();
    }

    // Métodos para Set
    public void agregarASet(Usuario usuario) {
        conjunto.add(usuario);
    }

    public void quitarDeSet(Usuario usuario) {
        conjunto.remove(usuario);
    }

    public void recorrerSet() {
        conjunto.forEach(System.out::println);
    }

    public int tamanoSet() {
        return conjunto.size();
    }

    public boolean contieneEnSet(Usuario usuario) {
        return conjunto.contains(usuario);
    }

    public boolean setEstaVacio() {
        return conjunto.isEmpty();
    }

    public Set<Usuario> filtrarSetPorMontoMayor(double monto) {
        return conjunto.stream().filter(u -> u.getMonto() > monto).collect(Collectors.toSet());
    }

    public Usuario buscarMayorMontoEnSet() {
        return conjunto.stream().max(Comparator.comparing(Usuario::getMonto)).orElse(null);
    }

    public List<Usuario> ordenarSetPorNombre() {
        return conjunto.stream().sorted(Comparator.comparing(Usuario::getNombre)).collect(Collectors.toList());
    }

    public double sumaMontosSet() {
        return conjunto.stream().mapToDouble(Usuario::getMonto).sum();
    }

    // Métodos para Map
    public void agregarAMap(String clave, Usuario usuario) {
        mapa.put(clave, usuario);
    }

    public void quitarDeMap(String clave) {
        mapa.remove(clave);
    }

    public Usuario obtenerDeMap(String clave) {
        return mapa.get(clave);
    }

    public void recorrerMap() {
        mapa.forEach((clave, usuario) -> System.out.println(clave + ": " + usuario));
    }

    public int tamanoMap() {
        return mapa.size();
    }

    public boolean contieneClaveEnMap(String clave) {
        return mapa.containsKey(clave);
    }

    public boolean mapEstaVacio() {
        return mapa.isEmpty();
    }

    public List<Usuario> filtrarMapPorMontoMayor(double monto) {
        return mapa.values().stream().filter(u -> u.getMonto() > monto).collect(Collectors.toList());
    }

    public Usuario buscarMayorMontoEnMap() {
        return mapa.values().stream().max(Comparator.comparing(Usuario::getMonto)).orElse(null);
    }

    public List<Usuario> ordenarMapPorNombre() {
        return mapa.values().stream().sorted(Comparator.comparing(Usuario::getNombre)).collect(Collectors.toList());
    }

    public double sumaMontosMap() {
        return mapa.values().stream().mapToDouble(Usuario::getMonto).sum();
    }
}
