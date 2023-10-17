package com.chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.middleware.Middleware;
import com.middleware.RoleCheckMiddleware;
import com.middleware.ThrottlingMiddleware;
import com.middleware.UserExistsMiddleware;
import com.server.Server;

import javax.swing.JOptionPane;

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            String email = JOptionPane.showInputDialog("Enter email: ");
            String password = JOptionPane.showInputDialog("Input password: ");
            success = server.logIn(email, password);
        } while (!success);
    }
}
