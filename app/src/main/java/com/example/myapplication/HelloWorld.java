package com.example.myapplication;

import io.javalin.Javalin;

public class    HelloWorld {
    public static void main() {
        Javalin app = Javalin.create();
        app.start(8080);
        app.get("/", ctx -> ctx.result("I like fat cock"));
    }
}
