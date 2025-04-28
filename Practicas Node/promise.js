const {promisify} = require('util')
function pedirPizzaCallback(callback){
    console.log('Pedido de pizza realizado. Esperando la pizza...');
    setTimeout(()=>{
        let exito = true;
        if(exito){
            callback('Pizza entregada...Disfruta de tu pizza!');
        }else{
            callback('Hubo un problema con tu pedido');
        }
    },3000);
}
const pedirPizza = promisify(pedirPizzaCallback)
async function pedirPizzaAwait(){
    try{
        const mensajeExito = await pedirPizza()
        console.log (mensajeExito)
    }catch(mensajeError){
        console.log(mensajeError)
    }
}
pedirPizzaAwait();
