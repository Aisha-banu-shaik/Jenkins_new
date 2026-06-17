
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // ✅ HOME PAGE
    @GetMapping("/")
    public String home() {
        return """
        <html>
        <head>
            <title>Flower Shop</title>
            <style>
                body { font-family: Arial; margin: 0; text-align: center; }
                nav { background: #ff4d6d; padding: 15px; }
                nav a {
                    color: white;
                    margin: 15px;
                    text-decoration: none;
                    font-weight: bold;
                }
            </style>
        </head>
        <body>

            <nav>
                <a href="/">Home</a>
                <a href="/gallery">Gallery</a>
                <a href="/products">Products</a>
                <a href="/about">About</a>
                <a href="/contact">Contact</a>
            </nav>

            <h1>🌸 Welcome to Flower Shop 🌸</h1>
            <p>Fresh flowers for every occasion</p>

        </body>
        </html>
        """;
    }

    // ✅ GALLERY PAGE
    @GetMapping("/gallery")
    public String gallery() {
        return """
        <html>
        <body style='text-align:center'>
            <h2>🌼 Flower Gallery</h2>

            <img src="https://images.pexels.com/photos/931177/pexels-photo-931177.jpeg" width="250"/>
            <img src="https://images.pexels.com/photos/1395964/pexels-photo-1395964.jpeg" width="250"/>
            <img src="https://images.pexels.com/photos/1366913/pexels-photo-1366913.jpeg" width="250"/>

            <br><br>
            <a href="/">⬅ Back to Home</a>
        </body>
        </html>
        """;
    }

    // ✅ PRODUCTS PAGE
    @GetMapping("/products")
    public String products() {
        return """
        <html>
        <body style='text-align:center'>
            <h2>🌹 Products</h2>

            <ul>
                <li>Roses Bouquet - ₹499</li>
                <li>Wedding Bouquet - ₹1499</li>
                <li>Birthday Flowers - ₹799</li>
                <li>Premium Mix - ₹999</li>
            </ul>

            <a href="/">⬅ Back to Home</a>
        </body>
        </html>
        """;
    }

    // ✅ ABOUT PAGE
    @GetMapping("/about")
    public String about() {
        return """
        <html>
        <body style='text-align:center'>
            <h2>About Us</h2>
            <p>We deliver fresh flowers across India 🌸</p>

            <a href="/">⬅ Back to Home</a>
        </body>
        </html>
        """;
    }

    // ✅ CONTACT PAGE
    @GetMapping("/contact")
    public String contact() {
        return """
        <html>
        <body style='text-align:center'>
            <h2>Contact Us</h2>
            <p>Email: flowershop@gmail.com</p>
            <p>Phone: +91 9876543210</p>

            <a href="/">⬅ Back to Home</a>
        </body>
        </html>
        """;
    }
}