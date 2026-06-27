# Catan

A two-player, networked implementation of **Settlers of Catan** built in **Java** with a **JavaFX** interface. Players connect over a client-server architecture, take turns building towns and roads, roll for resources, and chat in real time — with full save/load support.

This started as a way to apply advanced Java concepts in a single, non-trivial project: TCP networking, multithreading, object serialization, RMI, JNDI, and reflection.

## Features

- **Two-player gameplay** — blue vs. red, turn-based, with dice rolls and resource collection
- **Networked multiplayer** — client-server model over TCP sockets; the full game board is serialized and synced between players
- **Real-time in-game chat** — implemented with **Java RMI**
- **Build mechanics** — towns and roads with rule validation (road connectivity, town proximity rule)
- **Resource system** — wood, brick, wheat, sheep, stone, and desert tiles
- **Win detection** — first player to reach the target points wins
- **Save / load** — game state persisted via Java object serialization
- **Cheat mode** — toggle for testing
- **Auto-generated documentation** — a reflection-based utility that walks the compiled classes and outputs an HTML overview of every class, method, and field

## Tech Stack

- **Language:** Java
- **UI:** JavaFX (FXML)
- **Networking:** Java TCP sockets (`Socket` / `ServerSocket`)
- **Concurrency:** Multithreading — a dedicated background thread runs the server accept loop, with `Platform.runLater` marshalling updates back onto the JavaFX UI thread
- **Serialization:** Java object serialization (network transfer + save/load); JavaFX nodes marked `transient`
- **RMI:** Java Remote Method Invocation for the chat service
- **JNDI:** Configuration values read via a JNDI file-system context
- **Reflection:** Custom HTML documentation generator

## Architecture

The app launches in one of two roles, chosen by command-line argument:

- **Server** — opens a `ServerSocket` on a background thread and listens for an incoming game board, restoring it onto the UI when received.
- **Client** — connects to the server and sends its serialized `GameBoard` after each relevant action.

Game state lives in a `GameBoard` model (players, tiles, dice, turn info). When a player acts, the updated board is serialized and pushed to the other instance, keeping both clients in sync. Chat runs independently over RMI.

## Getting Started

### Prerequisites
- JDK [17+ — confirm your version]
- JavaFX SDK [confirm version]
- [Maven, if applicable]

### Running

The application takes a player role as its first argument:

```bash
# Start as server
java -jar catan.jar SERVER

# Start as client
java -jar catan.jar CLIENT
```

> **Note:** Configuration (ports, host) is read from `conf.properties` via JNDI. Update the host/port values and the config path to match your setup before running.

### Configuration
Ports and host are defined in `NetworkConfiguration` and `conf.properties`:
- Server port: `1989`
- Client port: `1900`
- Host: `localhost`

## Screenshots

<img width="2040" height="1148" alt="catan" src="https://github.com/user-attachments/assets/eeb2241d-8629-441c-8513-cffaff3e5ace" />


