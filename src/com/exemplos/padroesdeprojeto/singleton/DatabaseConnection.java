package com.exemplos.padroesdeprojeto.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Construtor privado para evitar instanciamento externo
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado ao banco de dados.");
    }

    public void disconnect() {
        System.out.println("Desconectado do banco de dados.");
    }
}
