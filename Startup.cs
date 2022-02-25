using System;
using System.Collections.Generic;
using System.Ling;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;

using WSDL.operaciones;
using WSDL.mensajes;
using SoapCore;
using Microsoft.Extensions.DependencyInjection.Extensions;

namespace soap_test
{
    public class Startup
    {

        public void ConfigureServices(IServiceCollection services)
        {
            services.TryAddSingleton<Mensajes, Operaciones>();
            services.AddMvc();
        }

        public void Configure(IApplicationBuilder app, IHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
               app.UseDeveloperExceptionPage();
               app.UseSoapEndpoint<Mensajes>("/soap.asmx",
                   new SoapEncoderOptions(),
                   SoapSerializer.XmlSerializer);
            }

            app.run(async (context) =>
            {
                 await context.Response.WriteAsync("Hello World!");
            });
         }
      }
}
