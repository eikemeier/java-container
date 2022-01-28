package com.example.hello_world;

public final class Main {
  private Main() {}

  public static void main(String... args) {
    System.out.printf("Hello, %s!%n", args.length > 0 ? args[0] : "World");
  }
}
