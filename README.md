# Java Client-Server Chat Application

This is a simple client-server chat application written in Java using sockets. It allows multiple clients to connect to a server and exchange messages in a group chat.

## Features

- **Server**:
    - Listens for incoming client connections.
    - Creates a new thread for each connected client.
    - Broadcasts messages from one client to all other connected clients.

- **Client**:
    - Connects to the server.
    - Sends messages to the server.
    - Receives messages from the server and displays them.

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/chat-application.git
   ```

2. Navigate to the project directory:

   ```bash
   cd chat-application
   ```

3. Compile the Java files:

   ```bash
   javac *.java
   ```

## Usage

1. Start the server by running the `Server` class:

   ```bash
   java Server
   ```

   The server will start listening for client connections on port `1234`.

2. Start multiple instances of the client by running the `Client` class:

   ```bash
   java Client
   ```

   Each client will prompt you to enter a username. Enter a unique username for each client.

3. Once connected, you can start sending and receiving messages in the chat.
