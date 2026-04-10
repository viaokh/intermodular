DROP TABLE IF EXISTS detalle_pedido;
DROP TABLE IF EXISTS productos_variante;
DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100),
    email VARCHAR(150) NOT NULL UNIQUE,
    rol_de_usuario VARCHAR(50) NOT NULL,
    contrasenya VARCHAR(255) NOT NULL,
    telefono VARCHAR(20),
    estado_usuario VARCHAR(50) NOT NULL,
    metodo_pago VARCHAR(50)
);

CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(150) NOT NULL,
    fabricante VARCHAR(100),
    id_categoria INT NOT NULL,
    descripcion VARCHAR(255),
    fecha_creacion DATE,
    descuento DECIMAL(5,2) DEFAULT 0,
    foto VARCHAR(255),
    precio DECIMAL(10,2) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    CONSTRAINT fk_productos_categoria
        FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE pedido (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    direccion_entrega VARCHAR(255),
    fecha_pedido DATE,
    estado VARCHAR(50) NOT NULL,
    CONSTRAINT fk_pedido_usuario
        FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE productos_variante (
    id_variante INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT NOT NULL,
    talla VARCHAR(20),
    color VARCHAR(50),
    stock INT NOT NULL DEFAULT 0,
    CONSTRAINT fk_productos_variante_producto
        FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

CREATE TABLE detalle_pedido (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio_comprado DECIMAL(10,2) NOT NULL,
    CONSTRAINT fk_detalle_pedido_pedido
        FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    CONSTRAINT fk_detalle_pedido_producto
        FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);