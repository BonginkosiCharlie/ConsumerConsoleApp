# App - RabbitMQ Consumer  

## Overview  
This Java application demonstrates how to consume messages from a RabbitMQ queue. The application listens to a queue named `send-name-queue`, processes incoming messages, and prints a personalized response to the console.

---

## What It Does  
1. **RabbitMQ Connection**: Establishes a connection to a RabbitMQ server.  
2. **Queue Declaration**: Declares a queue named `send-name-queue`.  
3. **Message Consumption**: Listens for messages on the queue and processes them.  
4. **Message Parsing**: Extracts and formats the name from the message, then prints a message in the format:  
   `"Hello [Name], I am your father!"`.

---

## Example Usage  

### Prerequisites  
1. Install and configure RabbitMQ on your system.  
2. Ensure the queue `send-name-queue` exists in RabbitMQ.  
3. Publish a message to the queue with a payload format like:  
   `"id, John Doe"`.

### Running the Application  
1. Compile and run the application.  
2. When a message is published to the queue, the application will consume it and output a personalized message.  

### Example Message  
- **Input**: `"1, John Doe"`  
- **Output**:  
