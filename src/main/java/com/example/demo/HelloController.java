package com.example.demo;



import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // Basic greeting
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    
    
    // Basic greeting
    @GetMapping("/hellgog")
    public String saykHello() {
        return "Hello, Worlddd!";
    }
    
    

    // Personalized greeting using path variable
    @GetMapping("/hello/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Greeting using query parameter
    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Guest") String user) {
        return "Welcome, " + user + "!";
    }

    // POST request that responds with a confirmation
    @PostMapping("/submit")
    public String submitData(@RequestParam String data) {
        return "Data submitted: " + data;
    }

    // PUT method
    @PutMapping("/update")
    public String updateSomething(@RequestParam String item) {
        return "Updated item: " + item;
    }

    // DELETE method
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return "Deleted item with ID: " + id;
    }

    // Custom message
    @GetMapping("/status")
    public String getStatus() {
        return "Service is running smoothly!";
    }
}
