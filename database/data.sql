INSERT INTO usuarios (nombre, apellido, email, rol_de_usuario, contrasenya, telefono, estado_usuario, metodo_pago)
VALUES
('Yasin', 'Mellouk', 'yasin@gmail.com', 'cliente', 'clave123', '600111222', 'activo', 'tarjeta'),
('Laura', 'Gomez', 'laura@gmail.com', 'cliente', 'clave456', '600333444', 'activo', 'paypal'),
('Admin', 'Sistema', 'admin@gmail.com', 'admin', 'admin123', '600555666', 'activo', 'transferencia');

INSERT INTO categoria (nombre_categoria, descripcion)
VALUES
('Zapatillas', 'Calzado deportivo y urbano'),
('Camisetas', 'Prendas superiores de vestir'),
('Pantalones', 'Prendas inferiores de vestir');

INSERT INTO productos (nombre_producto, fabricante, id_categoria, descripcion, fecha_creacion, descuento, foto, precio, estado)
VALUES
('Nike Air Max', 'Nike', 1, 'Zapatillas deportivas Nike Air Max', '2026-03-12', 10.00, 'nike_air_max.jpg', 120.99, 'activo'),
('Adidas Basic Tee', 'Adidas', 2, 'Camiseta básica de algodón', '2026-03-12', 5.00, 'adidas_basic_tee.jpg', 25.50, 'activo'),
('Levis 501', 'Levis', 3, 'Pantalón vaquero clásico', '2026-03-12', 15.00, 'levis_501.jpg', 79.95, 'activo');

INSERT INTO pedido (id_usuario, direccion_entrega, fecha_pedido, estado)
VALUES
(1, 'Calle Mayor 12, Alicante', '2026-03-12', 'pendiente'),
(2, 'Avenida Salamanca 45, Elche', '2026-03-12', 'pagado');

INSERT INTO productos_variante (id_producto, talla, color, stock)
VALUES
(1, '42', 'Blanco', 10),
(1, '43', 'Negro', 8),
(2, 'M', 'Azul', 20),
(2, 'L', 'Blanco', 15),
(3, '40', 'Vaquero Azul', 12);

INSERT INTO detalle_pedido (id_pedido, id_producto, cantidad, precio_comprado)
VALUES
(1, 1, 1, 120.99),
(1, 2, 2, 25.50),
(2, 3, 1, 79.95);