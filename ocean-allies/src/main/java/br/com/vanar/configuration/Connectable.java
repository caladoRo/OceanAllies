package br.com.vanar.configuration;

import java.sql.Connection;

public interface Connectable {
    Connection connect();
}
