const http = require('http')
http.createServer((req, res) => {
    if (req.url === '/pago'){
        res.write("Pago completado")
        return res.end()
    }
    res.write("Hola desde el servidor")
    res.end()
}).listen(3000)
console.log("Servidor esta corriendo en el puerto 3000")