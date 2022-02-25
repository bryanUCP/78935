using System;
using WSDL.mensajes;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
        public string Saludar(string nombre)
        {
            string msj = "Hola "+nombre+", te saludad Bryan";
            return msj;
        }
        public string Mostrar(int id)
        {
            return "x";
        }
     }
}
