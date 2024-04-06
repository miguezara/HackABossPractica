package com.example.EjercicioGestionComida.controller;

import com.example.EjercicioGestionComida.model.Pedido;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    List<Pedido> pedidos = new ArrayList<>();
    AtomicLong idCounter = new AtomicLong();

    @PostMapping
    ResponseEntity<Void> realizarPedido(@RequestBody Pedido pedido) {
        pedido.setId(idCounter.incrementAndGet());
        pedidos.add(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> obtenerPedidoPorId(@PathVariable Long id) {
        Optional<Pedido> pedidoOptional = pedidos.stream().filter(p -> p.getId().equals(id)).findFirst();
        return pedidoOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
