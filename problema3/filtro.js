// Datos de productos
const productos = [
    { nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./taco-negro.jpg" },
    { nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./taco-azul.jpg" },
    { nombre: "Bota negra", tipo: "bota", color: "negro", img: "./bota-negra.jpg" },
    { nombre: "Bota azul", tipo: "bota", color: "azul", img: "./bota-azul.jpg" },
    { nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./zapato-rojo.jpg" },
];

// Seleccion de elementos del DOM 
const listaProductos = document.getElementById("lista-de-productos");
const inputFiltro = document.querySelector('input[type="text"]');
const botonDeFiltro = document.querySelector("button");

//  Función para mostrar productos en la página 
function mostrarProductos(productosAMostrar) {
    // Limpiar la lista actual
    listaProductos.innerHTML = '';

    //  Recorrer y agregar los nuevos productos
    productosAMostrar.forEach(producto => {
        const divProducto = document.createElement("div");
        divProducto.classList.add("producto"); 
        const titulo = document.createElement("p");
        titulo.classList.add("titulo");
        titulo.textContent = producto.nombre;

        const imagen = document.createElement("img");
        imagen.setAttribute("src", producto.img);
        // Es bueno agregar texto alternativo a las imágenes por accesibilidad
        imagen.setAttribute("alt", producto.nombre);

        divProducto.appendChild(titulo);
        divProducto.appendChild(imagen);

        listaProductos.appendChild(divProducto);
    });
}

//  Función de filtrado 
const filtrar = (productos, texto) => {
    return productos.filter(item => item.tipo.includes(texto) || item.color.includes(texto));
};

//  Lógica del evento 
botonDeFiltro.onclick = function() {
    const textoDelInput = inputFiltro.value.toLowerCase(); 
    const productosFiltrados = filtrar(productos, textoDelInput);
    mostrarProductos(productosFiltrados);
};

//  Mostrar todos los productos al cargar la página inicialmente 
mostrarProductos(productos);