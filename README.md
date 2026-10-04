# Assignment 3 – Bridge Pattern

## Description
This project demonstrates the Bridge Design Pattern in Java.

The example uses two independent hierarchies:
- Shape abstraction: Circle, Square
- Renderer implementation: VectorRenderer, RasterRenderer

The Bridge pattern connects Shape and Renderer using composition instead of inheritance.

## Project Structure

- Renderer – Implementor interface
- VectorRenderer – Concrete Implementor
- RasterRenderer – Concrete Implementor
- Shape – Abstraction
- Circle – Refined Abstraction
- Square – Refined Abstraction
- Main – Client class

## Runtime Switching

The renderer can be changed at runtime using:

```java
shape.setRenderer(renderer);