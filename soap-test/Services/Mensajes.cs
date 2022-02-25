using System;
using System.ServiceModel;

namespace WSDL.mesanjes
{
     [ServiceContract]
     public interface Mensajes
     {
         [OperationContract]
         string Saludar(string nombre);
         [OperationContract]
         string Mostrar(int id);
     }
}
