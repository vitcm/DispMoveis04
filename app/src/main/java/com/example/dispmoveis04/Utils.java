package com.example.dispmoveis04;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Person> getPreCadastrados() {
        List<Person> preCadastrados = new ArrayList<>();

        // Dados pré-cadastrados para ilustração
        preCadastrados.add(new Person("João da Silva", "123.456.789-00", "01/01/1990", "(11) 1234-5678", "(11) 98765-4321", "joao@example.com"));
        preCadastrados.add(new Person("Maria Souza", "987.654.321-00", "10/05/1985", "(21) 9876-5432", "(21) 1234-5678", "maria@example.com"));
        preCadastrados.add(new Person("José Oliveira", "456.789.123-00", "05/12/1978", "(31) 7654-3210", "(31) 4321-8765", "jose@example.com"));

        return preCadastrados;
    }
}